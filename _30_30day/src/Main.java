
import java.util.Scanner;

class Result {

    public static int bitwiseAnd(int N, int K) {
        {
            int max = 0;
            int tmp;

            for (int i = 1; i < N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    tmp = i & j;
                    if (tmp > max & tmp < K)
                        max = tmp;
                }
            }
            return max;
        }
    }

}

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){

                int count = scan.nextInt();
                int lim = scan.nextInt();
                System.out.println(Result.bitwiseAnd(count, lim));
            }
        }

}

