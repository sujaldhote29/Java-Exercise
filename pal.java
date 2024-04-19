import java.util.*;
public class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String = ");
        String str = sc.next();
        boolean ispalind = true;
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
               ispalind = false;
               break;
            }
        }
        if (ispalind) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }
        sc.close();
    }
}
