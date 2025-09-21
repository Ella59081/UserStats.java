public class Students extends Employees{
    private final String studentNo;
    private final Departments dept;

    public Students(String id, String firstName, String lastName, int age, String studentNo, Departments dept){
        super(id, firstName, lastName,age);
        this.studentNo = studentNo;
        this.dept = dept;
    }

    public String studentDetails(){
        return super.personInfo() + "\nStudentNo: " + studentNo + "\nDepartment: " + dept;
    }
}
