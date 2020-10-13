package BAB_4_PRAKTIKUM;
import java.util.*;
public class Prak_arr_retval {
    public static void main(String[] args) {
        int [] arr = {2,7,5,19,4,11,3,27,17,10};
        arr = sort(arr);
        showbig_to_small(arr);
        for (int i=0; i<arr.length; i++){
            System.out.println("Index ke " + (i+1) + " : " +
            arr[i]);
        }
    }
    static void showbig_to_small(int ahay[]){
    for(int a = 0 ; a<10 ; a++){
            System.out.print(ahay[a] + " ");
        }
        System.out.println();
    }
    private static int []sort(int [] acak){
        int bil1 = 0;
        int bil2 = 0;
        while(bil1<acak.length){
            bil2=bil1;
                while (bil2<acak.length){
                    if (acak[bil1]<acak[bil2]){
                        int temp = acak[bil1];
                        acak [bil1] = acak [bil2];
                        acak[bil2] = temp;
                    }
                bil2++;
                }
            bil1++;
        }
    return acak;
    }
}
