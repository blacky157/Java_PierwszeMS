package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.Objects;

public class Human {
    String first_name;
    String last_name;
    String position;
    private double salary;
    Animal pet;
    private Car car;
    Double cash;

    public Human(String first_name, String last_name, String position, Double salary, Double cash) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.salary = salary;
        this.cash = cash;
    }
    public boolean hasCar (Car newCar) {
        if (this.car == newCar) {
            return true;
        }
        else return false;
    }
    public void removeCar(){
        this.car = null;
    }



    public Double getCash() {
        return cash;
    }



    public void setCash(Double cash) {
        this.cash = cash;
    }

    public double getSalary() {

        System.out.println("dane pobrano: " +new Date());
        return salary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPosition() {
        return position;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
       if(salary >car.getWartosc()) {
           System.out.println("Kupujesz auto za gotówkę");
           this.car = car;
       }
       else if (salary * 12 > car.getWartosc()){
           System.out.println("Kupiłeś, ale na kredyt. Bywa");
           this.car = car;
       }
       else System.out.println("nie masz siana, leć po podwyżkę");

    }

    public void setSalary(double salary) {
        if (salary < 0) System.out.println("Chyba lekko przesadzasz, co ?");
        else {
            System.out.println(first_name+" "+last_name+ " będzie teraz zarabiał: "+salary);
            this.salary = salary;
            System.out.println("przekazano dane do księgowości");
            System.out.println("Pani Hania czeka na odebranie aneksu");
            System.out.println("Nowy dochód został zgłoszony do ZUS i US");
        }





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
