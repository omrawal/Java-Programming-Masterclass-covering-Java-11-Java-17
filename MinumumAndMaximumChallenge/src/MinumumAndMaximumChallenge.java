import java.util.Scanner;

public class MinumumAndMaximumChallenge {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Enter a Number: ");
            boolean isAnInt=sc.hasNextInt();
            if(!isAnInt){
                break;
            }
            else {
                int temp=sc.nextInt();
                min=Math.min(temp,min);
                max=Math.max(temp,max);
            }
            sc.nextLine();
        }
        System.out.println("Max found is : "+max+"\nMin found is : "+min);
        sc.close();
    }
}
