package Latihan_with_Asprak;
import java.util.Scanner;
public class _2_Kelompok_mana {
    public static void main(String[]args){
    Scanner inp = new Scanner(System.in);
    String nama = inp.next("");
    long nim = inp.nextLong();
    String kelamin = inp.next();
    int lahir = inp.nextInt();
    int now = inp.nextInt();
    int dowo = (int) Math.log10(nim) + 1;
        if((kelamin.equalsIgnoreCase("L")) ){
            String club = "Kelompok 1";
            if((now - lahir) < 19){club = "Kelompok 2";}
            else{}
                if(nim%2 == 0){club = "Kelompok 1" ;}
                else{}
            System.out.println(nama + "->" + club);
        }
        else if((kelamin.equalsIgnoreCase("P")) ){
            String club = "Kelompok 2";
            if((now - lahir) < 19){club = "Kelompok 2";}
            else{}
                if(nim%2 == 0){club = "Kelompok 1" ;}
                else{}
            System.out.println(nama + "->" + club);
        }
    

}
}
