package oopdesignexercise;

public abstract class Shape {
    protected String color;
    protected boolean filled;


public String getColor() {
    return color;
}

public boolean isFilled() {
    return filled;
}

public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
}

public Shape() {
    this.color = "green";
    this.filled = true;
}

public abstract double area();

public abstract double perimeter();


public String valuesToString(){
    String filledToString = Boolean.toString(filled);
    String shapeColorAndFilledString = "A shape with color of " + color + " and " + filledToString;
    return shapeColorAndFilledString;
}

}
