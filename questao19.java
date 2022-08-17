
package atividades;

import java.util.Scanner;

public class questao19 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String cand[] = new String[5];
        double notas[][] = new double[5][4], maiorNota[] = new double[5];
        maiorNota[0] = 0.0;
        
        // ler os nomes
        for(int i = 0; i<cand.length; i++){
            System.out.println("Nome candidato " + (i+1));
            cand[i] = tec.nextLine();
        }
        //tec.nextLine();
        
        // ler as notas e comparar
        for(int i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                System.out.println(cand[i] + " - Nota Teste " + (j+1));
                notas[i][j] = tec.nextDouble();
                if(maiorNota[i] < notas[i][j]){
                    maiorNota[i] = notas[i][j];
                }
            }
        }
        // exibir a maior nota de cada candidato
        for(int  i = 0; i< cand.length; i++){
            System.out.println(cand[i] + " Maior nota: " + maiorNota[i]);
        }
    }
}
