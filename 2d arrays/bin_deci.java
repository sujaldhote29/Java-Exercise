import java.util.*;
public class bin_deci {
    public static int conver(int n){
        int decimal = 0;
        int pow = 0;
        while (n>0) {
            int ld = n%10;
            decimal+=ld*Math.pow(2, pow);
            
            n = n/10;
            pow++;
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("The conversion of "+num+" is "+conver(num));
        sc.close();
        
    }
}
