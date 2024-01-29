import java.util.Arrays;

public class linear_search {
    public static int serch(int n[], int target){
        Arrays.sort(n);

        for(int i = 0; i<n.length; i++){
            if (n[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 37, 15, 62, 24, 50, 8, 41, 19, 73, 56, 3, 29, 67, 12, 45, 6, 31, 58, 22, 48, 14, 39, 71, 9, 52, 17, 64, 27, 53, 11, 44, 20, 36, 60, 2, 47, 25, 66, 33, 55, 7, 42, 16, 38, 68, 13, 59, 21, 51, 30};


        int target =  50;


        System.out.println(serch(arr, target));
    }
}
