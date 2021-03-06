package com.alex.pets;

public class Pantera extends Pet implements Alive {

    private String name;
    private String breed;
    private String color;

    public Pantera(String someName, String breed, String color) {
        super();
        this.name = someName;
        this.breed = breed;
        this.color = color;
    }

    public void attack() {
        if (isAlive) {
            System.out.println("Pantera " + name + " is attack");
        } else {
            System.out.println("-_- RIP");
        }
    }

    public void eat(Object object) {
        if (isAlive) {
            System.out.println("Pantera " + name + " eat " + object);
        } else {
            System.out.println("-_- RIP");
        }
    }

    public void hunt() {
        if (isAlive) {
            System.out.println("Pantera " + name + " is hunting");
        } else {
            System.out.println("-_- RIP");
        }
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Pantera " + name;
    }

}