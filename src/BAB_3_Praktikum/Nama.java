package BAB_3_Praktikum;
public class Nama {
    public static void main(String[] args) {
//char I        
        for(int baris=1;baris<=5;baris++){
            for(int kolom = 1;kolom<=5;kolom++){
            if(((baris ==1 || baris==5)&&(kolom!=1 && kolom!=5))||((kolom==3)  )){
                System.out.print("I ");
                           }
            else{System.out.print("  ");}
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
//char L
        for(int baris=1;baris<=5;baris++){
            for(int kolom = 1; kolom<=4 ; kolom++){
            if(kolom != 1 && baris != 5){
                System.out.print("  ");}
            else{System.out.print("L ");}
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
//char M
        for(int baris = 1 ; baris<=5 ; baris++){
            for(int kolom = 1 ; kolom <=5 ; kolom++){
            if((kolom == 1 || kolom == 5) || ((kolom == 2 || kolom == 4) && baris ==2) || (baris == 3 && kolom ==3)){
                System.out.print("M ");}
            else{System.out.print("  ");}
            }
            System.out.println();
        }
    
   }
}

