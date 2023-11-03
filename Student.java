public class Student extends Person {
    private String classroom;

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Student(int id, String name, int age, boolean parentPermission, String classroom) {
        super(id, name, age, parentPermission);
        this.classroom = classroom;
    }
}
