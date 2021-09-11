public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(5005));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(34));
        System.out.println(isPalindrome(83737));
    }



    public static boolean isPalindrome(int number){
        int reverse=0;
        if(number<0)
            number*=-1;
        int original=number;
        while(number>0){
            reverse=reverse*10+number%10;
            number=number/10;
        }
        System.out.println(original+" == "+reverse);
        if(reverse==original)
            return true;
        return false;
    }
}
