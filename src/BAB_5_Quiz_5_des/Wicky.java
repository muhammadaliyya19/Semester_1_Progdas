package BAB_5_Quiz_5_des;
import java.util.Scanner;
public class Wicky {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
        System.out.println("-------------------------");
        System.out.print("Cara memasukan inputan : "
                + "\n n n"
                + "\n n n");
        System.out.println("\n-------------------------");      
        
        int nilai1[][];
        nilai1=new int[2][2];
        
        System.out.println();
        System.out.println("Matrik A ");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {             
                nilai1[i][j]=in.nextInt();
            }
        }
        System.out.println();
        
        int nilai2[][];
        nilai2=new int [2][2];
        
        System.out.println("Matrik B");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                nilai2[i][j]=in.nextInt();
            }
        }
        System.out.println();
        
        int hasil[][];
        hasil=new int [2][2];
        
        System.out.println("Hasil perkalian Matrik A dan Matrik B : ");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j]=0;
                for (int k = 0; k < 2; k++) {
                    hasil[i][j]+=nilai1[i][k]*nilai2[k][j];
                }
                System.out.print(hasil[i][j]+" ");
            }System.out.println(); 
        }
    }
    
}
