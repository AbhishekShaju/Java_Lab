public class Student {
    private String name;
    private int marks;

    // Constructor 1: Accepts only name
    public Student(String name) {
        this.name = name;
        this.marks = 0; // Default marks
    }

    // Constructor 2: Accepts both name and marks
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Setter for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Calculate grade based on marks
    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    // Display student result
    public void displayResult() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        // Create student using constructor with name only
        Student student1 = new Student("John Doe");
        student1.setMarks(85);

        // Create student using constructor with name and marks
        Student student2 = new Student("Jane Smith", 92);

        // Display results for both students
        student1.displayResult();
        student2.displayResult();
    }
}
