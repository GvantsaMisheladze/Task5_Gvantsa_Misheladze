public class Task1 {
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 4;
        boolean result = isEven(number);
        System.out.println(result);
    }
}
