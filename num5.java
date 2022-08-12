/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package teste;

import java.util.Scanner;

public class num5 {
    public static void main(String args[]) {
        Scanner tec = new Scanner(System.in);
        int matriz[][] = new int[4][5], somaLinha[] = new int[4], soma = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<5; j++){
                matriz[i][j] = tec.nextInt();
                somaLinha[i] += matriz[i][j];
                soma += matriz[i][j];
            }
        }
        
        System.out.println("Valores");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<5; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Soma de cada Linha");
        for(int i = 0; i<somaLinha.length; i++){
            System.out.println("Soma da linha " + (i+1) + ": " + somaLinha[i]);
        }
        System.out.println("Soma total: " + soma);
    }
}
