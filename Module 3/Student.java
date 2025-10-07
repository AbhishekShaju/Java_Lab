public class Student extends Person {
    private String major;

    public Student(String name, String id, String major) {
        super(name, id);
        this.major = major;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
