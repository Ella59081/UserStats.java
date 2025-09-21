import java.util.Arrays;

public class Practice {

    public static void main (String[] args) {
//        System.out.println(checkNumber(0));
//        System.out.println(multiplicationTable(5));
//        System.out.println(addEvenNumbers());
//        System.out.println(java.util.Arrays.toString(firstTenNumbers()));
//        System.out.println(java.util.Arrays.toString(reversedArray(new int[]{3, 446, 4, 5, 10, 1, 2})));
//        System.out.println(java.util.Arrays.toString(minAndMax(new int[]{3, 2, 56, 56, -1, 16})));
//        System.out.println(arrayAverage(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(checkElement(5, new int[]{2,6 , 5, 7, 8, 5}));
//        System.out.println(addEven(new int[]{2,4, 6, 8,0,13, 3, 4}));
//        System.out.println(java.util.Arrays.toString(mergeArrays(new int[]{1, 2, 3}, new int[]{1, 5, 3})));
//        System.out.println(countOccurrence(3, new int[]{2, 3, 3, 4}));
        System.out.println(checkPalindromeArr(new int[]{2, 8, 4, 2}));
    }

    public static String checkNumber (int num){
        if(num > 0 && num != 0){
            return "The number is positive";
        }else if(num < 0 && num != 0){
            return "The number is negative";
        }else{
            return "The number is zero";
        }
    }

    public static String multiplicationTable(int number){
        String result = "";
        for(int i = 0; i <= 12; i++){
//            System.out.println(number + "x" + i + "=" + number*i + "\n");
            result += number + "x" + i + "=" + number*i + "\n";
        }
        return result;
    }

    public static int addEvenNumbers(){
        int sum = 0;
        for(int i=0; i<=50; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static int[] firstTenNumbers(){
        int[] numbers = new int [11];
        for(int i = 0; i<=10; i++){
            numbers[i] = i;
            System.out.println(i);
        }
        return numbers;
    }

    public static int[] reversedArray(int[] array){
        int[] reverse = new int[array.length];
        for(int i= array.length -1; i >= 0; i--){
            reverse[reverse.length - 1 - i] = array[i];
        }
        return reverse;
    }
    
    public static int[] minAndMax(int[] array){
        int[] numbers = new int[2];
        int max = array[0];
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            numbers[0] = max;
            numbers[1] = min;
        }
        return numbers;
    }

    public static double arrayAverage(int[] array){
        double sum = 0;
        double count = 0;
        for (int i : array) {
            sum += i;
            count++;

        }
        return sum/count;
    }

    public static String checkElement (int number, int[] array){
        String result = "";
        boolean isPresent = false;
        for (int i: array){
            if (i == number) {
                isPresent = true;
                break;
            }
        }
        if (isPresent){
            result += "the number : " + number + " is present in the array";
        }else{
            result += "the number : " + number + " is not present in the array";
        }
        return result;
    }
    
    public static int addEven (int[] array){
        int sumEven = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                sumEven += array[i];
            }
        }
        return sumEven;
    }

//    public static int[] sortArray(int[] array){
//        int length = array.length;
//        int[] sortedArray = {};
//        int min = array[0];
//        for(int i = 0; i < array.length; i++){
//            if(array[i] < min){
//                sortedArray = new int[]{min};
//            }
//            if(array[i] < array[])
//        }
//    }

    public static int[] mergeArrays(int[] array1, int[] array2){
        int[] mergedArrays = new int[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            mergedArrays[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++){
            int nextIndex = array1.length;
            mergedArrays[i+nextIndex] = array2[i];
        }

        return mergedArrays;
    }

    public static String countOccurrence(int value, int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(value ==  array[i]){
                count++;
            }
        }
        return value + " occurred " + count + " times";
    }

    public static String checkPalindromeArr (int[] arr){
        String result = "";
        int startIndex = 0;
        int[] reversed = new int[arr.length];
        for(int i = arr.length -1; i >= 0; i--){
            reversed[startIndex] = arr[i];
            startIndex++;
        }
        if(Arrays.equals(reversed, arr)){
            result += "This array is palindromic";
        }else{
            result += "This array is not palindromic";
        }
        System.out.println(Arrays.toString(reversed));
        return result;
    }
}