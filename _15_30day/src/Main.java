import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = scan.nextInt();
        scan.close();


        Difference difference = new Difference(array);
        difference.computeDifference();

        System.out.print(difference.maximumDifference);

    }
}