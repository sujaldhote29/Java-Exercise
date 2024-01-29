import java.util.Arrays;

public class binary_search {
    public static int serach(int n[], int target){
        Arrays.sort(n);

        int start = 0;
        int end = n.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (n[mid]==target) {
                return mid;
            }
            if (n[mid]<target) {
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 37, 15, 62, 24, 50, 8, 41, 19, 73, 56, 3, 29, 67, 12, 45, 6, 31, 58, 22, 48, 14, 39, 71, 9, 52, 17, 64, 27, 53, 11, 44, 20, 36, 60, 2, 47, 25, 66, 33, 55, 7, 42, 16, 38, 68, 13, 59, 21, 51, 30};


        int target =  50;


        System.out.println(serach(arr, target));
    }
}
