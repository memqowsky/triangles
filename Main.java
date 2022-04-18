package com.triangles;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();
        Trojkat t;

        int nieTrojkat = 0;
        int ostrokatny = 0;
        int prostokatny = 0;
        int rozwartokatny = 0;
        int licznik = 0;

        for(int i=0; i<100; ++i){

            t = new Trojkat(
                    new Punkt2D(generator.nextInt(20)-10,generator.nextInt(20)-10),
                    new Punkt2D(generator.nextInt(20)-10,generator.nextInt(20)-10),
                    new Punkt2D(generator.nextInt(20)-10,generator.nextInt(20)-10)
            );

            licznik++;

            if(!t.czyTrojkat()) {

                ++nieTrojkat;

            }else {

                if (t.ostrokatny()) ++ostrokatny;

                else if (t.prostokatny()) ++prostokatny;

                else ++rozwartokatny;

            }

        }
            System.out.println("Nie trojkatow jest: " + nieTrojkat);
            System.out.println("Ostrokatnych jest: " + ostrokatny);
            System.out.println("Prostokatnych jest: " + prostokatny);
            System.out.println("Rozwartokatnych jest: " + rozwartokatny);
            System.out.println("Trojkatow jest: " + licznik);



    }

}
