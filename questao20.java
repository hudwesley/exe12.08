
package atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao20 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int cod[] = new int[7], maior = 0, menor = 0;
        double vendas[][] = new double[7][6], soma[] = new double[7], 
                media[] = new double[7], maiorV = 0, menorV = 99999;
        for(int i = 0; i<soma.length; i++){
            soma[i] = 0.0;
        }
        for(int i = 0; i<cod.length; i++){
            System.out.println("Digite o código do vendedor " + (i+1));
            cod[i] = tec.nextInt();
            for(int j = 0; j<6; j++){
                System.out.println("Digite a venda do vendedor " + (i+1) + " no dia " + (j+1));
                vendas[i][j] = tec.nextDouble();
                soma[i] += vendas[i][j];
                if(vendas[i][j] >= maiorV){
                    maior = cod[i];
                    maiorV = vendas[i][j];
                }
                if(vendas[i][j] <= menorV){
                    menor = cod[i];
                    menorV = vendas[i][j];
                }
            }
        }
        for(int i = 0; i<cod.length; i++){
            media[i] = soma[i]/6;
            System.out.println("Media do vendedor " + cod[i] + ": " + df.format(media[i]));
        }
        System.out.println("O vendedor que vendeu mais foi o de código " + maior);
        System.out.println("O vendedor que vendeu menos foi o de código " + menor);
    }
    
}
