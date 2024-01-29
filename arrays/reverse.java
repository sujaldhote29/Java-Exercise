public class reverse {
    public void array(int arr[]){
        // int n = arr.length-1;
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }




    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,2,45,67};
        reverse  a= new reverse();
        a.array(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
