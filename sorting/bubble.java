

public class bubble {
    public static void main(String[] args) {
        int n[] ={3,5,2,4,7};
        for(int i = 0; i<n.length-1; i++){
            for(int j = 0; j<n.length-1; j++){
                if (n[j]<n[j+1]) {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1]= temp;
                }
            }
        }

        for(int i = 0; i<n.length; i++){
            System.out.println(n[i]);
        }
    }
}
