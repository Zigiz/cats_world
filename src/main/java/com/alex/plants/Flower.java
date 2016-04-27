package com.alex.plants;

import com.alex.pets.Pet;

import java.util.Objects;

public class Flower {
    protected String breed;

    public Flower(String breed) {
        super();
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void giveAura(Object object) {
        if (object instanceof Pet){
            Pet pet = (Pet) object;
            System.out.println("Flower give aura" + object.toString());
            pet.giveaura();
        }else{
            System.out.println("Nope!");
        }
    }
}
