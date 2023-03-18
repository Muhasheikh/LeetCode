package externalQuestions;

public class Palindrome {

    public static void main(String[] args) {
         String str = "wow";
         String str1 = "wow";

        System.out.println(isPalindrome(str,str1));
    }

    static boolean isPalindrome(String str,String str2){

        String word = str.toLowerCase();
        String word1 = str2.toLowerCase();

        if(str.length()!= str2.length()){
            return false;
        }



        for(int i=0;i<str.length();i++){

            char start = word.charAt(i);
            char end = word1.charAt(str2.length()-i-1);

            if(start!=end){
                return false;
            }

        }



        return true;
    }
}
