import java.util.Scanner;

public class EmployeeRegistry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        
        // Input employee details
        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            
            employees[i] = new Employee(empId, name, salary);
        }
        
        // Display all employees
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
        
        // Update salary of first employee
        if (employees.length > 0) {
            System.out.print("\nEnter new salary for " + employees[0].getClass().getSimpleName() + ": ");
            double newSalary = scanner.nextDouble();
            employees[0].updateSalary(newSalary);
            
            // Promote second employee (add 10% bonus)
            if (employees.length > 1) {
                promote(employees[1], 0.10); // 10% bonus
            }
            
            // Display updated details
            System.out.println("\nAfter Updates:");
            for (Employee emp : employees) {
                emp.displayEmployee();
            }
        }
        
        scanner.close();
    }
    
    // Static method to promote an employee with bonus
    public static void promote(Employee emp, double bonusPercentage) {
        double currentSalary = emp.getSalary();
        double newSalary = currentSalary * (1 + bonusPercentage);
        emp.setSalary(newSalary);
    }
}
