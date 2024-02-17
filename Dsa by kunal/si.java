import java.util.*;

public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount = ");
        int p = sc.nextInt();
        System.out.print("Enter the Time = ");
        int t = sc.nextInt();
        System.out.print("Enter the Rate of Interest = ");
        int i = sc.nextInt();
        int SI = (p*i*t)/100;

        System.out.println("The total Si amount was "+SI);
    }
}
