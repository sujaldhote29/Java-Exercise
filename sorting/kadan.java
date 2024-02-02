

public class kadan {
    public static int algo(int n[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i<n.length; i++){
            currsum += n[i];
        }
        if (currsum<0) {
            return currsum;
        }else{
            maxsum = Math.max(currsum, maxsum);
        }


        int maxnegative= Integer.MIN_VALUE;
        for(int i = 0; i<n.length; i++){
            if (n[i]<0) {
              return   maxnegative = Math.max(maxnegative, i);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int n[] = {-1,-2,-3,-4};
        System.out.println(algo(n));

    }
}
