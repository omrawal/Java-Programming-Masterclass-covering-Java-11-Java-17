import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, tempNum = 0;
        int counter = 0;
        while (true){
            if(counter==10)break;
            System.out.println("Enter number #"+(counter+1)+": ");
            boolean isAnInteger= sc.hasNextInt();
            if(isAnInteger){
                int number=sc.nextInt();
                sum+=number;
                counter++;
            }
            else {
                System.out.println("Invalid Number");
            }
            sc.nextLine(); // handle end of line error
        }
        System.out.println(sum);
    sc.close();
    }
}
