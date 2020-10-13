package Latihan_with_Asprak;
import java.util.Scanner;

public class no_6 {
    public static void main(String[] args) {
        boolean kita = false;
        double[][] holdingcell;
        Scanner input = new Scanner(System.in);
        int inKasus = input.nextInt();
        if(inKasus>0 & inKasus<=100){
            kita = true;
        }


        if(kita){
            holdingcell = new double[inKasus][4];
            String[] bayar = new String[inKasus];
            for (int i = 0; i < inKasus; i++) {
                double inL = input.nextDouble(),inR = input.nextDouble(), inJ = input.nextDouble(),inX = input.nextDouble();
                String pembayaran = input.next();
                holdingcell[i][0] = inL;
                holdingcell[i][1] = inR;
                holdingcell[i][2] = inJ;
                holdingcell[i][3] = inX;
                bayar[i]=pembayaran;
            }
                for(int i = 0; i < inKasus; i++) {
                    if(bayar[i].equals("bayar")){
                        System.out.println((int) holdingcell[i][3]- (int)(holdingcell[i][0]*holdingcell[i][1]*holdingcell[i][2]));
                    } else {
                        System.out.println("-"+(int) (holdingcell[i][0]*holdingcell[i][1]*holdingcell[i][2]));
                    }
                }
        }


    }
}
