package com.Lesson6;

public class Cat extends Animal {
    private static int id;

    public Cat(String name) {
        super(name);
        setRuningRestirictions(200);
        setSwimingRestirictions(0);
        id++;
    }

    public static int getId() {
        return id;
    }

    @Override
    public void getVoice() {
        System.out.println("Meou");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim");
    }


}
