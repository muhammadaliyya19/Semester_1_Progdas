package BAB_3_Progdas_Kelas;
import java.util.Scanner;
public class Bintang_ {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Baris = ");
        int baris = inp.nextInt();
    Bintang_ timur = new Bintang_();
    timur.looping();
    }
 void looping(){
     for(int baris = 1 ; baris <=4 ; baris++){
            for (int kolom = 4; kolom > 0 ; kolom--) {
                if (kolom>baris){System.out.print(" ");}
                else{System.out.print("*" + "");}
            }
            System.out.println();

        }

    }    
}
