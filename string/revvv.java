import java.util.*;
public class revvv {
    public static String rev(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = str.length()-1 ; i>=0; i--){
            sb.append(str.charAt(i));

        }
        return sb.toString();
    }

    public static boolean palin(String str){
        for(int i =0; i<str.length()/2; i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String name = ");
        String str = sc.nextLine();
        // String v = rev(str);
        // System.out.println(v);
        System.out.println(palin(str));
    }
}
