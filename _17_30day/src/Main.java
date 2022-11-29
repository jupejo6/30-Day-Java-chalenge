import java.io.*;


import static java.lang.Integer.parseInt;



public class Main{
    static String Solution(String S){
        try{
            return Integer.toString(parseInt(S));
        }
        catch(NumberFormatException e) {
            return ("Bad String");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        System.out.println(Solution(S));

        bufferedReader.close();
    }
}
