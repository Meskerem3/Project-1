public class Person {
    private int id;
    private String name;
    private int age;
    private boolean parent_Permission;

    public Person(int id, String name, int age, boolean parent_Permission) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.parent_Permission = parent_Permission;
    }

    public Person(int id, int age) {
        this(id, "unknown", age, true);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isOfAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return isOfAge() || parent_Permission;
    }
}
