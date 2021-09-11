public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1,int number2, int number3){
        if(number1>1000||number1<10||number2>1000||number2<10||number3>1000||number3<10){
            return false;
        }
        int last1=number1%10;
        int last2=number2%10;
        int last3=number3%10;
        if(last1==last2||last1==last3||last2==last3)
            return true;
        return false;
    }
    public static boolean isValid(int number){
        if(number>1000||number<10){
            return false;
        }
        return true;
    }
}
