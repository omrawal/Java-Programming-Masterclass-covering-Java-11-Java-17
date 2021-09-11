public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second){
        if(first<10 || second<10){
            return -1;
        }
        int min=Math.min(first, second);
//        int max=Math.max(first,second);
        int gcd=-1;
        while(min>0){
            if(first%min==0 && second%min==0){
                return min;
            }
            min--;
        }
        return 1;
    }
}
