package BAB_3_UTP_Quiz_LOOP;
import java.util.Scanner;
public class Star {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int baris = input.nextInt();
    if(baris < 20){
        for(int i = 1 ; i <= baris ; i++){
            for(int kolom = baris ; kolom > 0 ; kolom--){
                if (kolom > i){System.out.print(" ");}
                else {System.out.print("*");}
                }
                System.out.println();
            }
        }
       
    }    
}
