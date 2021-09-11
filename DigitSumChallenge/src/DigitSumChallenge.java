public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(37));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(500430));
    }

    public static int sumDigits(int number){
        int sum=-1;
        int inter=-1;
        if(number>=10){
            sum=0;
            while (number>0){
                inter=number%10;
                sum+=inter;
                number/=10;
            }
        }
        return sum;
    }
}
