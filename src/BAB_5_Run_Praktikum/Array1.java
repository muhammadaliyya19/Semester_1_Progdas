package BAB_5_Run_Praktikum;
public class Array1 {
    public static void main(String args[]) {
        int bil[]=new int[10];
        int i;
            for (i=2;i<=8;i++){
                bil[i]=1+(int)(Math.random()*100);
            }
            for (i=0;i<=10;i++) {
            System.out.println(bil[i]);
            }
    }    
}
