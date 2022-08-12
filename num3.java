package teste;

import java.util.Scanner;

public class num3 {

    public static void main(String args[]) {
        Scanner tec = new Scanner(System.in);
        int[] inteiros = new int[10], impar = new int[5], par = new int[5];
        int j = 0, h = 0;
        System.out.println("Vetor de inteiros");
        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = tec.nextInt();
            if(i%2==0){
                par[j] = inteiros[i];
                j++;
            }else{
                impar[h] = inteiros[i];
                h++;
            }
        }
        System.out.println("Vetor inicial");
        for(int i = 0; i<inteiros.length; i++){
            System.out.print(inteiros[i] + " ");
        }
        System.out.println("\nVetor par");
        for(int i = 0;i<par.length;i++){
            System.out.print(par[i] + " ");
        }
        System.out.println("\nVetor impar");
        for(int i = 0; i<impar.length;i++){
            System.out.print(impar[i] + " ");
        }
    }
}
