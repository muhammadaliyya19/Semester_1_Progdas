package BAB_4_Soal_PRAK_Modul;
import java.util.Scanner;
public class Permutasi_Kombinasi {
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    int n, r,pil = 3;
        do{
            System.out.println("Program Menghitung Permutasi dan Kombinasi");
            System.out.println("\t" + "1. Menghitung Permutasi");
            System.out.println("\t" + "2. Menghitung Kombinasi" );
            System.out.println("\t" + "3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pil = input.nextInt();
            
                switch(pil){
                    case 1 : 
                        System.out.print("Masukkan nilai n = "); 
                        n = input.nextInt();
                        System.out.print("Masukkan nilai r = ");
                        r = input.nextInt();
                        System.out.println("          n!       ");
                        System.out.println("nPr = ---------- = " + permutasi(n,r));
                        System.out.println("        (n-r)!     ");
                        break;
                    case 2 : 
                        System.out.print("Masukkan nilai n = "); 
                        n = input.nextInt();
                        System.out.print("Masukkan nilai r = ");
                        r = input.nextInt();
                        System.out.println("           n !       ");
                        System.out.println("nCr = ------------- = " + kombinasi(n,r));
                        System.out.println("       r! x (n-r)!    ");
                        break;
                    default : break;
                }
        }while (pil !=3);
    }
    static int permutasi(int en , int er){
        int n_min_r = en-er ;
        int total = 0;
        int n_fak = 1;
        int n_min_r_fak = 1;
            for(int i = 1 ; i <= en ; i++){
                n_fak*=i;
            }            
            for(int j = 1 ; j <= n_min_r ; j++){
                n_min_r_fak *= j;
            }
        total = n_fak / n_min_r_fak;
    return total;
    }
    static int kombinasi(int en , int er){
    int n_min_r = en-er ;
        int total = 0;
        int n_fak = 1;
        int r_fak = 1;
        int n_min_r_fak = 1;
            for(int i = 1 ; i <= en ; i++){
                n_fak*=i;
            }
            
            for(int j = 1 ; j <= n_min_r ; j++){
                n_min_r_fak *= j;
            }
            for(int k = 1 ; k <= er ; k++){
                r_fak *= k;
            }
        total = n_fak / (r_fak*n_min_r_fak);
    return total;    
    }
}
