package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter temperature unit App.");
        double c = 36.6;
        double f = 97.9;
        double tc = convFahrenheitToCelsius(f);
        System.out.println(f + " degrees Fahrenheit is " + tc + " degrees Celsius");
    }

    private static double convFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
