

public class smallest {
    public static int smaller(int n[]){
        int small = n[0];
        for(int i =1; i<n.length; i++){
            small = Math.min(small, n[i]);
        }
        return small;
    }
    public static int smal(int n[]){
        int small = Integer.MAX_VALUE;
        for(int i =0; i<n.length; i++){
            if (n[i]<small) {
                small = n[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int n[] = {4,3,5,3,56,78,45,9};
        System.out.println(smaller(n));
        System.out.println(smal(n));
    }
}
