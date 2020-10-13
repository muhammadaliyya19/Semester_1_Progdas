package BAB_2_ALL;
import java.util.Scanner;
public class BERAT_BADAN {
    public static void main(String[]args){
Scanner input = new Scanner(System.in);
double bb,t1,t2,IMT_1,IMT_2,bb2;
System.out.printf("Berat Badan (Kg) \t\t= ");
bb=input.nextDouble();
System.out.print("Tinggi Badan (m) \t\t= ");
t1 = input.nextDouble();
IMT_1 = bb/(t1*t1);
System.out.printf("IMT \t\t\t\t= "+"%.2f \n",IMT_1);

    if (IMT_1<=18.5){System.out.println("Termasuk Kurus");}

    else if (IMT_1>18.5 && IMT_1<=25){System.out.println("Termasuk Normal");}
    
    else if (IMT_1>25 && IMT_1<=30){System.out.println("Termasuk Gemuk");}
    
    else {System.out.println("Kegemukan");}
System.out.println();
System.out.printf("Berat Badan (Kg)\t\t= ");
bb2=input.nextDouble();
System.out.print("Tinggi Badan (m)\t\t= ");
t2 = input.nextDouble();
IMT_2 = bb2/(t2*t2);
System.out.printf("IMT \t\t\t\t= "+"%.2f\n", IMT_2);
    if (IMT_2<=18.5){System.out.println("Termasuk Kurus");}

    else if (IMT_2>18.5 && IMT_2<=25){System.out.println("Termasuk Normal");}
    
    else if (IMT_2>25 && IMT_2<=30){System.out.println("Termasuk Gemuk");}
    
    else {System.out.println("Kegemukan");}
    
    System.out.println("~~ILMI~~");
    }
}
