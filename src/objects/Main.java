package objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vin = scanner.nextLine();
        scanner.close();

        Car[] cars = {
                new Car("Toyota", "Camry", "А123ВС62", "VIN001"),
                new Car("BMW", "X5", "В456ОР77", "VIN002"),
                new Car("Mercedes-Benz", "E-Class", "С789КМ99", "VIN003"),
                new Car("Lada", "Vesta", "А123ВС62", "VIN004"),
                new Car("Audi", "A6", "Е321НТ78", "VIN005"),
                new Car("Kia", "K5", "М654АА62", "VIN006"),
                new Car("Hyundai", "Solaris", "В456ОР77", "VIN007"),
                new Car("Volkswagen", "Polo", "Т987УХ50", "VIN008"),
                new Car("Skoda", "Octavia", "С789КМ99", "VIN009"),
                new Car("Toyota", "Corolla", "О111ОО62", "VIN010")
        };

        /*Car car1 = new Car("Toyota", "Camry", "А123ВС62", "VIN001");
        Car car2 = new Car("BMW", "M5", "А123ВС62", "VIN999");
        Car car3 = new Car("BMW", "X5", "А123ВС62", "VIN001");*/

        getCar(cars, vin);
    }

    public static void getCar(Car[] cars, String vin) {
        for (Car element : cars) {
            if (element.getVin().equals(vin)) {
                System.out.println(element);
                return;
            }
        }
        System.out.println("Машина не найдена");
    }
}
