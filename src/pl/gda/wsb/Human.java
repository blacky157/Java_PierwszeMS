package pl.gda.wsb;

public class Human {
    String first_name;
    String last_name;
    String position;
    double salary;
    Animal pet;
    Car car;

    public Human(String first_name, String last_name, String position, double salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.salary = salary;
    }
}
