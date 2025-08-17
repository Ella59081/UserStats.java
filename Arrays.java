import java.lang.reflect.Array;

public class Arrays {
    public static void main (String[] args){
        int[] numbers = {20, 34, 19, 90, 67};
//        System.out.println(numbers[0]);
//        for(int i=0; i< numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

//        for(int number: numbers){
//            System.out.println(number);
//        }
//
//        String[] names = new String[3];
//        names[0] = "Ella";
//        names[1] = "read";
//        names[2] = "lila";

        System.out.println(java.util.Arrays.toString(Arrays.evenNumbers(numbers)));
    }


    public static int sumElement(int[] numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }

    public static int[] evenNumbers(int[] numbers){
        int[] evenNumbers = new int[numbers.length];

        for(int number = 0; number < numbers.length; number++){

            if(numbers[number] % 2 == 0 ) {
//                return new int[] {numbers[number]};
//                System.out.println(number);

                evenNumbers[number] = numbers[number];
            }else{
                return new int[] {};
            }

        }
        return evenNumbers;
    }
}
