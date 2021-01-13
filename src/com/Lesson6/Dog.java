package com.Lesson6;

public class Dog extends Animal {
    private static int id=0;

    public Dog(String name) {
        super(name);
        setRuningRestirictions(500);
        setSwimingRestirictions(10);
        id++;
        }

    public static int getId() {
        return id;
    }

    @Override
    public void getVoice() {
        System.out.println("Woof");
    }

}
