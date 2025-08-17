import java.util.Scanner;

public class Main {
    int id;
    String StudentName;
    String Stack;
    Gender gender;

    public Main(String StudentName, String Stack, Gender Gender) {
        this.id = 0;
        this.StudentName = StudentName;
        this.Stack = Stack;
        this.gender = Gender;
    }

    public static void main(String[] args) {
        FirstClass F = new FirstClass();
//      System.out.println(F.addTwo(56, 98));
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter A");
//        double A = scan.nextDouble();
//        System.out.println("Enter B");
//        double B = scan.nextDouble();
//        System.out.println("Enter C");
//        double C = scan.nextDouble();
//        System.out.println("The area of the triangle is: ");
//        System.out.println((FirstClass.areaOfTriangle(A,B,C)));
//        System.out.println(conditionalStatement.ageValidation(19));
//        System.out.println(Practice.checkNumber(9));
        System.out.println("Enter number of students");
        int number = scan.nextInt();
        Main[] students = new Main[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter studentDetails");
            System.out.println("Enter student name");
            String name = scan.next();
            System.out.println("Enter student stack");
            String stack = scan.next();
            scan.nextLine();
            System.out.println("Enter student gender");
            String gender = scan.nextLine().toUpperCase();
            Gender pickedGender = Gender.valueOf(gender.toUpperCase());
            students[i] = new Main(name, stack, pickedGender);
            students[i].id = i + 1;
        }

        System.out.println("\n"+"      Student dashboard \n ------------------------- \n 1.) List of all" + " " +
                "students \n 2.) Get a specific student \n 3.) Get student by gender  \n" +
                " 4.) Update a student \n 5.) Exit");

        int input = scan.nextInt();
        if (input == 1) {
            System.out.println("Student List: \n id \t StudentName \t Stack \t Gender ");
            for (int i = 0; i < number; i++) {
                System.out.println(" " + students[i].id + "\t" + students[i].StudentName + "\t" + students[i].Stack
                        + "\t" + students[i].gender);
            }
        } else if (input == 2) {
            System.out.println("Enter the id of the student");
            int StudentId = scan.nextInt();
            for (int i = 0; i < number; i++){
                if(StudentId == students[i].id){
                    System.out.println(" " + students[i].id + "\t" + students[i].StudentName + "\t" + students[i].Stack
                            + "\t" + students[i].gender);
                }else{
                    System.out.println("No student found");
                }
            }
        } else if (input == 3) {
            scan.nextLine();
            System.out.println("Enter the gender");
            String gender = scan.nextLine().toUpperCase();
            Gender pickedGender = Gender.valueOf(gender.toUpperCase());
//            int StudentId = scan.nextInt();
            for (int i = 0; i < number; i++){
                if(students[i].gender == pickedGender){
                    System.out.println(" " + students[i].id + "\t" + students[i].StudentName + "\t" + students[i].Stack
                            + "\t" + students[i].gender );
                }else {
                    System.out.println("No student was found with this gender");
                }
            }

        } else if (input == 4) {
            System.out.println("Enter the id of the student");
            int StudentId = scan.nextInt();
            System.out.println("Fields : \n name \n stack \n gender ");
            System.out.println("Enter the field to update");
            String field = scan.next();
            for (int i = 0; i < number; i++){
                if(StudentId == students[i].id && field == "name"){
                    System.out.println("Enter new name");
                    String name = scan.next();
                    students[i].StudentName = name;
                    System.out.println(" " + students[i].id + "\t" + students[i].StudentName + "\t" + students[i].Stack
                            + "\t" + students[i].gender);
                } else if (StudentId == students[i].id && field == "stack") {
                    System.out.println("Enter new stack");
                    String stack = scan.next();
                    students[i].Stack = stack;
                    System.out.println(" " + students[i].id + "\t" + students[i].StudentName + "\t" + students[i].Stack
                            + "\t" + students[i].gender);
                } else if (StudentId == students[i].id && field == "gender") {
                    scan.nextLine();
                    System.out.println("Enter new gender");
                    scan.nextLine();
                    String gender = scan.nextLine().toUpperCase();
                    Gender pickedGender = Gender.valueOf(gender.toUpperCase());
                    students[i].gender = pickedGender;
                    System.out.println(" " + students[i].id + "\t" + students[i].StudentName + "\t" + students[i].Stack
                            + "\t" + students[i].gender);
                } else if(StudentId != students[i].id){
                    System.out.println("Invalid id");
                } else{
                    System.out.println("Invalid field");
                }
            }
        } else if (input == 5) {
            scan.close();
        }else{
            System.out.println("Invalid input");
        }
    }
}
