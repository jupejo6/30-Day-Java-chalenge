import java.util.LinkedList;

public class Solution {

    LinkedList<String> queue;
    LinkedList<String> stack;

    public Solution(){
        queue = new LinkedList<>();
        stack = new LinkedList<>();

    }

    void pushCharacter(char c){
        String s = Character.toString(c);
        stack.addLast(s);
    }
    void queueCharacter(char c){
        String s = Character.toString(c);
        queue.addLast(s);
    }
    char popCharacter(){
        return stack.removeLast().charAt(0);
    }

    char enqueueCharacter(){
        return queue.removeFirst().charAt(0);

    }
}
