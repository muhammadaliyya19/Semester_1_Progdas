package BAB_4_PRAKTIKUM;
import java.util.Scanner;
public class Prak_rekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil;
        System.out.print("Input blangan : ");
        int bilangan = input.nextInt();
        hasil = faktorial(bilangan);
        System.out.println("Nilai dari "+ bilangan + "! adalah "+ hasil);
    }
    
    private static int faktorial(int bil){
    if (bil==1)
        return 1;
    else
        return (bil * faktorial(bil-1));
    }
    
}
