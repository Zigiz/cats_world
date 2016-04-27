package com.alex.pets;

public class Pet implements Alive {

    protected boolean isAlive;
    protected boolean isAura;

    public Pet() {
        this.isAlive = true;
        this.isAura = false;
    }


    public void kill() {
        this.isAlive = false;
    }

    public void giveaura() {
        this.isAura = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

}
