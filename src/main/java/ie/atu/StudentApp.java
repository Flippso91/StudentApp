package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Details student1 = new Details();
        System.out.println("Please enter Student Name: ");
        student1.setStudentName(input.next());
        System.out.println("you entered: " + student1.getStudentName());
    }
}
