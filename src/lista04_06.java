//Escreva um programa que leia um vetor de 30 posições de números inteiros
//(inicializado em tempo de compilação) e mostre somente os positivos com suas
//respectivas posições.

public class lista04_06 {
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        System.out.println("Imprime os núemros e suas respectivas posições:");

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 0) {
                System.out.println("Índice " + i + ": " + vetorA[i]);
            }
        }
    }
}
