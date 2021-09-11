public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int number){
    if(number<1)return -1;
    int maxPrime=-1;
    int i=0,j=0;
    for(i =number;i>=1;i--){
//        is factor of number
        if(number%i==0){
//            check if i is prime
            int factCount=0;
            for(j=1;j<=i;j++){
                if(i%j==0)
                    factCount++;
            }
            if(factCount==2){
                maxPrime=i;
                return maxPrime;
            }


        }
    }
        return maxPrime;
    }

}
