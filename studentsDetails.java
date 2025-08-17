public class studentsDetails {
    int id;
    String StudentName;
    String Stack;
    Gender Gender;

    public  studentsDetails(){
        this.id = 1;

    }

    studentsDetails studentObj = new studentsDetails();

    public static String students(int numberOfStudents, String studentName, String stack, Gender gender){
        String result = "";
        for(int i = 0; i == 0; i++){
            result += "id" + "\t" + "StudentName" + "\t" + "Stack" + "\t" + "Gender" + "\n"
                    + 1 + "\t" + studentName + "\t" +  "\t" + stack + "\t" + gender;
        }
        return result;
    }
}
