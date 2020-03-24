import java.util.Scanner;

public class student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor : prompt user to enter student's name and year
    public student() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();

        setStudentID();

        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }
    // generate an id
    private void setStudentID() {
        //Grade level+ ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //enroll in courses
    public void enroll() {
        //Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

        System.out.println("Enrolled in: " + courses);
      //  System.out.println("Tuition Balance: " + tuitionBalance);
    }

    //view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //show status
    public String toString(){
        return "Name: " + firstName + " " + lastName +"\nStudent ID: "+ studentID+
                "\nGrade Level: " + gradeYear+ "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
    }
}
