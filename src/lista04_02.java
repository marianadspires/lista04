//Preencher um vetor A de 10 elementos (índices de 0 a 9) em tempo de
//execução com os números inteiros 10, 20, 30, 40, 50, ..., 100. Escrever o vetor A após o
//seu total preenchimento.

public class lista04_02 {
    public static void main(String[] args) {

        int tamanho_vetor = 10;
        int[] vetor1 = new int[tamanho_vetor];

        vetor1 = new int[tamanho_vetor];
        for (int i = 0; i < tamanho_vetor; i++) {
            vetor1[i] = (i + 1) * 10;
            System.out.println(vetor1[i]);
        }


    }
}

