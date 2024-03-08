import java.util.*;


public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number =  ");
        int n =sc.nextInt();
        System.out.print("enter the count digit = ");
        int c = sc.nextInt();
        int count = 0;
        while (n>0) {
            int ld = n%10;
            if (ld==c) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
        sc.close();
    }
}
