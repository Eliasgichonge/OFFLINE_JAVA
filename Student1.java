import java.util.Scanner;

class Student1 {
    private String name;
    private String registrationNumber;
    private int[] marks;
    private int sumMarks;
    private double averageMarks;

    // Default constructor
    public Student1() {
        this.name = "";
        this.registrationNumber = "";
        this.marks = new int[0];
        this.sumMarks = 0;
        this.averageMarks = 0.0;
    }

    // Constructor with all attributes
    public Student1(String name, String registrationNumber, int[] marks) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.marks = marks;
        calculateSumAndAverage();
    }

    // Method to calculate sum and average marks
    private void calculateSumAndAverage() {
        sumMarks = 0;
        for (int mark : marks) {
            sumMarks += mark;
        }
        averageMarks = (marks.length > 0) ? (double) sumMarks / marks.length : 0.0;
    }

    // Method to display student details
    public void printDetails() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Sum of Marks: " + sumMarks);
        System.out.println("Average Marks: " + String.format("%.2f", averageMarks));
    }

    // Method to create Student1 object from user input
    public static Student1 fromUserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter registration number: ");
            String regNumber = scanner.nextLine();
            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            int[] marks = new int[numSubjects];
            System.out.println("Enter marks:");
            for (int i = 0; i < numSubjects; i++) {
                marks[i] = scanner.nextInt();
            }
            return new Student1(name, regNumber, marks);
        }
    }

    public static void main(String[] args) {
        // Creating student object using user input
        Student1 student = Student1.fromUserInput();
        student.printDetails();
    }
}
