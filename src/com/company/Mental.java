package com.company;



public class Mental extends Player implements SuperPower {

    private int kineticHit;

    public Mental(int health, int hit) {

        super.setHealth(health);

        super.setHit(hit);

    }


    public void printInfo() {

        System.out.println(super.getHealth() + ";" + super.getHit() + ";Применение Способности rage " + getKineticHit()+" урона");

    }

    public int getKineticHit() {

        return kineticHit;

    }



    public void setKineticHit(int kineticHit) {

        this.kineticHit = kineticHit;

    }



    public void kineticHit() {

        super.setHit(super.getHit()+kineticHit);

    }



    @Override

    public void Voice() {

        System.out.println("Бум");

    }

    @Override
    public void rage() {
        setKineticHit(60);
        }

    }
