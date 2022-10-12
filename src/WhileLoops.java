import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);


    public static void eoCount() {
        int i = s.nextInt();
        while (true) {
            if (i % 2 == 0) {
                System.out.println("is even");
                break;
            } else {

                System.out.println("is odd");
                break;
            }
        }
    }

    public static void mean() {
        int m = s.nextInt();
        int n = s.nextInt();
        while(true) {
            System.out.printf("average is: " + (m + n) / 2);
            break;
        }
        }


    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
