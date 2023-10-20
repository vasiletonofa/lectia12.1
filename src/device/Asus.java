package device;

public class Asus extends Calculator {
    @Override
    public void getPrice() {
        System.out.println("500$");
    }

    @Override
    public String getMarca() {
        return null;
    }
}
