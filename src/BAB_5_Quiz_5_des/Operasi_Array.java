package BAB_5_Quiz_5_des;
import java.util.Scanner;
public class Operasi_Array {
    public static void main(String[]args){
    int[][]satu = masuk_1();
    int[][] dua = masuk_2();
    kalikan(satu,dua);
    }
    
static int [][]masuk_1(){
Scanner inp = new Scanner(System.in);
    System.out.println("Input Komponen Matriks Pertama");
    int [][] first = new int [2][2];
    for(int b = 0 ; b < first.length ; b++){
        for(int k = 0 ; k < first[0].length ; k++){
            first[b][k] = inp.nextInt();
        }
    }
    System.out.println("Matriksnya ");
    for(int i = 0 ; i < 2 ; i++){
        for(int j = 0 ; j < 2 ; j++){
        System.out.print(first[i][j] + " ");
        }
    System.out.println();    
    }
return first;}

static int [][] masuk_2(){
    Scanner inp = new Scanner(System.in);
    System.out.println("Input Komponen Matriks Kedua");
    int [][] second = new int [2][2];
    for(int b = 0 ; b < second.length ; b++){
        for(int k = 0 ; k < second[0].length ; k++){
            second[b][k] = inp.nextInt();
        }
    }
    System.out.println("Matriksnya ");
    for(int i = 0 ; i < 2 ; i++){
        for(int j = 0 ; j < 2 ; j++){
        System.out.print(second[i][j] + " ");
        }
    System.out.println();    
    }
return second;}

static void kalikan(int satu[][], int dua[][] ){
int [][] hasil = new int [2][2] ;
    for(int m = 0 ; m < 2 ; m++){
        for(int n = 0 ; n < 2 ; n++){
            for(int o = 0 ; o < 2 ; o++ ){
            hasil[m][n] += satu[m][o] * dua[o][n];
            }
        }
    }
    System.out.println("Hasil Perkalian Matriks Pertama dan Kedua Adalah");
for(int i = 0 ; i < 2 ; i++){
    for(int j = 0 ; j < 2 ; j++){
        System.out.print(hasil[i][j] + " ");
    }
    System.out.println();    
}
}
}