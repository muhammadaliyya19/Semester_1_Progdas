/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_2_ALL;
    import java.util.Scanner;
public class LUAS_bangun{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b,r,pil,panjang,lebar,alas,jari_jari; double phi=3.14;
        System.out.println("Program Penghitungan Luas Bangun Datar ");
        System.out.println("1. Menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("2. Menghitung Luas dan Keliling Lingkaran");
        System.out.println("3. Menghitung Luas dan Keliling Segitiga");
        System.out.print("Pilihan Anda : ");
        pil = input.nextInt();
switch(pil){
        case 1 : System.out.print("Input panjang : ");
                 panjang = input.nextInt();
                 System.out.print("Input lebar : ");
                 lebar = input.nextInt();
                 System.out.println("Keliling Persegi Panjang : " + (2*(panjang+lebar))+"cm");
                 System.out.println("Luas Persegi Panjang : " + (panjang*lebar)+"cm2");
                 break;                 
        case 2 : System.out.print("Input jari – jari lingkaran : ");
                 jari_jari = input.nextInt();
                 System.out.println("Keliling Lingkaran : " + (phi*(2*jari_jari))+"cm");
                 System.out.println("Luas Lingkaran : " + (phi*jari_jari*jari_jari)+"cm2");
                 break;
        case 3 : System.out.print("masukkan a : ");
                 a = input.nextInt();
                 System.out.print("masukkan b : ");
                 b = input.nextInt();
                 System.out.print("masukkan r : ");
                 r = input.nextInt();
                 System.out.println ("Keliling Segitiga \t: "+(a+b+r)+"cm");
                 System.out.printf("Luas Segitiga \t\t: " + (int)((0.5)*a*b) + "cm2");
                 System.out.println();
                 System.out.println("~~ILMI~~");break;
       default : System.out.println("Data tidak ditemukan, program dihentikan. . . .");   break;                              
      }
System.out.print("Pilihan Anda : ");
        int pil2 = input.nextInt();
switch(pil2){
        case 1 : System.out.print("Input panjang : ");
                 panjang = input.nextInt();
                 System.out.print("Input lebar : ");
                 lebar = input.nextInt();
                 System.out.println("Keliling Persegi Panjang : " + (2*(panjang+lebar))+"cm");
                 System.out.println("Luas Persegi Panjang : " + (panjang*lebar)+"cm2");
                 break;                 
        case 2 : System.out.print("Input jari – jari lingkaran : ");
                 jari_jari = input.nextInt();
                 System.out.println("Keliling Lingkaran : " + (phi*(2*jari_jari))+"cm");
                 System.out.println("Luas Lingkaran : " + (phi*jari_jari*jari_jari)+"cm2");
                 break;
        case 3 : System.out.print("masukkan a : ");
                 a = input.nextInt();
                 System.out.print("masukkan b : ");
                 b = input.nextInt();
                 System.out.print("masukkan r : ");
                 r = input.nextInt();
                 System.out.println ("Keliling Segitiga \t: "+(a+b+r)+"cm");
                 System.out.printf("Luas Segitiga \t\t: " + (int)((0.5)*a*b) + "cm2");
                 System.out.println();
                 System.out.println("~~ILMI~~");break;
       default : System.out.println("Data tidak ditemukan, program dihentikan. . . .");   break;  
	}	
}
}

    

