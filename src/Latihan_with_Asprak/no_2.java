package Latihan_with_Asprak;
import java.util.Scanner;
public class no_2 {
     public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String inputNama = kb.nextLine();

        long inputNim = kb.nextLong();
        char inputGender = kb.next().charAt(0);
        int tahunLahir = kb.nextInt();
        int tahunSekarang = kb.nextInt();
        int kelompok = 0;
        int thelong = (int) Math.log10(inputNim) + 1;
         //System.out.println(thelong);
        if(thelong == 15) {
            if (tahunSekarang - tahunLahir > 0) {
                if (inputGender == 'P') {
                    kelompok += 1;
                    if (tahunSekarang - tahunLahir < 19) {
                        if (kelompok == 2) {
                            kelompok--;
                        } else if (kelompok == 1) {
                            kelompok++;
                        }
                    }
                    if (inputNim % 2 == 0) {
                        if (kelompok == 2) {
                            kelompok--;
                        } else if (kelompok == 1) {
                            kelompok++;
                        }
                    }

                } else if (inputGender == 'L') {
                    kelompok += 2;
                    if (tahunSekarang - tahunLahir < 19) {
                        if (kelompok == 2) {
                            kelompok--;
                        } else if (kelompok == 1) {
                            kelompok++;
                        }
                    }
                    if (inputNim % 2 == 0) {
                        if (kelompok == 2) {
                            kelompok--;
                        } else if (kelompok == 1) {
                            kelompok++;
                        }
                    }

                }
            }
        }
        if(kelompok >0 && kelompok<3){
            System.out.println(inputNama + " -> Kelompok " + kelompok);
        }
    
}
}
