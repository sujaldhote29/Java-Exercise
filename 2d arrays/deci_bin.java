import java.util.*;
public class deci_bin {
    public static int convert(int n){
        int binary = 0;
        int pow = 0;
        while (n>0) {
            int ld = n%2;
            binary+=ld*(int)Math.pow(10, pow);
            n = n/2;
            pow++;
        }
        return binary;
    }
    public static void main(String[] args) {                                                         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number :  ");
        int num = sc.nextInt();
        System.out.println("The conversion of "+num+" is : "+convert(num));
        sc.close();

    }
}
