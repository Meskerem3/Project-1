public class Student extends Person {
    private String classroom;
    public Student(String name, int age, boolean parent_permission) {
        super( name, age, parent_permission);
        this.classroom = classroom;
    }


    public boolean canUseServices() {
        return true;
    }
}
