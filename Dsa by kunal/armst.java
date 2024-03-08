

public class armst {
    public static boolean check(int n){
        
        int real = n;
        int sum =0;
        while (n>0) {
            int ld = n%10;
            n = n/10;
            sum=sum+(ld*ld*ld);
        }
        if (real==sum) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       
        for(int i =100; i<1000; i++){
            if (check(i)) {
                System.out.print(i+" ");
            }
        }
       
    }

}
