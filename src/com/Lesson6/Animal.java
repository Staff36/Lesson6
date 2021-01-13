package com.Lesson6;

public abstract class Animal {
    private static int id;
    private   String name;
    private  int runingRestirictions;
    private int swimingRestirictions;

    public static int getId() {
        return id;
    }

    public abstract void getVoice();

    protected void setRuningRestirictions(int runingRestirictions) {
        this.runingRestirictions = runingRestirictions;
    }

    protected void setSwimingRestirictions(int swimingRestirictions) {
        this.swimingRestirictions = swimingRestirictions;
    }

    public Animal(String name) {
        this.name=name;
        id++;
    }
    public void run(int distance) {
        writeActivity(distance,runingRestirictions,"ran");
    }

    public void swim(int distance) {
        writeActivity(distance,swimingRestirictions,"swam");
    }

    private void writeActivity(int distance, int restriction, String activity) {
        if (distance < restriction) System.out.printf("Еру %s is %s %d meters \n",this.name,activity,distance);
        else System.out.println("This distance to long");
    }

}
