public class floyd_tri {
    public static void main(String args[]){
        int n = 6;
        // int num =1;
        char c = 'C';
        for(int i =1; i<=n; i++){
            for(int j = 1;j<=n-i+1; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
