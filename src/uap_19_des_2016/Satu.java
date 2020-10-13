package uap_19_des_2016;
import java.util.Scanner;
public class Satu {
    public static void main(String[]args){
    Scanner inp = new Scanner(System.in);
    int jml = inp.nextInt();
    int i = 0; 
    int j = 0;
    int k = 0;
    String [] customers = new String [jml];
        for(i = 0 ; i < jml ; i++){
            customers[i] = inp.next();
        }
        int temp = jml;
        for(int m = 0 ; m < jml ; m++){
            
            if(customers[m].equalsIgnoreCase("Plankton")){
                temp--;
                customers = new String[temp];
                for(int n = 0 ; n < jml ; n++){
                    
                    if(customers[n].equalsIgnoreCase("Plankton")){
                            customers[n] = customers[n];
                            }
                    
                    else if(customers[jml-1].equalsIgnoreCase("Plaankton")){
                            customers[jml-1] = "Patrick";
                    }
                    else{customers[n] = customers[n+1];}
                }
            }
        }
        //Rek(customers,jml);
        /* for(k = 0 ; k < jml ; k++){
            if(k<jml-1){
                if(customers[k].equals("Plankton")){
                customers[k] = customers[k+1];
                jml-=1;
                customers[jml - 1] = "Patrick";
                }
            }
        
            if(customers[jml-1].equals("Plankton")){
                customers[jml-1] = "Patrick";
            }
        }
        */
        for( j = 0 ; j < jml ; j++){
            System.out.print(customers[j] + " ");     
        }
        
            
            
            
            
    }
    public static String [] Rek(String[]plank, int jum){
        String [] daftar = plank;
        int temp = jum;
        
    return daftar;}
}
