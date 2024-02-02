public class power {
    // Brute approach
    public static int sq(int a, int x){
        if (x==0) {
            return 1;
        }
        int m = a*sq(a, x-1);
        return m;
    }

    // optimized way
    public static int way(int a, int x){
        if (x==0) {
            return 1;
        }
        int half = way(a, x/2) *way(a, x/2);
        // int half1;
        if (x%2!=0) {
           return   a* half;
        }
        return half;
    }
    public static void main(String args[]){
        int a = 2;
        int x = 10;
        // System.out.println(sq(a, x));
        System.out.println(way(a, x));
    }
}
