package BAB_4_PRAKTIKUM;
 import java.util.Scanner;
public class Prak_void {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int pilih ;
    do {
        System.out.println("Program Menghitung Sederhana ");
        System.out.println("Pilih salah satu :");
        System.out.println("1. Segitiga Sembarang");
        System.out.println("2. Segitiga Siku - siku");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
        switch(pilih){
            case 1 : SembarangSegitiga();break;
            case 2 : segitiga();break;
        }
       } while(pilih != 3);
    }
    private static void SembarangSegitiga(){
        Scanner in = new Scanner(System.in);
        double alas, tinggiSegitiga, luas, keliling, r,s;
        System.out.print("Masukkan panjang alas segitiga :");
        alas = in.nextDouble();
        System.out.print("Masukkan tinggi segitiga :");
        tinggiSegitiga = in.nextDouble();
        System.out.print("Masukkan panjang sisi miring :");
        r = in.nextDouble();
        keliling = (alas + tinggiSegitiga + r);
        s = 0.5 * keliling;
        luas = (s*(s-alas)*(s-tinggiSegitiga)*(s-r));
        System.out.printf("Keliling segitiga = %.2f\n",keliling );
        System.out.printf("Luas segitiga = %.2f\n",luas);
    }
        static void segitiga(){
            Scanner in = new Scanner(System.in);
            double alas, tinggi, r, luas , keliling;
            System.out.print("Masukkan alas segitiga : ");
            alas = in.nextDouble();
            System.out.print("Masukkan tinggi segitiga : ");
            tinggi = in.nextDouble();
            r = Math.sqrt((alas*alas)+(tinggi*tinggi));
            luas = 0.5 * tinggi * alas;
            keliling =  alas + r + tinggi;
            System.out.printf("Luas Segitiga: " + "%.2f\n",luas); 
            System.out.printf("Keliling Segitiga: " + "%.2f\n",keliling);
            System.out.println("");
             
        }
}