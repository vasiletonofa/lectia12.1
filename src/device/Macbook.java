package device;

public abstract class Macbook extends Calculator {
    @Override
    public void getPrice() {
        System.out.println("1000$");
    }

    @Override
    public String getMarca() {
        return null;
    }
}
