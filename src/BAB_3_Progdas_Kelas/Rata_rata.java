package BAB_3_Progdas_Kelas;
import java.util.Scanner;
public class Rata_rata {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
        System.out.print("Jumlah data = ");
        double data = input.nextDouble();
        System.out.println("Input data = ");
        double inp , jumlah , awal = 0 ; 
            for(int i = 1 ; i <= data ; i++){
                inp = input.nextInt();
                jumlah = awal + inp;
                awal = jumlah;
            }
            System.out.println("Total = " + awal);
            System.out.println("Rata - rata = " + (awal / data));
        
    
    }
    
}
