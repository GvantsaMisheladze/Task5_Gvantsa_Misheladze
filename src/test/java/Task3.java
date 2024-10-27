public class Task3 {
    public static double calculateArea(double length, double width){
        return length * width;
    }

    public static void main(String[] args) {
        double length = 5.5;
        double width = 4.0;
        double area = calculateArea(length, width);
        System.out.println("Area of the rectangle: " + area);
    }
}
