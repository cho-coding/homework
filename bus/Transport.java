package Q.bus;

public abstract class Transport {
    int number;
    int money;
    int minpeople;
    int maxpeople;
    int oil;
    String state = "운행중";
    String state1 = "차고지행";


    abstract boolean drive();
    abstract void setState();
    abstract void setPeople();
    abstract void setOil();
}
