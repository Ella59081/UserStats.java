public class Strings {
    public static void main(String[] args) {
//       String schoolName = "Aptech Port-Harcourt";
//        System.out.println(schoolName.length());
//        System.out.println(schoolName.charAt(0));
//        System.out.println(greet("Lovey"));
//       schoolName.contains("a");
//        System.out.println(schoolName.contains("a"));
//        System.out.println(capitalise("ella"));
//        System.out.println(capitaliseFirstLetter("hi im a good girl"));
//        System.out.println(java.util.Arrays.toString(vowelAndCon("Eleanor")));
//        System.out.println(reverseWords("shs is a good girl i love her"));
        System.out.println(separateNames("i am ella, sdsh, ss, sf, forever, happy"));
    }
    public static String greet(String name){
        return "Hello " + name.toUpperCase() + "!";

    }
    public static String capitalise(String name){
        return name.substring(0, 1).toUpperCase()+name.substring(1);
    }
    public static String capitaliseFirstLetter(String sentence){
        String result = "";
        String[] splitStr = sentence.split(" ");
        for(int i = 0; i < splitStr.length; i++){
            String rest = splitStr[i].substring(1);
            result += splitStr[i].substring(0, 1).toUpperCase() + rest + " ";
        }
        return result;
    }

//    public static int longestSubstr(String string) {
//        String[] letter = string.split("");
//        String longest = "";
//        for (int i = 0; i < letter.length; i++) {
//            boolean isLast = letter[i] == letter.length-1
//            if(letter[i] != letter[i+1] ){
//                longest += letter[i];
//           }
//        }
//        return longest.length();
//    }

    //reverse words in a sentence
    public static String reverseWords(String word){
        String result = "";
        String[] wrdArray = word.split(" ");
        for(int i = wrdArray.length -1 ; i >= 0; i--){
            result += wrdArray[i] + " ";
        }
        return result;
    }

    //count vowels and consonant in any given string
    public static int[] vowelAndCon(String word){
        String convertedWd= word.toLowerCase();
        String vowels = "aeiou";
        int vowelCount = 0;
        int consonants =0;
        for(int i=0; i < convertedWd.length(); i++){
            //vowels.indexOf(word.charAt(i)) != -1
            if(vowels.contains(java.util.Objects.toString(convertedWd.charAt(i)))){
                vowelCount++;
            }else{
                consonants++;
            }
        }
        return new int[] {vowelCount, consonants};

    }

//separate names by comma
    public static String separateNames(String names){
        String result = "";
        String[] splitNames = names.split(",");
        for(int i = 0 ; i < splitNames.length; i++){
            result += splitNames[i] + "\n";
        }
        return result;
    }
//reverse words in a sentence
//public static String reverseWord(String words){
//    String[] s = words.split(" ");
//    StringBuilder sb = new StringBuilder();
//    for(int i = s.length-1; i>=0; i++){
//        sb.append(s[i]).append(" ");
//    }
//    return sb.toString().trim();
//}

//return the length of the longest substring with all unigue characters
//input: "abcabcbb" outuput: 3

}

//Type casting is the process of converting a variable from one data type to another
//Encapsulation involves hiding information from users.
//Inheritance involves using extend keyword
//inheritance allows for code reusability
//inheritance is one of the key features of oop. it allows you to create a class
//from an already existing class