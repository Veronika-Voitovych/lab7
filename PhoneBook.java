import java.util.HashMap;
import java.util.Map;


public class PhoneBook {
    public static void main(String[] args)
    {
        Map<String, String> phoneBook = new HashMap<>();

        // Додавання записів у книгу
        phoneBook.put("Lucy", "228456389");
        phoneBook.put("Ron", "443654351");
        phoneBook.put("Lisa", "756789823");
        phoneBook.put("Michael", "381654957");
        phoneBook.put("Jessica", "6896123486");
        phoneBook.put("Alan", "554987324");
        phoneBook.put("Bob", "247258367");
        phoneBook.put("Sandy", "269552144");
        phoneBook.put("Taylor", "252369144");
        phoneBook.put("Ihor", "858369127");

        // Виведення інформації з книги
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Ім'я: " + entry.getKey() + ", Номер телефону: " + entry.getValue());
        }

        // Пошук номеру за ім'ям
        String firstName = "Trevor";
        if (phoneBook.containsKey(firstName)) {
            String phoneNumber = phoneBook.get(firstName);
            System.out.println("Номер телефону для імені " + firstName + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Видалення запису з книги
        phoneBook.remove("Brown");

        // Виведення кількості записів у книзі
        int size = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + size);

    }
}
