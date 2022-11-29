import java.util.*;

public class Main {

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static int getHeight(Node root) {
        //Write your code here
        if(root == null)
            return -1;
        if(getHeight(root.left) >= getHeight(root.right))
            return 1 + getHeight(root.left);
        else
            return 1 + getHeight(root.right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
        sc.close();

    }
}