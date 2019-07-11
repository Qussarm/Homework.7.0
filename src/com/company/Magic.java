package com.company;



public class Magic extends Player  implements SuperPower{

    private int magicalHit;



    public Magic(int health, int hit) {

        super.setHealth(health);

        super.setHit(hit);

    }



    public void printInfo() {

        System.out.println(super.getHealth() + ";" + super.getHit() + ";Применение Способности rage " + getMagicalHit()+" урона");

    }



    public int getMagicalHit() {

        return magicalHit;

    }



    public void setMagicalHit(int magicalHit) {

        this.magicalHit = magicalHit;

    }



    public void magicalHit() {

        super.setHit(super.getHit()+magicalHit);

    }



    @Override

    public void Voice() {

        System.out.println("За стратхольм");

    }





    @Override
    public void rage() {
        setMagicalHit(60);

    }
}