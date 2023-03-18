package externalQuestions;

public class MissingElement {

    public static void main(String[] args) {

        int[] num={1,2,3,4,5,7};

        System.out.println(missingElement(num));
    }

    static int missingElement(int[]num){
        int initialvalue=0;

        for(int i=0;i< num.length;i++){

            initialvalue+=1;
                if(num[i]!=initialvalue){
                    return initialvalue;
                }
        }

        return -1;
    }
}
