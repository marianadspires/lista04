//Escreva um programa que leia dois vetores (A e B) de 10 posições e faça a
//multiplicação dos elementos de mesmo índice em ambos os vetores colocando o resultado
//em um terceiro vetor (C). Mostre o vetor resultante.

public class lista04_05 {
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorC = new int[10];

        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.println("O resultado das multiplicações de A e B:");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + vetorC[i]);
        }
    }
}
