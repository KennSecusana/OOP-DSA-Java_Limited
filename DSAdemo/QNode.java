public class QNode {
    private Node next;
    private int data;
    
    public QNode(Node next, int data) {
        this.next = next;
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    


}
