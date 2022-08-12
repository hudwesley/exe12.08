/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package teste;

import java.util.Scanner;

public class num6 {
    public static void main(String args[]) {
        Scanner tec = new Scanner(System.in);
        int matriz[][] = new int[8][8], h = 10, somaDiagonal = 0, linha = 0, coluna = 0;
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                matriz[i][j] = h;
                h++;
            }
        }
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j ++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j += 2){
                somaDiagonal += matriz[i][j];
                linha++;
                coluna += 2;
            }
            System.out.println("");
        }
        System.out.println("Soma da diagonal: " + somaDiagonal);
    }
}
