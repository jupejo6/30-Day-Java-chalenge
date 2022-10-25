
import java.util.*;
import java.lang.*;


public class Main {
    public static Node insert(Node head, int ele){
        Node newNode = new Node(ele);
        if(head==null) {
            return newNode;
        }
        else if(head.next == null) {
            head.next = newNode;
        }
        else{
            Node start = head;
            while(start.next!=null){
                start = start.next;
            }
            start.next = newNode;
            }

        return head;
    }
    public static void display(Node head){
        Node start = head;
        while(start != null) {
            System.out.println(start.data + " ");
            start = start.next;
        }

    }
    public static Node removeDuplicates(Node head){
        Node actualStart = head;
        Node indexNode = actualStart;
        while(actualStart.next != null) {
            int d = actualStart.data;
            while (indexNode.next != null) {
                while (indexNode.next.data == d) {
                    if(indexNode.next.next != null){
                        indexNode.next = indexNode.next.next;
                    }
                    else {
                        indexNode.next = null;
                        break;
                    }
                }
                indexNode = indexNode.next;
                if(indexNode == null)
                    break;

            }
            actualStart=actualStart.next;
            indexNode = actualStart;
            if(actualStart == null)
                break;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head = removeDuplicates(head);
        display(head);
    }
}