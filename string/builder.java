

public class builder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        for(char c = 'a'; c<='z'; c++){
            s.append(c);
        }
       System.out.print(s);
    }
}
