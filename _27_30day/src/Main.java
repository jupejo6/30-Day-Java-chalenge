import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int returnedYear, returnedMonth, returnedDay;
        int dueYear, dueMonth, dueDay;
        returnedDay = scan.nextInt();
        returnedMonth = scan.nextInt();
        returnedYear = scan.nextInt();

        dueDay = scan.nextInt();
        dueMonth = scan.nextInt();
        dueYear = scan.nextInt();
        scan.close();

        if(returnedYear > dueYear)
            System.out.println(10000);
        else if(returnedMonth > dueMonth && returnedYear == dueYear)
            System.out.println(500*(returnedMonth-dueMonth));
        else if(returnedDay > dueDay && returnedMonth == dueMonth && returnedYear == dueYear)
            System.out.println(15*(returnedDay-dueDay));
        else
            System.out.println(0);

    }

}
