package src.main.java.localhost.toilet;
public class Piss {
    private int pressure;
    private String ownerName;

    public Piss(int pressure, String ownerName) {
        this.pressure = pressure;
        this.ownerName = ownerName;
    }

    private void squirt() {
        System.out.println(ownerName + " is squirting");
    }
    private void flush() {
        System.out.println("wshwssshwshwsh");
    }

    public void urinate() {
        squirt();
        flush();
    }
}