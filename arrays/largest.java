public class largest {
    public static int large(int n[]){
        int larger = n[0];
        for(int i =1; i<n.length; i++){
            larger = Math.max(larger, n[i]);
        }
        return larger;
    }

    public static int larg(int n[]){
        int larger = Integer.MIN_VALUE;
        for(int i = 0; i<n.length ; i++){
            if (n[i]>larger) {
                larger = n[i];
            }
        }
        return larger;
    }
    public static void main(String[] args) {
        int n[] ={2,4,5,23,67};
        System.out.println(large(n));
        System.out.println(larg(n));

    }
}
