
package BAB_5_Kelas;
// * @Ma'ruf rifa fiantony...
import java.lang.reflect.Array;
import java.util.Scanner;
public class Maruf {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double isi[] = {};
        int pilihan;
        double hasil = 0;
        int jumlah = 0;
        //int [][]grade = new int[][];
        do{System.out.println("Menu");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. SUM");
            System.out.println("5. MAX");
            System.out.println("6. MIN");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = in.nextInt();
                  
   //       Array.setShort(isi);
            //for (int x=0;x<isi.length;x++){
            //hasil = hasil+isi[x];
            switch(pilihan){
                case 1: 
                    System.out.println("Input jumlah data yang di inginkan : ");
                    jumlah = in.nextInt();
                     isi = new double[jumlah];
                for(int x=0;x<isi.length;x++){
                    System.out.print("Masukkan Angka ke"+(x+1)+" : ");
                    isi[x]= in.nextDouble();
                    hasil += isi[x];
                }System.out.println("");
                break;
                case 2:for (int x=0;x<jumlah;x++){
                    System.out.print("Angka ke "+(x+1)+" : "+isi[x]);
                }System.out.println("");
                break;
                case 3:
                    System.out.println("Average : "+(hasil/isi.length));
                    break;
                case 4:
                    System.out.println("SUM : "+hasil);
                    System.out.println("");
                    break;
                case 5:
                    double max = isi[0];
                    for(int i = 1 ; i < (isi.length) ; i++){
                    if(max < isi[i]){max = isi[i];}
                    else{max = max;}
                    }
                    System.out.println("MAX : "+max);
                    break;
                case 6: 
                    double min = isi [0];
                    for (int i=1;i<(isi.length); i++){
                        if(min>isi[i]){min = isi[i];}
                        else{min = min;}
                    }
                    System.out.println("MIN : "+min);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Keluar");
                    break;
                default:
                        System.out.println("Masukkan tidak valid");
                        
                }
                }while (pilihan!=7);
        
        }}