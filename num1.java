
package teste;

import java.util.Scanner;

public class num1 {

    public static void main(String args[]) {
        Scanner tec = new Scanner(System.in);
        int[] a = new int[8], b = new int[8];
        int auxA, auxB;
        
        //ler os valores de A
        for(int i = 0; i<a.length; i++){
            a[i] = tec.nextInt();
        }
        //ler os valores de B
        for(int i = 0; i<b.length; i++){
            b[i] = tec.nextInt();
        }
        //exibir ordem normal A
        System.out.println("Ordem normal de A");
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\nOrdem normal de B");
        //exibir ordem normal B
        for(int i = 0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println("");
        //trocar os valores
        for(int i = 0; i<a.length; i++){
            auxA = a[i];
            auxB = b[i];
            a[i] = auxB;
            b[i] = auxA;
        }
        // exibir ordem trocada A
        System.out.println("Vetor A com os valores de B");
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\nVetor B com os valores de A");
        // exibir ordem trocada B
        for(int i = 0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        
    }
}
