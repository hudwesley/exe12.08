/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package teste;

import java.util.Scanner;

public class num2 {

    public static void main(String args[]) {
        Scanner tec = new Scanner(System.in);
        int[] v1 = new int[10], v2 = new int[10], v3 = new int[10];
        for(int i = 0; i<v1.length; i++){
            v1[i] = tec.nextInt();
        }
        for(int i = 0; i<v2.length; i++){
            v2[i] = tec.nextInt();
        }
        for(int i = 0; i<v3.length; i++){
            v3[i] = v1[i] * v2[i];
        }
        System.out.println("Vetor 1");
        for(int i = 0; i<v1.length; i++){
            System.out.print(v1[i] + " ");
        }
        System.out.println("\nVetor 2");
        for(int i = 0; i<v2.length; i++){
            System.out.print(v2[i] + " ");
        }
        System.out.println("\nVetor 3");
        for(int i = 0; i<v3.length; i++){
            System.out.print(v3[i] + " ");
        }
    }
}
