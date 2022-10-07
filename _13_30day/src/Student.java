package src;

public class Student extends Person {
    private int[] scores;

    Student(String firstName, String lastName, int idNumber, int[] scores)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.scores = scores;
    }
    char calculate()
    {
        int sum = 0;
        int average = 0;
        for(int i = 0; i < scores.length; i++)
            sum += scores[i];
        average = sum/ scores.length;
        if( 90 <= average && average <= 100)
            return 'O';
        if( 80 <= average && average < 90)
            return 'E';
        if( 70 <= average && average < 80)
            return 'A';
        if( 55 <= average && average < 70)
            return 'P';
        if( 40 <= average && average < 55)
            return 'D';
        if( average < 40)
            return 'T';
        return 'R';
    }

}