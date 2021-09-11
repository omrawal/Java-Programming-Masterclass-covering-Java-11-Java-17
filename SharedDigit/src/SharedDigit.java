public class SharedDigit {
    public static boolean hasSharedDigit(int num1,int num2){
        if(num1>99 ||num1<10||num2<10||num2>99){
            return false;
        }
        int firstDigit=0,secondDigit=0,n1=num1,n2=num2;
//        Outer loop for num1
//        Inner loop for num2
        while (n1>0){
        firstDigit=n1%10;
        n2=num2;
        while (n2>0){
            secondDigit=n2%10;
            if(secondDigit==firstDigit)
                return true;
            n2/=10;
        }
        n1/=10;
        }
        return false;
    }
}
