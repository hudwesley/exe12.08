package atividades;
public class questao17 {

    public static void main(String[] args) {
        int matriz[][] = new int[8][8], h = 2, somaDiagonalP = 0, somaDiagonalS = 1,
                linha1 = 7, linha2 = 0, coluna1 = 7, coluna2 = 0;
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                matriz[i][j] = h;
                //h++;
            }
        }
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j ++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        for(int i = 0; i<8; i++){
            somaDiagonalS *= matriz[linha1][coluna1];
            linha1--;
            coluna1--;
        }
        for(int i = 0; i<8; i++){
            somaDiagonalP += matriz[linha2][coluna2];
            linha2++;
            coluna2++;
        }
        System.out.println("Soma da diagonal primária: " + somaDiagonalP);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalS);
    }
}
