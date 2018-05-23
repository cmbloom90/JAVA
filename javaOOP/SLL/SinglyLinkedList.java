public class SinglyLinkedList {
    private SinglyLinkedNode head = null;

    public SinglyLinkedList insert(int value){
		if(this.head == null){
			SinglyLinkedNode node = new SinglyLinkedNode(value);
			this.head = node;
			return this;
		}
		SinglyLinkedNode runner = this.head;
		while(runner.getNext() != null){
			runner = runner.getNext();
        }
        SinglyLinkedNode node = new SinglyLinkedNode(value);
		runner.setNext(node);
		return this;
    }

    public SinglyLinkedList remove(){
		SinglyLinkedNode runner = this.head;
		while(runner.getNext().getNext() != null){
			runner = runner.getNext();
		}
		runner.setNext(null);
        return this;
    }
    
    public void printValues() {
        if (this.head != null) {
            SinglyLinkedNode runner = this.head;
            while (runner != null) {
                int nodeVal = runner.getVal();
                System.out.println(nodeVal);
                runner = runner.getNext();
            }
        }
    }

    
}
