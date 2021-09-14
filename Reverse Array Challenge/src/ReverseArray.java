import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int array[]){
        System.out.println("Array = "+ Arrays.toString(array));
        int n= array.length;
        int start=0,end=n-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed array = "+ Arrays.toString(array));
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);
    }
}
