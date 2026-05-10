package com.java.lts.features;

/*
* java 17
* Sealed Class
*/
public sealed class Shape permits Circle, Square{

    public double getArea(){
        return 0.0;
    }

}
final class Circle extends Shape{
    double pi = 3.14;
    public double getArea(double r){
        return pi*r*r;
    }
}
final class Square extends Shape {

    public double getArea(double e){
        return e*e;
    }
}
