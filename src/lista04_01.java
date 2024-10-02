//Preencher um vetor X de 10 elementos (índices de 0 a 9) em tempo de
//execução com o valor inteiro 30. Escrever o vetor X após seu total preenchimento.

public class lista04_01 {
    public static void main(String[] args) {

        int tamanho_vetor = 10;
        int[] vetor1 = new int[tamanho_vetor];

        vetor1 = new int[tamanho_vetor];
        for (int i = 0; i < tamanho_vetor; i++) {
            vetor1[i] = 30;
            System.out.println(vetor1[i]);
        }


    }
}
// new int[] aloca 10 elementos na memoria do computador
//