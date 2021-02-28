package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        Human human1 = new Human("michal", "strupinski","automatyk",5000);
        Human human2 = new Human("krzysztof", "wilk","programista",10000);
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
            System.out.println(phone1.model +" jest młodszy od "+phone2.model+" jego rok produkcji to "+phone1.rok_produkcji);
        }
        else{
            System.out.println(phone2.model +" jest młodszy od "+phone1.model+" jego rok produkcji to "+phone2.rok_produkcji);
        }



    }


}
