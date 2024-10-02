//Ler um vetor M de 10 elementos e imprimi-lo (ler pelo teclado os 10
//elementos do tipo inteiro). Troque a seguir o 1o elemento com o 6o, o 2o com o 7o, e assim
//por diante até o 5o com 10o, e escreva o vetor M modificado.

import java.util.Arrays;
import java.util.Scanner;

public class lista04_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorM = new int[10];

        System.out.println("Digite os 10 elementos do vetor M:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorM[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int temp = vetorM[i];
            vetorM[i] = vetorM[9 - i];
            vetorM[9 - i] = temp;
        }
        System.out.println(Arrays.toString(vetorM));
    }

}


