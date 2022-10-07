package src;

public class Person {

    protected String firstName;
    protected String lastName;
    int idNumber;

    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}