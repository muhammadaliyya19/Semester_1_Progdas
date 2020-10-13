package BAB_3_Praktikum;
import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        double pi = 3.14;
        do {
            System.out.println("Menu");
            System.out.println ("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println( "2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("   MASUKKAN PILIHAN ANDA : ");
            menu = input.nextInt();

            if (menu ==0){
                System.out.print("Memberhentikan program.");
                break;
                         }
            else if(menu == 1){
                    System.out.println("VOLUME BALOK");
                    System.out.print("Input panjang  : ");
                    int panjang = input.nextInt();
                    System.out.print("Input lebar    : ");
                    int lebar = input.nextInt();
                    System.out.print("Input tinggi   : ");
                    int tinggi = input.nextInt();

                    int volumebalok = panjang * tinggi * lebar;
                    System.out.println("Volume balok : " + volumebalok);
                    System.out.println("");
                    
            }
            else if (menu == 2){
                    System.out.println("VOLUME BOLA");
                    System.out.print("Input jari-jari  : ");
                    double radius = input.nextInt();

                    double volumebola = (pi * radius * radius * radius / 3) * 4;
                    System.out.println("Volume balok   : " + volumebola);
                    System.out.println("");
                         }
            else if (menu == 3){
                    System.out.println("VOLUME KERUCUT");
                    System.out.print("Input jari-jari  : ");
                    double rad = input.nextDouble();
                    System.out.print("Input tinggi     : ");
                    double tinggi = input.nextDouble();
                    double volumekerucut = (pi * (rad * rad) * tinggi) / 3;
                    System.out.println("Volume Kerucut : " + volumekerucut);
                    System.out.println("");
                        }
            else if (menu == 4){
                    System.out.println("VOLUME SILINDER");
                    System.out.print("Input jari-jari  : ");
                    double radius = input.nextDouble();
                    System.out.print("Input tinggi     : ");
                    double tinggi = input.nextDouble();
                    double volumesilinder = pi * radius * radius * tinggi;
                    System.out.println("Volume Kerucut : " + volumesilinder);
                    System.out.println("");
                         }
            else if (menu == 5){
                    System.out.println("VOLUME LIMAS SEGITIGA");
                    System.out.print("Input alas                : ");
                    double alas = input.nextDouble();
                    System.out.print("Input tinggi segitiga alas: ");
                   double tinggisegi_3 = input.nextDouble();
             System.out.print("Input tinggi limas        : ");
                    double tinggilimas = input.nextDouble();
                    double volumelimass = (alas * tinggisegi_3 * tinggilimas) / 3;
                    System.out.print("Volume limas segitiga   : " + volumelimass);
                    System.out.print("");
                         }
            else {
                    System.out.print("Input salah, masukkan ulang input.");
                 }
        } while (menu != 0);
    }
}



