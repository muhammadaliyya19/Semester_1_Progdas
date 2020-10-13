package BAB_3_Praktikum;
import java.util.Scanner;
public class Star{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Masukan nilai n = ");
      int n = input.nextInt();
      
      for(int baris=1;baris<=n;baris++){
          for(int kolom = n;kolom>0;kolom--){
            if(kolom>baris){System.out.print("  ");}
            else{System.out.print("* ");}
                                            }
      System.out.println();
                                        }
   }	
}

