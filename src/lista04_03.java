//Preencher um vetor B de 10 elementos em tempo de execução com o
//número 10 se o índice do elemento for ímpar, e com o número 20 se for par. Escrever o
//vetor B após o seu total preenchimento.

public class lista04_03 {
    public static void main(String[] args) {

        int tamanho_vetor = 10;
        int[] vetorB = new int[tamanho_vetor];

        for (int i = 0; i < tamanho_vetor; i++) {
            if (i % 2 == 0) {
                vetorB[i] = 20;
            } else {
                vetorB[i] = 10;
            }
            System.out.println("Índice " + i + ": " + vetorB[i]);
        }
    }
}

