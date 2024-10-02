//Elabore um programa que leia pelo teclado um vetor de 6 posições e
//também uma variável identificadora (1, 2, 3 ou 4 conforme o menu a seguir) que calcule a
//operação conforme as opções do menu mostrado a seguir. O menu deverá ser impresso
//na tela assim que os elementos do vetor forem lidos apresentando as opções de operação
//para o usuário:
//Escolha a opcao desejada:
//1- Soma dos elementos
//2- Produto dos elementos
//3- Média dos elementos
//4- Mostre o vetor

import java.util.Scanner;

public class lista04_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];


        System.out.println("Digite 6 números inteiros para o vetor:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nEscolha a opção desejada:");
        System.out.println("1 - Soma dos elementos");
        System.out.println("2 - Produto dos elementos");
        System.out.println("3 - Média dos elementos");
        System.out.println("4 - Mostrar o vetor");
        int opcao = scanner.nextInt();


        int soma = 0;
        int produto = 1;

        switch (opcao) {
            case 1:

                for (int i = 0; i < 6; i++) {
                    soma += vetor[i];
                }
                System.out.println("Soma dos elementos: " + soma);
                break;

            case 2:

                for (int i = 0; i < 6; i++) {
                    produto *= vetor[i];
                }
                System.out.println("Produto dos elementos: " + produto);
                break;

            case 3:

                for (int i = 0; i < 6; i++) {
                    soma += vetor[i];
                }
                double media = (double) soma / 6;
                System.out.println("Média dos elementos: " + media);
                break;

            case 4:

                System.out.println("Elementos do vetor:");
                for (int i = 0; i < 6; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }


    }
}




