package com.alex.pets;

public class Raccoon extends Pet implements Alive {
    public String name;
    public String breed;

    public Raccoon(String someName, String breed) {
        super();
        this.name = someName;
        this.breed = breed;
    }

    public void rinsing() {
        if (isAlive) {
            System.out.println("Raccoon " + name + " is rinsing sock");
        } else {
            System.out.println(":(");
        }
    }

    public void steal() {
        if (isAlive) {
            System.out.println("Raccoon " + name + " is steal food");
        } else {
            System.out.println(":(");
        }
    }

    public void play() {
        if (isAlive) {
            System.out.println("Raccoon " + name + " is playing");
        } else {
            System.out.println(":(");
        }
    }

    public void smells() {
        if (isAlive) {
            System.out.println("All ok!");
        } else {
            System.out.println("Raccoon " + name + " bad smells(");
        }
    }

    public String getName() {
        return name;
    }


    public String getBreed() {
        return breed;
    }

    public String toString() {
        return "Raccoon " + name;
    }
}