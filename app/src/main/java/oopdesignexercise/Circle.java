package oopdesignexercise;
import java.lang.Math;

public class Circle extends Shape{
    private double radius;

public double getRadius(){
    return radius;
}

public Circle (String color, boolean filled, double radius){
    super(color, filled);
    this.radius = radius;
}

public double area(){
    return Math.PI * Math.pow(radius, 2);
    }

public double perimeter(){
    return 2 * Math.PI * radius;
}

@Override
public String valuesToString() {
    String circleRadiusClassInfoString = "A Circle with radius = " + getRadius() + " which is a subclass of Circle, where Circle is the output of the toString() method from the superclass";
    return circleRadiusClassInfoString;
    }
}
