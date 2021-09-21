package com.codegym;

public class QuadraticEquation {
    int a;
    int b;
    int c;
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }
    public double getRoot1() {
        return ((-this.b) + (Math.pow(getDiscriminant(), 0.5))) / (2 * this.a);
    }
    public double getRoot2() {
        return ((-this.b) - (Math.pow(getDiscriminant(), 0.5))) / (2 * this.a);
    }
}
