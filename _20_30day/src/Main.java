
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();


        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.print(myCalculator.divisorSum(N));

    }
}