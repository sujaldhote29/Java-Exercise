public class selection_sort {
    public static void sort(int[] n){
        for(int i =0; i<n.length-1; i++){
            int minpos = i;
            for(int j = i+1; j<n.length; j++){
                if (n[minpos]>n[j]) {
                    minpos = j;
                }
            }
            int temp = n[minpos];
            n[minpos] = n[i];
            n[i] = temp;

        }


        for(int i = 0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String args[]){
        int n[] ={3,2,5,1,9,6,7,4};
        sort(n);

    }
}
