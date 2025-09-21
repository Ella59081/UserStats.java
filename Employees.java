public class Employees {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final int age;

    public static void main(String[] args) {
        Students stud1 = new Students("1", "some", "love", 12, "63574", Departments.Fullstack);
        System.out.println(stud1.studentDetails());
    }

    public Employees(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String personInfo(){
        return "Employees{" + "id='" + id + '\'' + "firstName= " + firstName + "lastName = '" + lastName
                + "age= " + age + '}';
    }
}

