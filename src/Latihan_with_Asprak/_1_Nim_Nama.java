package Latihan_with_Asprak;
import java.util.Scanner;
public class _1_Nim_Nama {
    	public static void main(String [] args){
    	Scanner inp = new Scanner(System.in);
    	long nim = inp.nextLong();
        int dowo = (int) Math.log10(nim) + 1;
        String name = inp.next();
        
        int pjg = name.length();
        char [] karakter = new char [pjg];
            if(dowo==15){
                if(pjg >= 10){
                for(int i = 0 ; i < 10 ; i++){
                karakter[i] = name.charAt(i);
                System.out.print(karakter[i]);
                
                }
                System.out.print(" (Ada spasi di akhir)");
            }
            else{
                for(int i = 0 ; i < pjg ; i++){
                karakter[i] = name.charAt(i);
                System.out.print(karakter[i]);        
                }
            }
        } 
	
    }
    
}
