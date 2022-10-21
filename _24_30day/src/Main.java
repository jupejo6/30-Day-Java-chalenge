import java.util.*;



public class Main {

    public static Node insert(Node root, int data)
    {
        if (root == null)
            return new Node(data);
        else{
            if(data<=root.data)
            {
                root.left = insert(root.left, data);
            }
            else{
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    static void levelOrder(Node root)

    {
        if(root != null) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty())
            {

                Node tree = queue.remove();
                System.out.print(tree.data + " ");
                if(tree.left!=null)
                    queue.add(tree.left);
                if(tree.right!=null)
                    queue.add(tree.right);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
        sc.close();
    }
}