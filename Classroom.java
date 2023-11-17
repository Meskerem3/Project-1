import java.util.ArrayList;
import java.util.List;

public class Classroom {

        private String label;
        private List<Student> students;

        // Constructor
        public Classroom(String label) {
            this.label = label;
            this.students = new ArrayList<>();
        }

        // Getter and Setter for label
        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        // Setter and Getter for has-many relationship (students)
        public void addStudent(Student student) {
            students.add(student);
            student.setClassroom(this); // Setting the classroom for the student
        }

        public List<Student> getStudents() {
            return students;
        }
    }



