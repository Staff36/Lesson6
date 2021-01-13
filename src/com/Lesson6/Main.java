package com.Lesson6;


public class Main {

    public static void main(String[] args) {
        testClasses();
    }
    public static void testClasses(){

        Animal durka = new Cat("Durka");
        Animal bob = new Dog("Bob");
        Animal murka = new Cat("Murka");



        System.out.println("Testing a dog class");
        bob.run(100);
        bob.swim(9);
        bob.run(501);
        bob.swim(15);
        System.out.println();

        System.out.println("\nTesting a cat class");
        murka.swim(100);
        murka.run(100);
        durka.run(201);

        System.out.println("\n"+Animal.getId()+" Animals were created");
        System.out.println(Cat.getId()+" Cats were created");
        System.out.println(Dog.getId()+" Dogs were created");




    }

}

