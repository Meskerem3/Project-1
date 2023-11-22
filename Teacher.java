public class Teacher extends Person {
    private String specialization;

 
    public Teacher(String name, int age, boolean parent_permission, String specialization) {
        super(name,age, parent_permission);
        this.specialization = specialization;
    }

 
    public Teacher(int id, String name, int age, boolean parentPermission, String specialization) {
        super(id, name, age, parentPermission);
        this.specialization = specialization;
    }
   
   
    @Override
 
    public boolean canUseServices() {

        return true;
    }

    public String getSpecialization() {
        return specialization;
    }
}

