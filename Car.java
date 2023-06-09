public class Car {
    private String brand;
    private int enginePower;
    private Driver driver;
    private double price;
    private int year;

    public Car(String brand, int enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void repairEngine() {
        enginePower += enginePower * 0.1; // Збільшення потужності на 10%
    }

    public void hireDriver(Driver newDriver) {
        driver = newDriver;
    }

    public void increasePowerAndPrice() {
        enginePower += enginePower * 0.1; // Збільшення потужності на 10%
        price += price * 0.05; // Збільшення ціни на 5%
    }
}
