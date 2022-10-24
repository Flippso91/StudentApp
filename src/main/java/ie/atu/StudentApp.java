package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String enteredName, enteredEmail, enteredCourse;

        Details student1 = new Details();

        System.out.println("Please enter Student Name: ");
        student1.setStudentName(input.next());
        System.out.println("Please enter Student Email: ");
        student1.setStudentEmail(input.next());
        System.out.println("Please enter Student Course: ");
        student1.setStudentCourse(input.next());

        System.out.println("Please enter Student Name: ");
        enteredName = input.next();
        Details student2 = new Details(enteredName);
        System.out.println("Please enter Student Email: ");
        student2.setStudentEmail(input.next());
        System.out.println("Please enter Student Course: ");
        student2.setStudentCourse(input.next());

        System.out.println("Please enter Student Name: ");
        enteredName = input.next();
        System.out.println("Please enter Student Email: ");
        enteredEmail = input.next();
        System.out.println("Please enter Student Course: ");
        enteredCourse = input.next();
        Details student3 = new Details(enteredName, enteredEmail, enteredCourse);

        System.out.println(student1.getStudentName() + " " + student1.getStudentEmail() + " " + student1.getStudentCourse());
        System.out.println(student2.getStudentName() + " " + student2.getStudentEmail() + " " + student2.getStudentCourse());
        System.out.println(student3.getStudentName() + " " + student3.getStudentEmail() + " " + student3.getStudentCourse());
    }
}
