package BAB_5_Soal_PRAKTIKUM;
import java.util.Scanner;
public class Data {
    public static void main(String [] args){
    Scanner inp = new Scanner(System.in);
    int pilih = 0;
    int i = 0 ;
    int jml = 0 ;
    double data [] = {0};
    do{System.out.printf("1. Input Data \n" + 
                         "2. Lihat Data \n" +
                         "3. Average \n" + 
                         "4. Sum \n" +
                         "5. Max \n" +
                         "6. Min \n" +
                         "7. Keluar \n" + 
                         "Masukkan nilai = ");
       pilih = inp.nextInt();
       switch(pilih){ case 1 : {System.out.print("Jumlah data yang diinput = ");
                                jml = inp.nextInt();
                                data = new double[jml];
                                System.out.println("-----INPUTKAN DATA-----");
                                for(i = 0 ; i < jml ; i++){
                                    System.out.print("Input data ke - " + (i+1) + " = ");
                                    data[i] = inp.nextDouble();
                                }
                               break;}
                      case 2 : {System.out.println("Berikut data yang telah dimasukkan");
                                show(data);
                               break;}
                      case 3 : {System.out.print("Average ( Rata - rata ) = ");
                               average(data); break;}
                      case 4 : {System.out.print("Sum ( Jumlah ) = ");
                                sum(data); break;}
                      case 5 : {System.out.print("Max ( Nilai Maksimum ) = ");
                                max(data); break;}
                      case 6 : {System.out.print("Min ( Nilai Minimum ) = ");
                                min(data); break;}
                      default : System.out.println("Pilihan tidak ada, program dihentikan . . .");break;
                    }
    }while(pilih !=7);
    }
    static void show(double tampil[]){
        for(int i = 0 ; i < tampil.length ; i++){
            System.out.println("Data ke - " + (i+1) + " = " + tampil[i]); 
        }
    }
    static void average(double rata[]){
        double total = 0 ;
        for(int i = 0 ; i < rata.length ; i++){
            total += rata[i];
        }
        double rata_2 = total / rata.length;
        System.out.println(rata_2);
    }
    static void sum(double jml[]){
    double total = 0 ;
        for(int i = 0 ; i < jml.length ; i++){
            total += jml[i];
        }
        System.out.println(total);
    }
    static void max(double max[]){
     double maximum = max[0];
        for (int i = 0; i < max.length; i++) {
            if (maximum < max[i]) {
                maximum = max[i];
            }
        }
        System.out.println(maximum);

    }
    static void min(double min[]){
    double minimum = min[0];
        for (int i = 0; i < min.length; i++) {
            if (minimum > min[i]) {
                minimum = min[i];
            }
        }
        System.out.println(minimum);
    }
}
