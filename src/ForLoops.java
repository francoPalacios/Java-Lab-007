import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        int n = s.nextInt();
        int t;
        for(t = 0; t < n; t++ ){

            System.out.printf("the sum is " + t);

        }


    }

    public static void rangeSum() {
    }

    public static void factorial() {
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
