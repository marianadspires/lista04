//Escreva um programa que leia diversos números inteiros fornecidos pelo
//usuário e distribua esses valores entre dois vetores: o vetor dos ímpares e o vetor dos
//pares. Cada um terá tamanho de 10 elementos. O término do algoritmo se dará quando o
//usuário digitar zero ou um dos vetores tiver sido totalmente preenchido. Mostre o
//conteúdo dos dois vetores no final.

import java.util.Arrays;
import java.util.Scanner;

public class lista04_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < 20; i++) {
            if (contadorPares == 10 || contadorImpares == 10) {
                break;
            }

            System.out.print("Insira um número inteiro: ");
            int numero = scanner.nextInt();


            if (numero % 2 == 0) {
                if (contadorPares < 10) {
                    pares[contadorPares] = numero;
                    contadorPares++;
                }
            } else {
                if (contadorImpares < 10) {
                    impares[contadorImpares] = numero;
                    contadorImpares++;
                }
            }
        }

        System.out.println(Arrays.toString(pares));

        System.out.println(Arrays.toString(impares));

    }
}


