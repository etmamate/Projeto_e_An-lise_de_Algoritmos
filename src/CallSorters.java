import java.io.IOException;

import fileio.ReadFile;
import sorting.BubbleSort;
import sorting.SelectionSort;

public class CallSorters {
    public static Long callSorter(String inputFileName) throws IOException {

        int opcao = 0;
        Long inicio, fim;
        for (int i = 0; i <= 6; i++) {
            if (opcao == 0) {
                // BubbleSort
                inicio = System.currentTimeMillis();
                System.out.println("Realizando a ordenação...");
                int[] lista_numero_1 = ReadFile.readFile(inputFileName);
                BubbleSort.sort(lista_numero_1);
                fim = System.currentTimeMillis();
                System.out.println("Tempo final Bubble Sort " + (fim - inicio));

                opcao++;
            } else if (opcao == 1) {
                inicio = System.currentTimeMillis();
                System.out.println("Realizando a ordenação...");
                int[] lista_numero_2 = ReadFile.readFile(inputFileName);
                SelectionSort.sort(lista_numero_2);
                fim = System.currentTimeMillis();

                System.out.println("Tempo final SelectinSort " + (fim - inicio));
                opcao++;
            } else if(opcao == 2){

            }
        }

        return null;
    }
}
