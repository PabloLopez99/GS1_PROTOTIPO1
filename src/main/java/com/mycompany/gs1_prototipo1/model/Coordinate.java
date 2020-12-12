package com.mycompany.gs1_prototipo1.model;

public class Coordinate {
    private double x;
    private double y;

    public Coordinate(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(long x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }
}
