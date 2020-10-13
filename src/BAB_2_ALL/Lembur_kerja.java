package BAB_2_ALL;
import java.util.Scanner;
public class Lembur_kerja {
    public static void main(String[]args){
Scanner input = new Scanner(System.in);
int perjam,jam,upah,jamlembur,jamkurang,upahlembur,denda,total;
System.out.print("Jam Kerja     = ");
jam = input.nextInt();
        if(jam>60){
            jamlembur = jam-60;
            upah = 60*5000;
            upahlembur = jamlembur*6000;
            denda = 0;            
            total = upah+upahlembur;
            System.out.println("Upah          = Rp. " + upah);
            System.out.println("Lembur        = Rp. " + upahlembur);
            System.out.println("Denda         = Rp. " + denda);
            System.out.println("=======================");
            System.out.println("Total         = Rp. " + total);}
        else if(jam<50){
            jamkurang = 50-jam;
            upah = jam*5000;
            upahlembur = 0;
            denda = jamkurang*1000;            
            total = upah-denda;
            System.out.println("Upah          = Rp. " + upah);
            System.out.println("Lembur        = Rp. " + upahlembur);
            System.out.println("Denda         = Rp. " + denda);
            System.out.println("=======================");
            System.out.println("Total         = Rp. " + total);}
         else { 
            jamlembur = 0;
            upah = jam*5000;
            upahlembur = jamlembur*6000;
            denda = 0;            
            total = upah+upahlembur;
            System.out.println("Upah          = Rp. " + upah);
            System.out.println("Lembur        = Rp. " + upahlembur);
            System.out.println("Denda         = Rp. " + denda);
            System.out.println("=======================");
            System.out.println("Total         = Rp. " + total);
                    }
        System.out.println(" ");
        int perjam2,jam2,upah2,jamlembur2,jamkurang2,upahlembur2,denda2,total2;
System.out.print("Jam Kerja     = ");
jam2 = input.nextInt();
        if(jam2>60){
            jamlembur2 = jam2-60;
            upah2 = 60*5000;
            upahlembur2 = jamlembur2*6000;
            denda2 = 0;            
            total2 = upah2+upahlembur2;
            System.out.println("Upah          = Rp. " + upah2);
            System.out.println("Lembur        = Rp. " + upahlembur2);
            System.out.println("Denda         = Rp. " + denda2);
            System.out.println("=======================");
            System.out.println("Total         = Rp. " + total2);}
        else if(jam2<50){
            jamkurang2 = 50-jam2;
            upah2 = jam2*5000;
            upahlembur2 = 0;
            denda2 = jamkurang2*1000;            
            total2 = upah2-denda2;
            System.out.println("Upah          = Rp. " + upah2);
            System.out.println("Lembur        = Rp. " + upahlembur2);
            System.out.println("Denda         = Rp. " + denda2);
            System.out.println("=======================");
            System.out.println("Total         = Rp. " + total2);}
         else { 
            jamlembur2 = 0;
            upah2 = jam2*5000;
            upahlembur2 = jamlembur2*6000;
            denda2 = 0;            
            total2 = upah2+upahlembur2;
            System.out.println("Upah          = Rp. " + upah2);
            System.out.println("Lembur        = Rp. " + upahlembur2);
            System.out.println("Denda         = Rp. " + denda2);
            System.out.println("=======================");
            System.out.println("Total         = Rp. " + total2);
                    }
        System.out.println(" ");
    int perjam3,jam3,upah3,jamlembur3,jamkurang3,upahlembur3,denda3,total3;
System.out.print("Jam Kerja     = ");
jam3 = input.nextInt();
        if(jam3>60){
            jamlembur3 = jam-60;
            upah3 = 60*5000;
            upahlembur3 = jamlembur3*6000;
            denda3 = 0;            
            total3 = upah3+upahlembur3;
            System.out.println("Upah          = Rp. " + upah3);
            System.out.println("Lembur        = Rp. " + upahlembur3);
            System.out.println("Denda         = Rp. " + denda3);
            System.out.println("=======================");
            System.out.println("Total         = Rp. " + total3);}
        else if(jam3<50){
            jamkurang3 = 50-jam3;
            upah3 = jam3*5000;
            upahlembur3 = 0;
            denda3 = jamkurang3*1000;            
            total3 = upah3-denda3;
            System.out.println("Upah          = Rp. " + upah3);
            System.out.println("Lembur        = Rp. " + upahlembur3);
            System.out.println("Denda         = Rp. " + denda3);
            System.out.println("=======================");
            System.out.println("Total         = Rp. " + total3);}
         else { 
            jamlembur3 = 0;
            upah3 = jam3*5000;
            upahlembur3 = jamlembur3*6000;
            denda3 = 0;            
            total3 = upah3+upahlembur3;
            System.out.println("Upah          = Rp. " + upah3);
            System.out.println("Lembur        = Rp. " + upahlembur3);
            System.out.println("Denda         = Rp. " + denda3);
            System.out.println("=======================");
            System.out.println("Total         = Rp. " + total3);
                    }
        System.out.println("~~ILMI~~");
    }
    }    

