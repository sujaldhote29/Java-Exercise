public class fib {
    public static int series(int n){
        if (n==0 || n==1) {
            return n;
        }
        int fnm1 = series(n-1);
        int fnm2 = series(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String args[]){
        System.out.println(series(5));
    }
}
