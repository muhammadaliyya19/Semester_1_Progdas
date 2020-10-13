package BAB_4_PRAKTIKUM;
import java.util.Scanner;
public class Fibo {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
        System.out.print("Input total suku = ");
        int n = input.nextInt();
        for(int i = 0 ; i < n ; i++){
        System.out.print(fibonaci(i) + " ");
        }
    }
    static int fibonaci(int bil){
    if(bil == 0 || bil == 1) return bil;
    else return fibonaci(bil-2) + fibonaci(bil-1);
    }
}
