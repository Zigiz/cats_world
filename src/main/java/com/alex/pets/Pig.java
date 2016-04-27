package com.alex.pets;

import com.alex.plants.Flower;

public class Pig extends Pet implements Alive {

    private String name;
    private String breed;

    public Pig(String someName, String breed) {
        this.name = someName;
        this.breed = breed;
    }

    public void hryukat() {
        if (isAlive) {
            System.out.println("Pig " + name + " is hryukaet");
        } else {
            System.out.println(";(");
        }
    }

    public void swimming() {
        if (isAlive) {
            System.out.println("Pig " + name + " is swimming v gryazi");
        } else {
            System.out.println(";(");
        }
    }

    public void zhratb() {
        if (isAlive) {
            System.out.println("Pig " + name + " is zhret");
        } else {
            System.out.println(";(");
        }
    }

    public void eat(Flower flower) {
        if (isAlive) {
            System.out.println("Congratulations! " + getName() + " eat flower!");
            flower.giveAura(this);
        } else {
            System.out.println("The dead do not eat");
        }
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Pig " + name;
    }

    public String getBreed() {
        return breed;
    }

}