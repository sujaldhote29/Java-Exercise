
public class increasing {
    public static void print(int n){
        int x =1;
        if (x==n) {
            System.out.println(n);
            return ;
            
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}
