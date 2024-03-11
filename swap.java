public class swap {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;


        System.out.println("Before swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // using bitwise operator
        a = a^b;
        b=a^b;
        a = a^b;
       
        System.out.println("After swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        // using addition method

        // a = a-b;
        // b = a+b;
        // a = b-a;

        // System.out.println("After swapping");
        // System.out.println("a = "+a);
        // System.out.println("b = "+b);

        // using temprory var

        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("After swapping");
        // System.out.println("a = "+a);
        // System.out.println("b = "+b);
    }
}
