//Escreva um programa que leia e mostre um vetor de 20 elementos inteiros
//(inicializado em tempo de compilação). A seguir, conte e diga quantos valores pares
//existem no vetor.

public class lista04_04 {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int countPares = 0;

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Índice " + i + ": " + vetor[i]);
            if (vetor[i] % 2 != 0) {
                countPares++;
            }
        }

        System.out.println("Os valores pares no vetor são: " + countPares);
    }
}
