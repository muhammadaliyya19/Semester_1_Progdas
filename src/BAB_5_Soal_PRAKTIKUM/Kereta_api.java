package BAB_5_Soal_PRAKTIKUM;
import java.util.Scanner;
public class Kereta_api {
    public static void main(String [] args){
    Scanner inp = new Scanner(System.in);
    int pilih = 0 ;
    int k;
    String nama = "Ilemi";
    long nim = 165;
    int tiket=0;
    int harga = 0;
    String [] pesanan = {""};
    String [][] tabel = {{"     Jenis \t"     , "Harga\t"   , " Diskon\t" , "   AC\t\t"     , " Colokan "},
                         {" 1. Ekonomi \t"    , "50.000\t"  , "   2% \t"  , "  Tidak Ada\t" , "Tidak Ada "},
                         {" 2. Bisnis \t"     , "100.000\t" , "   5% \t"  , "  Ada\t\t"     , "Tidak Ada "},
                         {" 3. Eksekutif \t"  , "200.000\t" , "   7% \t"  , "  Ada\t\t"     , "Tidak Ada "},
                         {" 4. Pariwisata \t" , "300.000\t" , "   10% \t" , "  Ada\t\t"     , "Ada "}};
    int hargadiskon[] = {49000,90000,186000,270000};
    do{
        System.out.println("1. Melihat Daftar Kereta Api");
        System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
        System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
        System.out.println("4. Memesan Tiket Kereta Api");
        System.out.println("5. Melihat Pesanan Tiket");
        System.out.print("Masukkan nilai : ");
            pilih = inp.nextInt();
        switch(pilih){
            case 1 : {show(tabel);break;}
            case 2 : {show_skip(tabel , 1, 2, 4); break;}
            case 3 : {show_skip(tabel , 1, 2, 3);break;}
            case 4 : {System.out.println("Memesan Tiket");
                      show_skip(tabel , 3, 4, 5);
                      System.out.print("Masukkan Nama \t = ");
                      nama = inp.next();
                      System.out.print("Masukkan Nim \t = ");
                      nim = inp.nextLong();
                      System.out.print("Pilih Tiket \t = ");
                      tiket = inp.nextInt();
                      switch (tiket){
                          case 1 :{for( k = 0 ; k < 5 ; k++){
                                    if(k == 1 || k == 2) continue;
                                    pesanan[0] += tabel[1][k];
                                    }
                                    harga = hargadiskon[0];
                                  break;}
                          case 2 :{for( k = 0 ; k < 5 ; k++){
                                            if(k == 1 || k == 2) continue;
                                        pesanan[0] += tabel[2][k];
                                    }
                                    harga = hargadiskon[1];
                                  break;}
                          case 3 :{for( k = 0 ; k < 5 ; k++){
                                    if(k == 1 || k == 2) continue;
                                   pesanan[0] += tabel[3][k];
                                   }
                                    harga = hargadiskon[2];
                                  break;}
                          case 4 :{for( k = 0 ; k < 5 ; k++){
                                    if(k == 1 || k == 2) continue;
                                    pesanan[0] += tabel[4][k];
                                    }
                              harga = hargadiskon[3];     
                              break;}
                          default : {System.out.println("Pilihan tidak ada \n" + "Program Dihentikan."); break;}
                                    }
                      break;}
            case 5 : {System.out.println("Pesanan Tiket Anda ");
                      System.out.println("Nama \t = " + nama);
                      System.out.println("NIM \t = " + nim);
                      System.out.println("     Jenis\t" + "   AC\t\t" + " Colokan " + "\tHarga\t");
                      System.out.print(pesanan[0]);
                      System.out.println("\t"+harga);
                    break;}
            default : {System.out.println("Pilihan tidak ada \n" + "Program Dihentikan."); break;}}
    }while(pilih > 0 && pilih < 6);
    }
    static void show(String[][] data ){
    for(int i = 0 ; i < 5 ; i++){
        for (int j = 0 ; j < 5 ; j++ ){
            System.out.print(data[i][j]);
        }
        System.out.println();
    }
    }
    static void show_skip(String[][] data , int batas1 , int batas2 , int batas3 ){
    for(int i = 0 ; i < 5 ; i++){
        for (int j = 0 ; j < 5 ; j++ ){
            if(j == batas1 || j == batas2 || j == batas3){continue;}
            System.out.print(data[i][j]);
        }
        System.out.println();
    }
    }
}
