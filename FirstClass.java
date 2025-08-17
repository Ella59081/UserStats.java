public class FirstClass {
    //Addition of two numbers
    public int addTwo (int a, int b){
        return a + b;
    }

    //Calculation of force = ma
    public double force (int mass, double acceleration){
        return mass * acceleration;
    }

    //area of a triangle; S = (A=B=C)/2
    //Area = S(S-A)(S-B)(S-C)

    public static double areaOfTriangle(double A, double B, double C){
        double S = (A+B+C)/2;
        return Math.sqrt(S*((S-A) * (S-B) * (S-C)));

    }


}
// a constructor ia a method that always has the same name with the class
