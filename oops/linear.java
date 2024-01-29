

public class linear {
    public static void main(String[] args) {
        Search s = new Search();
        int x[] = {2, 3, 4, 5, 6, 7};
        System.out.println(s.search(x, 4));
    }
}

class Search {
    public int search(int x[], int key) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == key) {
                return i; // Return the index if key is found
            }
        }
        return -1; // Return -1 if key is not found
    }
}
