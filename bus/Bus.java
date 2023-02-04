package Q.bus;

public class Bus extends Transport {

    public Bus(int number) {
        this.number = number;
        System.out.println(number + "번 버스객체 만들어짐!");

        minpeople = 0;
        maxpeople = 30;
        money = 1500;
        oil = 100;
        state = "운행중";
        state1 = "차고지행";
    }

    @Override
    boolean drive() {
        state = "운행중";
        return true;
    }

    @Override
    void setState() {
        if (this.minpeople == 30) {
            System.out.println("최대 승객 수를 초과했습니다.");
            System.out.println("요금 확인 = " + money);
            System.out.println("상태 : " + state1);
        }
    }

    @Override
    void setPeople() {
        this.minpeople += minpeople;
        System.out.println("현재 탑승자 수 = " + this.minpeople);
        this.maxpeople += maxpeople;
        System.out.println("잔여 탑승자 수 = " + (this.maxpeople - this.minpeople));
        this.minpeople += minpeople;
    }

    @Override
    void setOil() {
        if (oil <= 10) {
            System.out.println("주유가 필요합니다");
            System.out.println("상태 : " + state1);
        }
    }
}




