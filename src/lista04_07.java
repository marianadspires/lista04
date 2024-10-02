//(ExeVetor07) Ler um vetor X de 10 elementos (ler pelo teclado os 10 elementos do tipo
//inteiro). Crie um vetor Y da seguinte forma: (a) os elementos de ordem par de Y (elementos
//com índice 0, 2, 4, 6, 8) receberão os respectivos elementos de X multiplicados por 2; (b)
//Os elementos de ordem ímpar de Y (elementos com índices 1, 3, 5, 7, 9) receberão os
//respectivos elementos de X multiplicados por 3. Escrever o vetor Y.

import java.util.Arrays;
import java.util.Scanner;

public class lista04_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorX = new int[10];
        int[] vetorY = new int[10];

        System.out.println("Informe os 10 números do vetor X:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + i + ": ");
            vetorX[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetorY[i] = vetorX[i] * 2;
            } else {
                vetorY[i] = vetorX[i] * 3;
            }
        }

        System.out.println(Arrays.toString(vetorY));

    }
}


