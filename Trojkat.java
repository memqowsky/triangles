package com.triangles;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Math;
import java.util.Arrays;

public class Trojkat {

    private Punkt2D p1;
    private Punkt2D p2;
    private Punkt2D p3;

    public Trojkat(Punkt2D p1, Punkt2D p2, Punkt2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Punkt2D getP1() {
        return p1;
    }

    public Punkt2D getP2() {
        return p2;
    }

    public Punkt2D getP3() {
        return p3;
    }

    public void setP1(Punkt2D p1) {
        this.p1 = p1;
    }

    public void setP2(Punkt2D p2) {
        this.p2 = p2;
    }

    public void setP3(Punkt2D p3) {
        this.p3 = p3;
    }

    public static double round(double value) {
        int precision = 2;
        BigDecimal bigDecimal = new BigDecimal(value);
        bigDecimal = bigDecimal.setScale(precision, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public boolean czyTrojkat() {

        double a = p1.odlegloscOdPunktu(p2);
        double b = p2.odlegloscOdPunktu(p3);
        double c = p3.odlegloscOdPunktu(p1);

        a=round(a);
        b=round(b);
        c=round(c);

//        System.out.println("Bok1: " + a);
//        System.out.println("Bok2: " + b);
//        System.out.println("Bok3: " + c);


        return (a + b > c) && (b + c > a) && (c + a > b);

    }

    public boolean prostokatny ()
    {
        double a2 = Math.pow(p1.odlegloscOdPunktu(p2),2);
        double b2 = Math.pow(p2.odlegloscOdPunktu(p3),2);
        double c2 = Math.pow(p3.odlegloscOdPunktu(p1),2);

        a2=round(a2);
        b2=round(b2);
        c2=round(c2);

//        System.out.println("Bok1^2: " + a2);
//        System.out.println("Bok2^2: " + b2);
//        System.out.println("Bok3^2: " + c2);

        double tab[]  = {a2,b2,c2};

        Arrays.sort(tab);

        if(tab[2] == tab[0] + tab[1])
        return true;

        else return false;
    }

    public boolean ostrokatny ()
    {
        double a2 = Math.pow(p1.odlegloscOdPunktu(p2),2);
        double b2 = Math.pow(p2.odlegloscOdPunktu(p3),2);
        double c2 = Math.pow(p3.odlegloscOdPunktu(p1),2);

//        System.out.println("Bok1^2: " + a2);
//        System.out.println("Bok2^2: " + b2);
//        System.out.println("Bok3^2: " + c2);

        a2=round(a2);
        b2=round(b2);
        c2=round(c2);

        double tab[]  = {a2,b2,c2};

        Arrays.sort(tab);

        if(tab[2] < tab[0] + tab[1])
            return true;

        else return false;
    }

    public boolean rozwartokatny ()
    {
        double a2 = Math.pow(p1.odlegloscOdPunktu(p2),2);
        double b2 = Math.pow(p2.odlegloscOdPunktu(p3),2);
        double c2 = Math.pow(p3.odlegloscOdPunktu(p1),2);

//        System.out.println("Bok1^2: " + a2);
//        System.out.println("Bok2^2: " + b2);
//        System.out.println("Bok3^2: " + c2);

        a2=round(a2);
        b2=round(b2);
        c2=round(c2);

        double tab[]  = {a2,b2,c2};

        Arrays.sort(tab);

        if(tab[2] > tab[0] + tab[1])
            return true;

        else return false;
    }

    public double obwodTrojkata() {

        if(!czyTrojkat()) return 0;

        double suma=0;

        suma += p1.odlegloscOdPunktu(p2);
        suma += p2.odlegloscOdPunktu(p3);
        suma += p3.odlegloscOdPunktu(p1);


        return suma;

    }

    public double poleTrojkata() {
        //TODO
        return 0;

    }

    public String typTrojkata() {
        //TODO
        return null;

    }

    @Override
    public String toString() {
        return "[" + p1 + "," + p2 + "," + p3 + "]";
    }

}
