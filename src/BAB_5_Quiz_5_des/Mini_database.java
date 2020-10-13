package BAB_5_Quiz_5_des;
import java.util.Scanner;
public class Mini_database {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        int n; 
        String nama;        
        n = inp.nextInt();
        nama = inp.next();
    int [] data=input(n);
    tampil(nama,data);
    
    }
    public static int[] input (int a){
        Scanner inp = new Scanner(System.in);
            int bilangan[];
            if(a <= 20){
                bilangan = new int[a];
                    for(int i = 0 ; i < a ; i++){
                    bilangan[i] = inp.nextInt();
                    }
                    return bilangan;
            }
            else{return null;}
    }
    public static void tampil(String letter , int bil[]){
    for (int i = 0 ; i < bil.length ; i++){
        System.out.println(letter + "[" + (i+1) + "]" + bil[i]);
    }
    }
}
