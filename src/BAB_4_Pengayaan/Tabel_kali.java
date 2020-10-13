package BAB_4_Pengayaan;
import java.util.Scanner;
public class Tabel_kali {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan baris = " );
        int m = input.nextInt();
            tabel(m);
            
    }
    private static void tabel(int n){
        for(int baris = 1 ; baris<=n+2 ; baris++){
            for(int kolom = 1 ; kolom <= n + 2 ; kolom++){
            if(baris == 1 && kolom == 1){System.out.print("*");}
            if(baris == 2 && kolom < n ){System.out.print("-----");}
            if(kolom == 2 && baris ==1){System.out.print(" | ");}
            if(kolom == 2 && baris > 2){System.out.print(" | ");}
            if(kolom > 2 && baris == 1){System.out.print(kolom - 2 + " ");}
            if(kolom == 1 && baris > 2){System.out.print(baris - 2 );}
            if(kolom > 2 && baris > 2){System.out.print((kolom-2)* (baris-2) + " ");}
           
            }
            System.out.println();
        }
    }
    
}
