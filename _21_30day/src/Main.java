import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).toList());

        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    Collections.swap(a, j,j+1);
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;

            }
        }


            System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
            System.out.println("First Element: " + a.get(0));
            System.out.println("Last Element: " + a.get(n - 1));

            bufferedReader.close();

    }
}