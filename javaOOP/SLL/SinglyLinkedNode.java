public class SinglyLinkedNode {
    private int value;
    private SinglyLinkedNode next = null;

    public SinglyLinkedNode(int value) {
        this.value = value;
    }

    public int getVal() {
        return this.value;
    }

    public void setVal(int value) {
        this.value = value;
    }

    public SinglyLinkedNode getNext() {
        return this.next;
    }

    public void setNext(SinglyLinkedNode node) {
        this.next = node;
    }

}