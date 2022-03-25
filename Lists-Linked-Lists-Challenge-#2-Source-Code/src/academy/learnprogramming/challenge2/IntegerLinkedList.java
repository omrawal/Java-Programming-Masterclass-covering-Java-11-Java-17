package academy.learnprogramming.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        // add your code here
        IntegerNode newNode=new IntegerNode(value);
        if(this.head==null){
            this.head=newNode;
        }
        else{
            if(this.head.getValue()>=value){
                newNode.setNext(this.head);
                this.head=newNode;
                return;
            }

            IntegerNode slow=this.head;
            IntegerNode fast=this.head.getNext();
            if(fast==null){
                this.head.setNext(newNode);
                return;
            }
            while(slow!=null && fast!=null){
                if(slow.getValue()<=value && fast.getValue()>=value){
                    slow.setNext(newNode);
                    newNode.setNext(fast);
                    return;
                }
                slow=slow.getNext();
                fast=fast.getNext();
            }
            slow.setNext(newNode);
            return;

        }

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
