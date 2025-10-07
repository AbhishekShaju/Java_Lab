public class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.printf("Salary: $%.2f\n", salary);
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Getter for salary (useful for promotion method)
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
