package ExercicioUm;

public class AlgBusca {
    private int chave;

    public AlgBusca() {
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int buscaSequencial(int[] array, int chave) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == chave) {
                return i;                                   //ele achar o numero desejado no array
            }
        }
        return -1;
    }

    public int buscaBinaria(int[] array, int chave) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            if (array[meio] == chave)
                return meio;

            if (array[meio] < chave) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1;
    }

    public void imprimirResultado(int chave, int indice) {
        if (indice != -1) {
            System.out.println("A chave " + chave + " foi encontrada no índice " + indice + ".");
        } else {
            System.out.println("A chave " + chave + " não foi encontrada.");
        }
    }
}
