package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        Human human1 = new Human("michal", "strupinski","automatyk",5000);
        System.out.println(human1.first_name +" "+human1.last_name);
        Animal animal1 = new Animal("lew", "kotowate","ssaki",10);
        System.out.println(animal1.gatunek);
        Phone phone1 = new Phone("xiaomi","mi mix 3",2018);
        System.out.println(phone1.model);
    }


}
