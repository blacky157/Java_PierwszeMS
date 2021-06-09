package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Double.compare(human.salary, salary) == 0 && Objects.equals(first_name, human.first_name) && Objects.equals(last_name, human.last_name) && Objects.equals(position, human.position) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, position, salary, pet, car);
    }

    @Override
    public String toString() {
        return "Human{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
