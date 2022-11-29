import java.util.*;
public class Main {
    public static void main(String[] args) {
    //
        Scanner scan = new Scanner(System.in);
        String firstName=scan.next();
        String lastName=scan.next();
        int id = scan.nextInt();
        int scoreNumber = scan.nextInt();
        int[] scores = new int[scoreNumber];
        for(int i = 0; i < scoreNumber; i++)
            scores[i] = scan.nextInt();
        scan.close();

        Student s = new Student(firstName, lastName, id, scores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );

    }
}