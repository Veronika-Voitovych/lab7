import java.util.ArrayList;


public class Main {
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<>();

        // Створення об'єктів автомобілів
        cars.add(new Car("Renault", 130, new Driver("Sam", 31, 4), 18000, 2016));
        cars.add(new Car("BMW", 160, new Driver("Luca", 22, 3), 7000, 2013));

        Car a = cars.get(1);
        System.out.println(a);
        System.out.println(a.getBrand());
        // Ремонт автомобілів

        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            car.repairEngine();
            Driver newDriver = new Driver("New Driver", 24, 2); // Новий водій
            car.hireDriver(newDriver);
        }

        // Зміна потужності та ціни кожної другої машини
        for (int i = 0; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            car.increasePowerAndPrice();
        }

        // Перевірка досвіду водіїв та відправлення на курси підвищення кваліфікації
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.increaseExperience();
            }
        }

    }
}