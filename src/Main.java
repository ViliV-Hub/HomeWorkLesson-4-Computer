import areaCircle.Circle;
import temperatureConverter.TemperatureConverter;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(15);
        circle.calculateArea();
        //System.out.println(circle.getRadius());

        TemperatureConverter temp = new TemperatureConverter();
        temp.setCelsius(25);
        temp.toFahrenheit();

        TemperatureConverter temp2 = new TemperatureConverter();
        temp2.setFahrenheit(0);
        temp2.toCelsius();

        System.out.println("Multumim mult!");

    }
}