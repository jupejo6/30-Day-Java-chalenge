

public class Node {

    // Properties
    Node next;
    int data;

    // Methods

    // Constructor
    public Node(int newData)
    {
        data=newData;
        next = null;
    }

    public Node(int newData, Node nextNode)
    {
        data = newData;
        next = nextNode;
    }

    // Getters and Setters

    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setData(int newData)
    {
        data = newData;
    }

    public void setNext(Node newNext)
    {
        next = newNext;
    }

    // insert one Node to the Linked list
    public Node insert(Node head, int data)
    {
        Node newNode = new Node(data);


        if(head!=null) {

            Node current = head;
            while (current.next != null)
                current = current.next;
            current.setNext(newNode);
        }
        else
            head = newNode;
        return head;
    }

    public static void display(Node head){
        Node start = head;
        while(start!=null){
            System.out.print(start.data + " ");
            start = start.next;
        }

    }
}
