public class Calculator {

    public static int power(int p, int q) throws Exception
    {

        if (p < 0 || q < 0)
            throw new Exception("n and p should be non-negative");

        if(q == 0)
            return 1;
        else{
            int pow = p;
            for(int i = 1; i < q; i++)
                pow *= p;
            return pow;
        }

    }
}
