package academy.learnprogramming.challenge2;

import java.util.Objects;

public class IntegerNode {

    private Integer value;
    private IntegerNode next;

    public IntegerNode(Integer value) {
        this.value = value;
        this.next=null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerNode)) return false;
        IntegerNode that = (IntegerNode) o;
        return value.equals(that.value) && next.equals(that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public String toString() {
        return value.toString();
    }


}
