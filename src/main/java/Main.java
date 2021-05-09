import zad2.Animal;
import zad2.Human;
import zad2.Phone;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("-- ZADANIE 1 ---");
        System.out.println("Hello world! :)");

        for (String arg : args) {
            System.out.println(String.format("Arg: %s", arg));
        }

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Aktualna data: "+localDateTime);

        zadanie2();
        zadanie3();
        zadanie4();
    }

    static void zadanie2(){
        System.out.println("-- ZADANIE 2 ---");
        Human human = new Human("Maciej", "Marcinkowski", 420);
        Human human1 = new Human("Jan", "Kolanko", 90);

        humanList.add(human);
        humanList.add(human1);

        System.out.println(human);
        System.out.println(human1);

        Animal animal = new Animal("mammal", "red", 10,70);
        Animal raptile = new Animal("raptile", null, 15,9);

        System.out.println(animal);
        System.out.println(raptile);

        Phone apple = new Phone(11221, "12", "Apple",1);
        Phone phone = new Phone(21321, "S21", "Samsung",2);

        System.out.println(apple);
        System.out.println(phone);
    }

    static void zadanie3(){
        System.out.println("-- ZADANIE 3 ---");
        StringBuilder animalSb = new StringBuilder();
        animalSb.append("Gruba zwierzyna to: ");

        Animal animal1 = new Animal("random3", "red", 10, 90);
        Animal animal2 = new Animal("random2", "red", 10, 200);

        Animal fatAnimal = animal1.weight > animal2.weight ? animal1:animal2;
        animalSb.append(fatAnimal);
        System.out.println(animalSb);

        Phone s21 = new Phone(11234, "S21", "Samsung", 1500);
        Phone s20 = new Phone(11234, "S20", "Samsung", 1000);

        Phone expensivePhone = s21.price > s20.price? s21:s20;
        System.out.println("Drozszy telefon to: "+expensivePhone);
    }

    static void zadanie4(){
        System.out.println("-- ZADANIE 4 ---");
        humanList.add(new Human("Piotr","Chorazy",60));
        humanList.forEach(System.out::println);
        humanList.add(new Human("NowyZiomek","Po Ponownym Uruchomieniu",10));
        humanList.forEach(System.out::println);
    }
}
