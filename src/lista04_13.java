//(ExeVetor13) Faça um programa que leia dois vetores (A e B) de 30 posições e crie um
//terceiro (C) com a intersecção dos dois primeiros, isto é, coloque em C apenas os
//elementos que coexistem em A e B. Mostre C

import java.util.Arrays;

public class lista04_13 {

    public static void main(String[] args) {

        int tamanhovetor = 10;

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {11, 22, 33, 4, 5, 66, 77, 88, 9, 100};
        int[] C = new int[tamanhovetor];

        int indexC = 0;
        for (int i = 0; i < tamanhovetor; i++) {
            for (int j = 0; j < tamanhovetor; j++) {
                if (A[i] == B[j]) {
                    C[indexC] = A[i];
                    indexC++;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
    }
}
