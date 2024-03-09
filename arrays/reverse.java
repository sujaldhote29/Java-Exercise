public class reverse {
    public static void array(int arr[]) {
        // int n = arr.length-1;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void indexRev(int[] arr, int idx) {
        int start = idx + 1;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void mergeSortedArr(int arr1[], int arr2[], int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void place_zero_at_right(int arr[]){
        int i =0;
        for(int j = 0; j<arr.length; j++){
            if (arr[j]!=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = { 2, 3, 4, 2, 45, 67 };
        // reverse a = new reverse();
        // array(arr);
        // printArr(arr);
        // System.out.println();
        // indexRev(arr, 3);
        // printArr(arr);

        // int[] arr1 = { 1, 3, 5, 6, 7, 9 };
        // int[] arr2 = { 2, 4, 8 };
        // int arr3[] = new int[arr1.length + arr2.length];

        // mergeSortedArr(arr1, arr2, arr3);
        // printArr(arr3);

        int arr[] = { 20,0,0,23,23,44};
        place_zero_at_right(arr);
        printArr(arr);
    }
}
