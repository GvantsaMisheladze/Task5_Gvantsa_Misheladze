public class Task5 {
    public static double convertToCelsius(double fahrenheit){
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = convertToCelsius(fahrenheit);
        System.out.println(celsius);
    }
}
