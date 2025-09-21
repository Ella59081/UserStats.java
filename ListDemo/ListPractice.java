package ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(120);
        numbers.add(305);
        numbers.add(440);

//        for(int i = 0; i < numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }
//        System.out.println(numbers.subList(0, 3));
        List<Integer> list = Arrays.asList(1, 2, 1);
        System.out.println(isPalindrome(list));

    }
    public static int getHighestNumber (List<Integer> numbers){
        int maxNum = numbers.getFirst();
        for(int num : numbers){
            if(num > maxNum){
                maxNum = num;
            }
        }
        return maxNum;
    }

    public static boolean isPalindrome(List<Integer> items){
        int left = 0;
        int right = items.size() -1;
        while(left < right){
            if(!items.get(left).equals(items.get(right))){
                return false;
            }

            left++;
            right --;

//            System.out.println(items.get(left) + items.get(right));
        }

        System.out.println(items.get(left));
        System.out.println(items.get(right));
        return true;
    }
}
