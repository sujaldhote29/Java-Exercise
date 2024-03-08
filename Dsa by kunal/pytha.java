import java.util.Arrays;

public class pytha {

    static boolean change(int[] arr) {
        int n = arr.length;

        // doing square of all elemts of array
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // sorting the array

        Arrays.sort(arr);
        for (int i = n - 1; i >= 2; i--) {
            int l = 0;
            int r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] == arr[i]) {
                    return true;
                }
                if (arr[l] + arr[r] < arr[i]) {
                    l++;
                } else {
                    r--;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        // boolean pytha = false;
        // for(int i =0; i<arr.length; i++){
        // for(int j = i+1; j<arr.length; j++){
        // for(int k = j+1;k<arr.length; k++ ){
        // int x = arr[i] * arr[i] , y = arr[j] *arr[j] , z = arr[k] * arr[k];

        // if (x==y+z || y == x+z || z == x+y) {
        // pytha = true;
        // break;
        // }else{
        // pytha = false;
        // }
        // }
        // }
        // }

        // if (pytha) {
        // System.out.println("Pytha triplet");
        // }else{
        // System.out.println("no");
        // }

        if (change(arr)) {
            System.out.println("pytha triplet");
        } else {
            System.out.println("no");
        }
    }
}
