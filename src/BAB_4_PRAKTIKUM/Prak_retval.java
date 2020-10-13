package BAB_4_PRAKTIKUM;
import java.util.Scanner;
public class Prak_retval {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
            System.out.println("Program Pendataan Mahasiswa");
            System.out.println();
                String nim1, nama1, nim2, nama2, jur1, jur2;
            System.out.println("Masukkan Tahun sekarang = ");
            int now_year = in.nextInt();
            System.out.println("Masukkan Bulan sekarang = ");
            int now_month = in.nextInt();
            System.out.println("Masukkan Tanggal sekarang = ");
            int date_now = in.nextInt();
            System.out.println("Masukan NIM Mahasiswa 1 : ");
                nim1 = in.next();
            System.out.println("Masukan Nama Mahasiswa 1 : ");
                nama1 = in.next();
            System.out.println("Masukan Jurusan Mahasiswa 1 : ");
                jur1 = in.next();
            System.out.println("Masukkan Tahun Lahir = ");
            int year = in.nextInt();
            System.out.println("Masukkan Bulan Lahir = ");
            int month = in.nextInt();
            System.out.println("Masukkan Tanggal Lahir = ");
            int date = in.nextInt();
            System.out.println("Masukan NIM Mahasiswa 2 : ");
                nim2 = in.next();
            System.out.println("Masukan Nama Mahasiswa 2 : ");
                nama2 = in.next();
            System.out.println("Masukan Jurusan Mahasiswa 2 : ");
                jur2 = in.next();
            System.out.println("Masukkan Tahun Lahir = ");
            int year_2 = in.nextInt();
            System.out.println("Masukkan Bulan Lahir = ");
            int month_2 = in.nextInt();
            System.out.println("Masukkan Tanggal Lahir = ");
            int date_2 = in.nextInt();
                int umur_1 = (12-month)+(now_month)+(12*((now_year) - year + 1 ));
                int umur_2 = (12-month_2)+(now_month)+(12*((now_year) - year_2 + 1 ));
            System.out.println("Data Mahasiswa : ");
            System.out.println(showData (nim1,nama1,jur1, umur_1));    
            System.out.println(showData(nim2,nama2,jur2, umur_2));
    }
    public static String showData (String nim, String nama, String jurusan, int status){
        String stat = "";
        if(status > 240){stat = "Adult";}
        else if(status < 240){stat = "Teen";}
        String show = "\nnim : \n"+nim + "\nnama : \n"+ nama + "\nJurusan : \n"+ jurusan + "\n Status : \n" + stat;
        return show;
    }
}



