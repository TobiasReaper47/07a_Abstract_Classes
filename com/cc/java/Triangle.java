package com.cc.java;

public class Triangle extends Shape{

private double baseline;
private double height;

public Triangle(double baseline, double height) {
    this.baseline = baseline;
    this.height = height;
}

public double area() {
    return baseline * height / 2;
}

}
