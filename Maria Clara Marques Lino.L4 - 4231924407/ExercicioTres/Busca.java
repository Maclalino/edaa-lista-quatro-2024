package ExercicioTres;

import ExercicioUm.AlgBusca;

/**
 * Busca
 */
public class Busca {

    
    public static void main(String[] args) {
        AlgBusca algBusca = new AlgBusca();

        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
                65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
                75, 76, 77, 78, 79, 80, 81,
                82, 83, 84, 85, 86, 87, 88, 89,
                90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

        algBusca.setChave(99);
        int indice = algBusca.buscaBinaria(listaNumeros, algBusca.getChave());
        algBusca.imprimirResultado(algBusca.getChave(), indice);

        algBusca.setChave(81);
        int indiceDois = algBusca.buscaBinaria(listaNumeros, algBusca.getChave());
        algBusca.imprimirResultado(algBusca.getChave(), indiceDois);
    }
}

    

