package example;

public class Worker {
    String name;
    String work;
    int salary;

    public Worker() {
        this.name = "John";
        this.work = "Intern";
        this.salary = 10_000;
    }

    public Worker(String name, String work, int salary) {
        this.name = name;
        this.work = work;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Имя работника: " + this.name +
                "\nДолжность: " + this.work +
                "\nЗарплата: " + this.salary);
    }

}
