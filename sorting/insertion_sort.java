public class insertion_sort {

    public static void main(String args[]) {
        int a[] = { 2, 5, 1, 3, 6, 7, 4 };
        for (int i = 0; i < a.length; i++) {
            int curr = a[i];
            int prev = i - 1;
            while (prev >= 0 && a[prev] > curr) {
                a[prev + 1] = a[prev];
                prev--;
            }
            
            a[prev + 1] = curr;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
