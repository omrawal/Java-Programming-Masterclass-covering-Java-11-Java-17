import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void printList(LinkedList<String>places){
        Iterator<String> i=places.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        LinkedList<String> places=new LinkedList<String>();
        places.add("Australia");
        places.add("Brazil");
        places.add("California");
        places.add("Denver");
        places.add("England");
        places.add("Finland");
        places.add("Georgia");
        System.out.println("Press 1 to visit next city\nPress 2 to visit previous city\nPress 3 to print menu\nPress 0 to exit\n");
        Scanner sc=new Scanner(System.in);
        boolean isRunning=true;
        ListIterator<String> i=places.listIterator();
        while(isRunning){
                int choice=sc.nextInt();
                switch (choice){
                    case 1:
                        if(i.hasNext()){
                            System.out.println("Visiting "+i.next());
                        }
                        else{
                            System.out.println("We are at the start of the list");
                        }
                        break;
                    case 0:
                        isRunning=false;
                        break;
                    case 2:
                        if(i.hasPrevious()){
                            System.out.println("Visiting "+i.previous());
                        }
                        else{
                            System.out.println("We are at the end of the list");
                        }
                        break;
                    case 3:
                        System.out.println("Press 1 to visit next city\nPress 2 to visit previous city\nPress 3 to print menu\nPress 0 to exit\n");
                        break;
                    default:
                        System.out.println("INVALID INPUT");
                        break;
                }
        }
        sc.close();
        System.out.println("Exiting");


    }

}
