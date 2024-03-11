import java.util.*;
public class input {

    public static int rowsum(int[][] arr ){
        int minsum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+= arr[i][j];
            }
            if (minsum>sum) {
                minsum = sum;
            }
        }

        return minsum;
    }
    public static void wavecolpattern(int[][] arr){
       
        for (int j = 0; j < arr.length; j++) {
            if (j%2==1) {
                for (int i = arr.length-1; i >= 0; i--) {
                    System.out.print(arr[i][j]+" ");
                }
                // System.out.println();
            }else{
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]+" ");
                }
                // System.out.println();
            }
        }
       
    }
 public static void spiral(int[][] arr){
    int startrow = 0;
    int endrow = arr.length-1;
    int startcol = 0;
    int endcol = arr[0].length-1;

    while (startrow<=endrow && startcol<= endcol) {
        for(int i =startcol; i<=endcol; i++)
        System.out.print(arr[i][endcol]+" ");
    }

    for (int i = startrow; i <=endrow; i++) {
        System.out.print(arr[i][endrow]+" ");
    }

    for (int i = endcol-1; i >=startcol; i--) {
        System.out.println();
    }
 }   
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.print("["+i+","+j+"]"+" = ");
                 arr[i][j] = sc.nextInt();
            }
        }

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

            // System.out.println(rowsum(arr));
            wavecolpattern(arr);
            sc.close();
    }
}
