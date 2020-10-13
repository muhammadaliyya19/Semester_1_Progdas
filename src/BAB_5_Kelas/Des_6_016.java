package BAB_5_Kelas;
//bahas Array
import java.util.Scanner;
import java.util.Scanner;
public class Des_6_016 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int total = 0 ;
        int rata = 0 ;
    int [][] matriks = new int [3][4];
    for(int i = 0 ; i < 3 ; i++){    
    System.out.println("isi Nilai Mhs " + (i+1));
        for(int j = 0 ; j<3 ; j++){
        matriks [i][j] = in.nextInt();
            
        matriks[2][2] += matriks[i][j] ;
        }
        System.out.println("Rata - rata mhs " + (i+1) + " = " + (matriks[2][2]/3));
    }
    
}
}