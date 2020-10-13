package BAB_3_Progdas_Kelas;
import java.util.Scanner;
import java.lang.Math;
public class Perpangkatan {
    public static void main(String [] args){
        Perpangkatan square = new Perpangkatan();
        square.pangkat();
    }
    void pangkat(){
       Scanner inp = new Scanner(System.in);
        System.out.print("Angka = ");
        double angka = inp.nextDouble();
        System.out.print("Pangkat = ");
        double pangkat = inp.nextDouble();
        double faktor = 1,awal = 1;
            if(pangkat > 0 ){
            for(int i = 1 ; i < pangkat ; i++){
                angka = faktor*angka;
                faktor = awal*angka;               
            }
            System.out.println("Hasil Perpangkatan Adalah = "+ angka );
            }
        else if (pangkat < 0){
            for(int i = 0 ; i > pangkat ; i--){
            faktor = angka;
            angka*= faktor; 
            }
            System.out.println("Hasil Perpangkatan Adalah = 1 / " + angka + " = " + (1/angka));   
            }
        else if (pangkat > 0 && pangkat%pangkat > 0 ){
        
        }
        else if (pangkat < 0 && pangkat%pangkat > 0 ){
        
        }
    }
}
