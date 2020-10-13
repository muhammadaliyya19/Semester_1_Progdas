package BAB_6_Kelas_String;

import java.util.Scanner;

public class Coba_Rahasia {
    public static void main (String [] args){
    Scanner inp = new Scanner(System.in);
    int i , j;
    String depan = "";
    String belakang = "";
    boolean bool = false;
    String Password = inp.next();
    double a = Password.length();
    do{
        if(a%2 == 0 ){
            
            for(i = 0 ; i < (a/2) ; i++){depan += Password.charAt(i);}
            for(i = (int) (a-1) ; i > ((a/2)-1) ; i--){belakang += Password.charAt(i);}
                if(depan.equalsIgnoreCase(belakang)){System.out.println("Terbuka");}
                else{System.out.println("Coba lagi"); }
            
        }
        else{
        
            for(i = 0 ; i < ((a/2)-0.5) ; i++){
                if(Password.charAt(i) == ' '){continue;}
                else{depan += Password.charAt(i);}
            }
            for(i = (int) (a-1) ; i > ((a/2)-0.5) ; i--){
                if(Password.charAt(i)==' '){continue;}
                else{belakang += Password.charAt(i);}
            }
                if(depan.equalsIgnoreCase(belakang)){System.out.println("Terbuka");}
                else{System.out.println("Coba lagi");}
            }
      }while(bool);
        
    }
    }

    

