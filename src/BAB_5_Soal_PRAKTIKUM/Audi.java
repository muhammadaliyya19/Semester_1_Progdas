package BAB_5_Soal_PRAKTIKUM;
import java.util.Scanner;
public class Audi {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String tiket="" ;
        String [][]daftar = {{"Ekonomi","50000","2%","Tidak Ada","Tidak Ada"},
                         {"Bisnis","100000","5%","Ada","Tidak Ada"},
                         {"Eksekutif","200000","7%","Ada","Tidak Ada"},
                         {"Pariwisata","300000","10%","Ada","Ada"}};
        for (int i=0;i<100;i++){//akan terus berulang maksimal 100x selama angka yang diinputkan sesuai
System.out.println("===========================================================================");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.print("Masukkan nilai : ");
            int pilih = input.nextInt();
System.out.println("===========================================================================");
            if(pilih<1 || pilih>5){
                break;
            }
                switch (pilih){
                    case 1 :
                       daftarTiket(daftar,0); break;
                    case 2 :
                       daftarTiket(daftar,1);break;      
                    case 3 :
       System.out.printf("%-15.10s%-15.10s%-15.10s%-15.10s%-15.10s\n","Jenis","Harga(Rp)","Diskon","AC","Colokan");
System.out.println("--------------------------------------------------------------------------");                        
                        for (int column=0; column<daftar[0].length; column++){
                            System.out.printf("%-15.10s",daftar[3][column]);
                        }System.out.println();break;
                    case 4 :
                        tiket = pesanTiket(tiket);break;
                    case 5 :
                        tampilkanTiketKu(tiket,daftar); break;
                }
        }
    }
    static void daftarTiket(String daftar[][],int n){
       System.out.printf("%-15.10s%-15.10s%-15.10s%-15.10s%-15.10s\n","Jenis","Harga(Rp)","Diskon","AC","Colokan");
System.out.println("--------------------------------------------------------------------------");  
        for(int row=n;row<daftar.length;row++){
            for(int column=0;column<daftar[3].length;column++){
                System.out.printf("%-15.10s",daftar[row][column]);
            }
            System.out.println();
        }
    }
    static void tampilkanTiketKu(String tiket,String daftar[][]){
       System.out.printf("%-15.10s%-15.10s%-15.10s%-15.10s%-15.10s\n","Jenis","Harga(Rp)","Diskon","AC","Colokan");
System.out.println("--------------------------------------------------------------------------"); 
        if(tiket.equalsIgnoreCase("Ekonomi")){
                for (int column=0; column<daftar[0].length; column++){
                System.out.printf("%-15.10s",daftar[0][column]);
                }}
        else if(tiket.equalsIgnoreCase("Bisnis")){
                for (int column=1; column<daftar[0].length; column++){
                System.out.printf("%-15.10s",daftar[1][column]);
                }}
        else if(tiket.equalsIgnoreCase("Eksekutif")){
                for (int column=2; column<daftar[0].length; column++){
                System.out.printf("%-15.10s",daftar[2][column]);
                }
        }
        else if(tiket.equalsIgnoreCase("Pariwisata")){
                for (int column=3; column<daftar[0].length; column++){
                System.out.printf("%-15.10s",daftar[3][column]);
                }
        }
        else{
          System.out.println();
            System.out.println("Maaf tiket yang anda inputkan tidak tersedia");
        }
    }
    static String pesanTiket(String pesan){
        Scanner input = new Scanner (System.in);
        System.out.print("Jenis yang akan dipesan : ");
        pesan = input.next();
        return pesan;
    }
}

