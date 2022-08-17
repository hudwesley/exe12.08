
package atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao18 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double[][] salario = new double[3][6], indice = new double[3][6], part = new double[3][6];
        double soma = 0, media;
        int qtdAcima = 0;
        
        // ler os salários mensais
        for(int i = 0; i<3; i++){
            for(int j = 0; j<6; j++){
                System.out.println("Loja " + (i + 1) +  " Salario funcionário " + (j + 1));
               salario[i][j] = tec.nextDouble();
            }   
        }
        // ler o índice de produtivdade
        for(int i = 0; i<3; i++){
            for(int j = 0; j<6; j++){
                System.out.println("Loja " + (i + 1) +  " índice funcionário " + (j + 1));
                indice[i][j] = tec.nextDouble();
                soma += indice[i][j];
                part[i][j] = salario[i][j] * indice[i][j];
            }   
        }
        media = soma/18;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<6; j++){
                if(media < part[i][j]){
                    qtdAcima++;
                }
            }
        }
        System.out.println("Média de partição nos lucros: " + df.format(media));
        System.out.println("Participação nos lucros acima da média: " + qtdAcima);
    }
}
