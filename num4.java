/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package teste;

import java.util.Scanner;

public class num4 {
    public static void main(String args[]) {
        Scanner tec = new Scanner(System.in);
        int[] v1 = new int[12], v2 = new int[12];
        for(int i = 0; i<v1.length; i++){
            v1[i] = tec.nextInt();
            v2[i] = v1[i];
            if(v2[i] == 0){
                v2[i] = 1;
            }
        }
        System.out.println("Vetor padrão");
        for(int i = 0; i<v1.length; i++){
            System.out.print(v1[i] + " ");
        }
        System.out.println("\nVetor com 1");
        for(int i = 0; i<v2.length; i++){
            System.out.print(v2[i] + " ");
        }
    }
}
