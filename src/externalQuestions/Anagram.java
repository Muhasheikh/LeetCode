package externalQuestions;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str = "spar";
        String str1 = "rasp";

        System.out.println(isAnagram(str1,str));
    }

    static boolean isAnagram(String str1,String str2){

        String word = str1.toLowerCase();
        String word2 = str2.toLowerCase();

       char[] letter = word.toCharArray();
       char[] letter2 = word2.toCharArray();

       for(int i=0;i<letter.length;i++){

           for(int j=1+i;j<letter.length;j++){

               if(letter[i]>letter[j]){

                   char temp = letter[j];
                   letter[j] = letter[i];
                   letter[i] = temp;
               }
           }


       }

        for(int i=0;i<letter2.length;i++){

            for(int j=1+i;j<letter2.length;j++){

                if(letter2[i]>letter2[j]){

                    char temp = letter2[j];
                    letter2[j] = letter2[i];
                    letter2[i] = temp;
                }
            }


        }

      boolean ans = Arrays.equals(letter,letter2);

        if(ans)
            return true;





        return false;
    }
}
