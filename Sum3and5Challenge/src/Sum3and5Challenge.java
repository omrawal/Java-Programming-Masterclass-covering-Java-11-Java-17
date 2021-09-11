public class Sum3and5Challenge {
    public static void main(String[] args) {
        int count=0,sum=0;
        for (int i=1;i<=1000;i+=1){
            if(count==5)
                break;
            if(i%3==0 && i%5==0){
                count++;
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("The sum is "+sum);
    }
}
