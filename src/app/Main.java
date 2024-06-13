package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter temperature unit App.");
        double c = -40.0;
        double f = -40.0;
        double tc = convFahrenheitToCelsius(f);
        System.out.println(f + " degrees Fahrenheit is " + tc + " degrees Celsius");
        double tf = convCelsiusToFahrenheit(c);
        System.out.println(c + " degrees Celsius is " + tf + " degrees Fahrenheit");
    }

    private static double convFahrenheitToCelsius(double f) {
        return (f - 32) * ((double) 5 / 9);
    }

    private static double convCelsiusToFahrenheit(double c) {
        return  c * 1.8 + 32;
    }
}
