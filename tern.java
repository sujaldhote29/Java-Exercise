import java.util.*;

public class tern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int c = n % 2 == 0 ? 1 : 0;
        System.out.println(c);
        sc.close();
    }

}