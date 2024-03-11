import java.util.*;

public class Print_Table {
    public static void table(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void print_Summation(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void print_tri(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void AP(int n , int m){
        int sum = 0;
        for(int i = 1; i<=n; i=i+m)
        sum+=i;

        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        // table(num);
        // print_Summation(num);
        // print_Summation(num);
        print_tri(num);
        AP(10, 2);

    }
}
