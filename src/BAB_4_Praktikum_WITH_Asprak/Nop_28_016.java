package BAB_4_Praktikum_WITH_Asprak;
import java.util.Scanner;
public class Nop_28_016 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
        // contoh REKURSIF
    int y = f(13);
        System.out.println(y);
        }
        public static int f(int x){
    if (x>=10){x = x-2; return f(x);
    }
    else {
        return x;}
    }
    
}
