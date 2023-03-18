package externalQuestions;

public class MissingAlphabet {

    public static void main(String[] args) {
        char[] letters ={'a','b','d'};

        String[] alphabet ={"a","b","d"};
        missingAlpha(letters);
       missingAlpha(alphabet);
    }

    static void missingAlpha(char letter[]){
        int word = letter[0];
        for(int i=1;i<letter.length;i++){

            word+=1;
            if(letter[i]!=(char)(word)){
                System.out.println((char)(word));
            }
        }

    }

    static void missingAlpha(String letter[]){
        int c = letter[0].charAt(0);

        for(int i=0;i<letter.length;i++){

            if(letter[i].charAt(0)!=c){

                System.out.println(String.valueOf((char)(c)));
            }
            c++;
        }


    }
}


