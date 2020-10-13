/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_5_Quiz_5_des;


import java.util.Scanner;
//@author InasNabila

public class Inas {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        System.out.println("Perkalian Matriks Ordo 2 x 2");
        System.out.println("----------------------------");

        int i, j;
        System.out.println("Masukkan Nilai Matriks A");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = read.nextInt();
            }
        }
        System.out.println("Masukkan Nilai Matriks B");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = read.nextInt();
            }
        }
        System.out.println("Matriks A");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(A[i][j] + "   ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriks B");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(B[i][j] + "   ");
            }
            System.out.println(" ");
        }

        System.out.println("----------------------------");

        System.out.println("Perkalian Matriks A x B");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.printf("%5s", C[i][j]);
            }
            System.out.println("");
        }
    }
}
