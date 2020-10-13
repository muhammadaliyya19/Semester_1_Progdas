package BAB_4_Praktikum_WITH_Asprak;
import java.util.Scanner;
public class Faktorial {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int y = f(n);
        System.out.println(n+ "! = " + y);
    }
    
    private static int f(int x){
    if(x ==1){return 1;}
    else{
    return (x* f(x-1));}
    }
    
}
