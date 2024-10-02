// Escreva um programa que leia pelo teclado 2 vetores (A e B) de 10 elementos
//inteiros. Crie um terceiro vetor (C) que seja a união dos dois primeiros (10 + 10). Mostre o
//vetor resultante.

public class lista04_09 {
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorB = {11, 22, 33, 4, 5, 66, 77, 88, 9, 100};
        int[] vetorC = new int[20];

        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + 10] = vetorB[i];
        }

        System.out.println("A união de A e B):");
        for (int i = 0; i < 20; i++) {
            System.out.println("C[" + i + "] = " + vetorC[i]);
        }
    }
}
