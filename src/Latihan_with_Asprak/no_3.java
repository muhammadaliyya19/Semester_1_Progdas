package Latihan_with_Asprak;

import java.util.Scanner;

public class no_3 {
      public static void main(String[] args) {
        int op1;
        Scanner input = new Scanner(System.in);
        String wowMan = input.next();
        try {
            op1 = Integer.parseInt(wowMan);
            System.out.println((char) op1);
        }
        catch (NumberFormatException e) {
            if(wowMan.length()==1){
                System.out.println((int) wowMan.charAt(0));
            } else {
                System.out.println(":(");
            }
        }

    }
    
}
