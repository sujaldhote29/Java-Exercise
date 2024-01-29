public class test2 {

    public static void main(String[] args) {
       Palindrome p = new Palindrome();
     System.out.println(p.check(156));
    }
}

class Palindrome{
    public boolean check(int x){
        int temp = x;
    int rev = 0;
    int rem ;
    while (x!=0) {
        rem = x%10;
        rev = rev*10+rem;
        x /=10;
    }


    if (temp!=rev) {
        return false;
    }
    return true;
    }
}