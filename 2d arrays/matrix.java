
public class matrix {
    public static  boolean search(int n[][],int key){
        int row = n.length-1;
        int col = 0;
        while (row>=0 && col<n.length) {
            if (n[row][col]==key) {
                System.out.println("The key was found at index : "+row+" "+col);
                return true;
            }
            else if (n[row][col]>key) {
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{21,23,31,46},{31,34,38,40},{41,45,46,48}};
        int key = 23;
        System.out.println(search(arr, key));

    }
}
