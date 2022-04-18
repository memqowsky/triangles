package com.triangles;

import java.lang.Math;
import static java.lang.Math.abs;

public class Punkt2D {

    private int x;
    private int y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    double odlegloscOdPunktu(Punkt2D p){
        return Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
        //return (double)abs(Math.sqrt((Math.pow(this.x - p.y, 2)) + (Math.pow(this.y - p.y, 2))));
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }



}
