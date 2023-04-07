package temperatureConverter;

public class TemperatureConverter {

    private int celsius;
    private int fahrenheit;

    public int getCelsius () {
        return celsius;
    }

    public void setCelsius (int valCelsius) {
        celsius = valCelsius;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit (int valFahrenheit) {
        fahrenheit = valFahrenheit;
    }

    public void toFahrenheit() {
        int celfah = (9*celsius+(32*5))/5;
        System.out.println("Temperatura Convertita din " + getCelsius() + "C este : " + celfah + "F!");
        System.out.println("____________________________________________");
    }

    public void toCelsius() {
        int fahcel = (5*(fahrenheit-32))/9;
        System.out.println("Temperatura Convertita din " + getFahrenheit() + "F este: " + fahcel + "C!");
        System.out.println("____________________________________________");
    }
}
