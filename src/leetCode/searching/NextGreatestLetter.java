package leetCode.searching;

public class NextGreatestLetter {

    public static void main(String[] args) {

        char[] letters = {'a','b','d'};

        System.out.println(nextGreatestLetter(letters,'e'));
    }

    static char nextGreatestLetter(char[] letters,char target){

        int start =0;
        int end = letters.length-1;

        while(start<=end){

            int mid = start+(end-start)/2;


            if(target>letters[mid]){

                start = mid+1;
            }

            if(target<letters[mid]){
                end = mid-1;
            }
        }

        return letters[start%letters.length];
    }
}