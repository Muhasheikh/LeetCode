package leetCode.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FairCandySwitch {

    public static void main(String[] args) {
        int[] aliceSizes = {1,2};
        int[] bobSizes = {2,3};

       // System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
        System.out.println(Arrays.toString(fairCandySwap2(aliceSizes,bobSizes)));
    }

    /** static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes){

        int[] results = new int[2];
        int Asum = 0;
        int Bsum = 0;
        int temp;




            for(int i=0;i<aliceSizes.length;i++){

                for (int j=0;j<bobSizes.length;j++){


                         temp = bobSizes[j];
                        bobSizes[j] = aliceSizes[i];
                        aliceSizes[i] = temp;






                    for(int n : aliceSizes){

                        Asum += n;
                    }

                    for(int s : bobSizes){

                        Bsum += s;
                    }

                    if(Asum==Bsum){

                        if(aliceSizes.length==bobSizes.length){
                            results[0] =  bobSizes[i];
                            results[1] =  aliceSizes[j];
                        }
                        else {
                            results[0] =  bobSizes[j];
                            results[1] =  aliceSizes[i];
                        }


                        return results;
                    }

                    temp = aliceSizes[i];
                    aliceSizes[i] =  bobSizes[j] ;
                    bobSizes[j] = temp;

                    Asum = 0;
                     Bsum = 0;


                }





            }



        return results;

    } **/

    static int[] fairCandySwap2(int[] aliceSizes, int[] bobSizes){

        int[] results = new int[2];
        int totalA = 0, totalB=0;
        List<Integer> list = new ArrayList<>();

        for(int n: aliceSizes){

            totalA+=n;
        }

        for(int j : bobSizes){

            totalB+=j;
            list.add(j);
        }

        int delta = (totalB-totalA)/2;

        for(int a : aliceSizes){

            if(list.contains(a+delta)){

                results[0]=a;
                results[1] = a + delta;
                return results;
            }
        }

        return null;

    }
}
