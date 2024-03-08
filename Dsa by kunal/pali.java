import java.util.*;

public class pali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();
        boolean ispalindrome = false;
        int n = str.length();
        str = str.toLowerCase();
        for(int i = 0; i<n/2; i++){
            if (str.charAt(i)==str.charAt(n-i-1)) {
                ispalindrome = true;
            }
        }

        if (ispalindrome) {
            System.out.println("Palindrome");
        }else{
            System.out.println("NOt a plaindrome");
        }
        sc.close();
    }
}
