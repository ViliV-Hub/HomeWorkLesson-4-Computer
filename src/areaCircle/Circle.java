package areaCircle;

public class Circle {

    private int radius;

    final double pi = 3.14;

    public int getRadius() {
        return radius;
    }

    public void setRadius (int valRadius) {
        radius = valRadius;
    }

    public void calculateArea() {

        double area = pi * radius * radius;
        System.out.println("Aria Cercului cu Raza - " + getRadius() + "  = " + area + "!");
        System.out.println("____________________________________________");

    }
}
