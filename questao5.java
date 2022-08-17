package javaapplication1;

public class questao5 {

    public static void main(String args[]) {
        int matriz[][] = new int[10][10], transp[][] = new int[10][10], h = 100;

        System.out.println("Matriz normal");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = h;
                h++;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nTransposta");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                transp[i][j] = matriz[j][i];
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(transp[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
