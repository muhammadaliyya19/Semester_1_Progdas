package BAB_4_Soal_PRAK_Modul;
import java.util.Scanner;
public class Prima_bukan {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Prima = ");
        int bilangan = in.nextInt();
        prima(bilangan);
        System.out.println("Program menentukan bilangan prima antara 1 - 100");
        antara();
    }
    public static String prima(int bil){
    String a = bil + " termasuk bilangan prima";
    String b = bil + " termasuk bukan bilangan prima";
    int count = 0;
        for(int i  = 1 ; i <= bil ; i++){
        if(bil % i == 0){count ++;}
        else{}
        }
        if (count > 2){System.out.println(b);}
        else{System.out.println(a);}
        return a;
    }
    public static int antara(){
        int c;
    for(c = 1 ; c <= 100 ; c++){
        int count = 0;
        for(int d = 1 ; d <= 100 ; d++){
        if(c % d ==0){count++;}
        else{}
        }
    if(count == 2){System.out.print(c + " ");}
    }
    return c;}
}
