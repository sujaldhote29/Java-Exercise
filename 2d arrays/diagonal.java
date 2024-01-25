public class diagonal {
    public static int sum(int n[][]){
        int sum = 0;
        for(int i = 0; i<n.length; i++){
            // for(int j = 0; j<n[0].length; j++){
            //     if (i==j) {
            //         sum+=n[i][j];
            //     }
            //     if (i+j==n.length-1) {
            //         sum+=n[i][j];
            //     }
            // }

            sum+=n[i][i];
            if (i!=n.length-1-i) {
                
                sum+=n[i][n.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12,},{13,14,15,16}};

        System.out.println(sum(a));
    }
}
