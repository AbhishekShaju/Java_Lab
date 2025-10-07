public class UniversityMain {
    public static void main(String[] args) {
        Student student = new Student("Alice", "S123", "Computer Science");
        Professor professor = new Professor("Dr. Smith", "P456", "Computer Science");

        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Role: " + student.getRole());
        System.out.println("Major: " + student.getMajor());

        System.out.println("\nProfessor Details:");
        System.out.println("Name: " + professor.getName());
        System.out.println("ID: " + professor.getId());
        System.out.println("Role: " + professor.getRole());
        System.out.println("Department: " + professor.getDepartment());
    }
}
