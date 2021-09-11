import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }


    public static void inputThenPrintSumAndAverage(){
        int sum=0,counter=0,temp=0;
        long average=0;
        Scanner sc=new Scanner(System.in);
        while (true) {
            boolean isAnInt=sc.hasNextInt();
            if(!isAnInt)break;
            temp=sc.nextInt();
            sum+=temp;
            counter+=1;
            sc.nextLine();
        }
        sc.close();
        average=sum/counter;
        System.out.println("SUM = "+sum+" AVG = "+average);
    }
}
