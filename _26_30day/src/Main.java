
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {

    public static boolean isPrime(int n)
    {
        if(n <= 1 || n == 4)
            return false;
        for(int i = 2; i < sqrt(n); i++)
            if(n%i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int p;
        for(int i = 0; i < N; i++)
        {
            p = scan.nextInt();
            System.out.println(isPrime(p) ? "Prime" : "Not Prime");
        }

        scan.close();
    }
}