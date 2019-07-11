package com.company;



public class Main {



    public static void main(String[] args) {

        Boss Arhimond = new Boss(500, 50);

        Arhimond.Voice();

        Arhimond.changeBossDefence();

        Arhimond.printInfo();



        Warrior Arthas = new Warrior(250, 20);

        Magic Djaina = new Magic(250, 20);

        Mental DoctorStrange = new Mental(250, 20);





        int num = Arhimond.getDefence();

        switch (num) {

            case 1:
                Arthas.rage();

                Arthas.psyhicalHit();

                break;

            case 2:
                Djaina.rage();

                Djaina.magicalHit();

                break;

            case 3:

                DoctorStrange.rage();

                DoctorStrange.kineticHit();

                break;

            default:

                break;



        }



        Arthas.Voice();

        Arthas.printInfo();


        Djaina.Voice();

        Djaina.printInfo();


        DoctorStrange.Voice();

        DoctorStrange.printInfo();


    }

}