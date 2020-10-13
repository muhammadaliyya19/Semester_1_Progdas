package uap_19_des_2016;
import java.util.Scanner;
public class Dua {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        int jumlah = inp.nextInt();
        int tinggi [] = new int[jumlah];
        
        for(int i = 0 ; i < jumlah ; i++){
        tinggi [i] = inp.nextInt();
        }
        for(int j = 0 ; j <= jumlah ; j++ ){
            if(tinggi[j]>=1 && tinggi[j] < 20){
            for(int baris = 0 ; baris < tinggi[j]+1 ; baris++){
            for(int kolom =  ((tinggi[j]*2) + 1) ; kolom > 0 ; kolom-- ){
                if(kolom < baris){System.out.print("*");}
                else{System.out.print("");}
            }
                System.out.println();
            }
            }
            
            
        }
        
        
        
        
        
        }
    
    }
    

