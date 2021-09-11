public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(100);
    }
    
    public static int getDigitCount(int number){
        if(number<0) return -1;
        if(number>=0 && number <10) return 1;
        int count=0;
        while(number>0){
            count++;
            number/=10;
        }
        return count;
    }
    public static int reverse(int number){
//        flag = 0 -> positive
//        flag = 1 -> negative
        int flag=0;
        if(number<0){
            flag=1;
            number*=-1;
        }
        int newNum=0;
        while (number>0){
            newNum=(newNum*10)+(number%10);
            number/=10;
        }
        if(flag==1){
            newNum*=-1;
        }
        return newNum;
    }
    public static void numberToWords(int number){
        if(number<0)
            System.out.println("Invalid Value");
        else{
            int length=getDigitCount(number);
            int reversed=reverse(number);
            while (reversed>0){
                int rem=reversed%10;
                switch (rem){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;

                }
                reversed/=10;
                length--;
            }
            while (length>0){
                System.out.print("Zero ");
                length--;
            }
        }

    }
}
