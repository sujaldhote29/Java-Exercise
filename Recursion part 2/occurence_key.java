

public class occurence_key {
    public static void occurence(int n[], int key, int i){
        if (i==n.length) {
            return ;
        }
        if (n[i]==key) {
            System.out.println(i+" ");
        }
        occurence(n, key, i+1);
    }
    public static void main(String args[]){
        int n[] = {2,4,3,2,5,2,6};
        occurence(n, 2, 0);
    }
}
