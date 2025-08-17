public class conditionalStatement {

    public static String ageValidation(int age ){
        if(age < 18){
            return "You are not eligible to vote";
        }else if(age >= 18 && age <= 60){
            return "You are eligible to vote";
        }else{
            return "You are a senior citizen and eligible to vote";
        }
    }

    public int add(int a, int b){
        return a + b;
    }
    public int subtract (int a, int b){
        return a - b;
    }
    public int multiplication (int a, int b){
        return a * b;
    }
    public double divide (double a, double b){
        if(b == 0){
            System.out.println("Division by zero is not allowed");
        }

        double result  =  a/b;
        return result;
    }
}
