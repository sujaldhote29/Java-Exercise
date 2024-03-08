import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms = ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        int fnMinus2 = 0;
        int fnMinus1 = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(fnMinus2);
            int fn = fnMinus1 + fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        sc.close();
    }
}