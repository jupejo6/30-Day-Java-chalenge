
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        scan.close();

        // Makes a Queue and a Stack to later compare them.
        char[] wordInChar = word.toCharArray();
        Solution p = new Solution();

        for(char c : wordInChar)
        {
            p.pushCharacter(c);
            p.queueCharacter(c);
        }

        // Checks if the Queue and Stack are the same.
        boolean isPalindrome = true;
        for(int i = 0; i < wordInChar.length; i++) {
            if (p.enqueueCharacter() != p.popCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Printing out the solution: the input word was palindrome or not.
        System.out.println("The word, " + word + ", is " + ((isPalindrome) ? "a palindrome." : "not a palindrome."));

    }
}