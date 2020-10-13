package BAB_3_UTP_Quiz_LOOP;
import java.util.Scanner;
public class PRIMA {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    int counter;    
    int i ;
    int j ;
        for(j = 1 ; j <= 100 ; j++){
            counter = 0 ;
            for(i = 1 ; i <= 100 ; i++){
                if(j % i == 0){
                    counter++;
                }
            }
            if(counter == 2){System.out.print(j + " ");}
        }
    }
}
        
    
    
    
    
    
    
    

