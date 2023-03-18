public class Main {
    public static void main(String[] args) throws  Exception
    {
        int[] num= {2,4,6,7,54,56};

        System.out.println(power(15));


    }

    static int findSecondlargest(int[] num){
            int max =num[0];
            int temp=0;
            for(int i=0;i< num.length;i++){

                        if(num[i]>max){
                            temp=max;
                            max=num[i];

                        }

            }
            return temp;
    }

    static int power(int n){

        for(int i=2;i<n/2;i++){

            if(i*i*i==n){
                return i;
            }
        }

        return -1;
    }


}