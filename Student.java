
public class Student extends Person {

    private String name;
    private Classroom classroom;


    public Student(String name) {
        super();
        this.name = name;
    }



 


    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
        classroom.addStudent(this); // Adding student to the classroom
    }


    public boolean canUseServices() {
        return true;
 

       public Student(int id, String name, int age, boolean parentPermission, String classroom) {
        super(id, name, age, parentPermission);
        this.classroom = classroom;
 
    }
}

