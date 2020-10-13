package Latihan_with_Asprak;
import java.util.ArrayList;
import java.util.Scanner;
public class no_5 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        String[] arraydata = new String[jumlah];
        ArrayList<String> list = new ArrayList<String>();
        input.nextLine();
        for (int i = 0; i < arraydata.length; i++) {
            String holder = input.nextLine();
            arraydata[i] = holder;
        }
        boolean janganStop=true;
        while(janganStop){
            String holder = input.nextLine();
            list.add(holder);
            if(holder.equals("STOP"))janganStop=false;

        }
        for (int i = 0; i < list.size(); i++) {
            cariAda(arraydata,list.get(i));
        }
    }
    public static void cariAda(String[] arraydata, String cari){
        int ada=0;
        for (int i = 0; i < arraydata.length; i++) {
            if(arraydata[i].equals(cari)){
                ada =1;
            }
        }
        if(ada==1){
            System.out.println("ADA");
        } else {
            System.out.println("TIDAK ADA");
        }
    }
}
