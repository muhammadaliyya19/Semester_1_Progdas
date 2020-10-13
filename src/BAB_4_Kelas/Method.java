package BAB_4_Kelas;
import java.util.Scanner;
public class Method {
    public static void main(String[]args){/*
        Scanner input = new Scanner(System.in);
        int frek=0;
        System.out.print("Berapa Data Yang Anda Inginkan ? ");
        int elemen = input.nextInt();
        int kotak[] = new int [elemen];
        for(int i = 0 ; i < kotak.length ; i++ ){
            System.out.print("Input elemen ke - " + (i+1) + " = ");
            kotak[i] = input.nextInt();
            
            
        }
    metode(kotak, frek);*/
    int[] baru = {0,1,2};
    ceklah(baru);
        System.out.println(baru[1]);
    }
    public static void ceklah (int [] a){
    int [] berubah = {0,8,0};
    a[0] = berubah[2];
    a[1] = berubah[1];
    a[2] = berubah[2];
    }
    public static int metode(int [] arr , int freq){
    int jumlah = 0 ;
    for(int a = 0 ; a < arr.length ; a++){
    jumlah += arr[a];
    }
        System.out.println("Jumlahnya Adalah " + jumlah);
        System.out.println("Rata - ratanya adalah " + (jumlah/arr.length));
    return jumlah;
    }
    
}
