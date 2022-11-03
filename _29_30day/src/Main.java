import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        String myRegExString = "@gmail\\.com$";
        Pattern p = Pattern.compile(myRegExString);
        ArrayList<String> validNames = new ArrayList<String>();

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                Matcher m = p.matcher(emailID);
                if (m.find())
                    validNames.add(firstName);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        });

        Collections.sort(validNames);
        validNames.forEach( s -> System.out.println(s));
        bufferedReader.close();
    }
}


