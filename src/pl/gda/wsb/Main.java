package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        Car car1 = new Car(Producer.Citroen,"C5",2010, 27000);
        Car car2 = new Car(Producer.Seat,"Toledo",2000, 3000);
        Car car3 = new Car(Producer.Skoda,"Superb",2021, 300000);


        Human human1 = new Human("michal", "Strupinski","automatyk",5000);
        Human human2 = new Human("krzysztof", "Wilk","programista",10000);
        Human human3 = new Human("Piotr", "Nowicki","kasjer",2000);
        Human human4 = new Human("Piotr", "Nowicki","kasjer",2000);
        human1.setCar(car1);


        System.out.println(human1.first_name +" "+human1.last_name);

        Animal animal1 = new Animal("lew", "kotowate","ssaki",10,60);
        Animal animal2 = new Animal("pies","psowate","ssaki",12,20);
        System.out.println(animal1.gatunek+" "+animal1.waga);
        Phone phone1 = new Phone("xiaomi","mi mix", 2018, Producer.Kia);
        Phone phone2 = new Phone("samsung","galaxy s10",2016,Producer.Kia);

        System.out.println(phone1.getModel());
        if(animal1.waga>animal2.waga)
            {
                System.out.println(animal1.gatunek+" jest cięższy i waży "+animal1.waga);
            }
        else {
                System.out.println(animal2.gatunek + " jest cięższy i waży " + animal2.waga);
             }
//        if(human1.getSalary()> human2.getSalary())
//        {
//            System.out.println(human1.first_name+" zarabia wiecej - "+human1.getSalary());
//        }
//        else {
//            System.out.println(human2.first_name+" zarabia wiecej - "+human2.getSalary());
//        }
        if(phone1.getRok_produkcji()>phone2.getRok_produkcji()  )
        {
            //System.out.println(phone1.model +" jest młodszy od "+phone2.model+" jego rok produkcji to "+phone1.rok_produkcji);
            StringBuilder phonedesc = new StringBuilder(phone1.getModel());
            phonedesc.append(" jest młodszy od ");
            phonedesc.append(phone2.getModel());
            phonedesc.append(" jego rok produkcji to ");
            phonedesc.append(phone2.getRok_produkcji());
            System.out.println(phonedesc);
        }
        else{
           // System.out.println(phone2.model +" jest młodszy od "+phone1.model+" jego rok produkcji to "+phone2.rok_produkcji);
            StringBuilder phonedesc = new StringBuilder(phone2.getModel());
            phonedesc.append(" jest młodszy od ");
            phonedesc.append(phone1.getModel());
            phonedesc.append(" jego rok produkcji to ");
            phonedesc.append(phone1.getRok_produkcji());
            System.out.println(phonedesc);
        }


        ArrayList<Human> humanlist= new ArrayList<>();
        humanlist.add(human1);
        humanlist.add(human2);
        for (Human human: humanlist){
            System.out.println(human.first_name);
        }

//        animal2.feed();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.take_for_a_walk();
//        animal2.feed();
        System.out.println("Auto " + human1.first_name+ "a " + human1.getCar().getProducer() + " " + human1.getCar().getModel()+" " +human1.getCar().getRok_produkcji() );

       if (human3.equals(human4)) {
           System.out.println("Wynik porównania == True");
       }
       else{
           System.out.println("Wynik porównania == FALSE");
       }
       System.out.println(human1);
       System.out.println(animal1);
       System.out.println(phone1);
       System.out.println(human3);
       System.out.println(human4);

        System.out.println(human1.first_name+" "+human1.last_name+" zarabia: "+human1.getSalary());
        System.out.println(human2.first_name+" "+human2.last_name+" zarabia: "+human2.getSalary());

       human1.setSalary(6000);
       human2.setSalary(-200);
       System.out.println(human2.getFirst_name()+" "+ human2.getLast_name() +" twoje auto to: " +human2.getCar());
       human2.setCar(car3);
       System.out.println(human2.getFirst_name()+" "+ human2.getLast_name() +" twoje auto to: " +human2.getCar());

       System.out.println(human2.getFirst_name()+" "+ human3.getLast_name() +" twoje auto to: " +human3.getCar());
       human3.setCar(car2);
       human3.setSalary(3100);
       human3.setCar(car2);
       System.out.println(human2.getFirst_name()+" "+ human3.getLast_name() +" twoje auto to: " +human3.getCar());
       car1.turnOn();
       phone1.turnOn();
    }


}
