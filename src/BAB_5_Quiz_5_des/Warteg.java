package BAB_5_Quiz_5_des;
import java.util.Scanner;
public class Warteg {
    public static void main(String[]args){
    Scanner inp = new Scanner(System.in);
    String nama = inp.nextLine();
    int n = inp.nextInt();
    String pesanan2[] = isi(n);
    tampil(nama , pesanan2);
    }
static String[] isi(int menu) {
    Scanner inp = new Scanner(System.in);
    String [] pesanan;
    if(menu <= 20){
        pesanan = new String [menu];
        for(int i = 0 ; i < menu ; i++){
            pesanan[i] = inp.next();
        }
        return pesanan;
        }
    else{return null;}
}
static void tampil(String nama , String pesanan_3[]){
    System.out.println("Pesanan" + nama);
    for(int k = 0 ; k < pesanan_3.length ; k++){
        System.out.println("Pesanan" + (k+1) + " : " + pesanan_3[k]);
    }
}
    
    

}
