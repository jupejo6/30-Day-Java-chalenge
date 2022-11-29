import java.util.*;
import java.lang.Exception;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-- > 0)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            try {
                int ans = Calculator.power(a,b);
                System.out.println(ans);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }


        scan.close();

    }
}