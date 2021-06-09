package pl.gda.wsb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        Car car1 = new Car(Producer.Citroen,"C5",2010);

        Human human1 = new Human("michal", "Strupinski","automatyk",5000);
        Human human2 = new Human("krzysztof", "Wilk","programista",10000);
        Human human3 = new Human("Piotr", "Nowicki","kasjer",2000);
        Human human4 = new Human("Piotr", "Nowicki","kasjer",2000);
        human1.car= car1;

        System.out.println(human1.first_name +" "+human1.last_name);

        Animal animal1 = new Animal("lew", "kotowate","ssaki",10,60);
        Animal animal2 = new Animal("pies","psowate","ssaki",12,20);
        System.out.println(animal1.gatunek+" "+animal1.waga);
        Phone phone1 = new Phone("xiaomi","mi mix 3",2018);
        Phone phone2 = new Phone("samsung","galaxy s10",2016);

        System.out.println(phone1.model);
        if(animal1.waga>animal2.waga)
            {
                System.out.println(animal1.gatunek+" jest cięższy i waży "+animal1.waga);
            }
        else {
                System.out.println(animal2.gatunek + " jest cięższy i waży " + animal2.waga);
             }
        if(human1.salary> human2.salary)
        {
            System.out.println(human1.first_name+" zarabia wiecej - "+human1.salary);
        }
        else {
            System.out.println(human2.first_name+" zarabia wiecej - "+human2.salary);
        }
        if(phone1.rok_produkcji>phone2.rok_produkcji)
        {
            //System.out.println(phone1.model +" jest młodszy od "+phone2.model+" jego rok produkcji to "+phone1.rok_produkcji);
            StringBuilder phonedesc = new StringBuilder(phone1.model);
            phonedesc.append(" jest młodszy od ");
            phonedesc.append(phone2.model);
            phonedesc.append(" jego rok produkcji to ");
            phonedesc.append(phone2.rok_produkcji);
            System.out.println(phonedesc);
        }
        else{
           // System.out.println(phone2.model +" jest młodszy od "+phone1.model+" jego rok produkcji to "+phone2.rok_produkcji);
            StringBuilder phonedesc = new StringBuilder(phone2.model);
            phonedesc.append(" jest młodszy od ");
            phonedesc.append(phone1.model);
            phonedesc.append(" jego rok produkcji to ");
            phonedesc.append(phone1.rok_produkcji);
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
        System.out.println("Auto " + human1.first_name+ "a " + human1.car.producer + " " + human1.car.model+" " +human1.car.rok_produkcji );

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



    }


}
