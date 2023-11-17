
public class Student extends Person {

    private String name;
    private Classroom classroom;


    public Student(String name) {
        super();
        this.name = name;
    }


    public Student(String name, int age, boolean parent_permission) {
        super( name, age, parent_permission);
        this.classroom = classroom;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
        classroom.addStudent(this); // Adding student to the classroom
    }


    public boolean canUseServices() {
        return true;
    }
}

