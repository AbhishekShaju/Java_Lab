public class Professor extends Person {
    private String department;

    public Professor(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
