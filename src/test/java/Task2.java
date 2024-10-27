public class Task2 {
    public static int findLargest(int a, int b, int c){
        int largest = a;
        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }
        return largest;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 9;
        int largest = findLargest(a, b, c);
        System.out.println(largest);
    }
}
