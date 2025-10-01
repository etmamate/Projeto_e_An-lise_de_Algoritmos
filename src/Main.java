import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import fileio.ReadFile;
import sorting.BubbleSort;
import sorting.HeapSort;
import sorting.InsertionSort;
import sorting.MergeSort;
import sorting.QuickSort;
import sorting.SelectionSort;

public class Main {

    public static String uploadFile() {

        JFileChooser fileChooser = new JFileChooser();

        int result = fileChooser.showOpenDialog(null);

        try {
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();
                // System.out.println("Arquivo selecionado " + filePath);
                return filePath;
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

        return null;

    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String menu = """
                -----------------------------------
                        [1] - BubbleSort
                        [2] - SelectionSort
                        [3] - QuickSort
                        [4] - InsertionSort
                        [5] - HeapSort
                        [6] - MergeSort
                -----------------------------------
                """;

        String filePath = uploadFile();

        String inputFileName = filePath;

        // "src/doc/arquivoteste.gr"


        // try {
        // int[] dataArray = ReadFile.readFile(inputFileName);
        // int dataSize = dataArray.length;

        // System.out.println("Arquivo lido com sucesso" + inputFileName);
        // System.out.println("Total de números (pesos) carregados" + dataSize);
        // } catch (IOException e) {
        // System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        // e.printStackTrace();
        // }

        long inicio, fim;

        int opcao;
        do {
            System.out.println(menu);

            opcao = scn.nextInt();

            switch (opcao) {
                case 1:

                    inicio = System.currentTimeMillis();
                    System.out.println("Realizando a ordenação...");
                    int[] lista_numero_1 = ReadFile.readFile(inputFileName);
                    BubbleSort.sort(lista_numero_1);
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo final Bubble Sort " + (fim - inicio));

                    break;

                case 2:

                    inicio = System.currentTimeMillis();
                    System.out.println("Realizando a ordenação...");
                    int[] lista_numero_2 = ReadFile.readFile(inputFileName);
                    SelectionSort.sort(lista_numero_2);
                    fim = System.currentTimeMillis();

                    System.out.println("Tempo final SelectinSort " + (fim - inicio));

                    break;

                case 3:

                    inicio = System.currentTimeMillis();
                    System.out.println("Realizando a ordenação...");
                    int[] lista_numero_3 = ReadFile.readFile(inputFileName);
                    QuickSort.sort(lista_numero_3);
                    fim = System.currentTimeMillis();

                    System.out.println("Tempo final QuickSort " + (fim - inicio));

                    break;

                case 4:

                    inicio = System.currentTimeMillis();
                    System.out.println("Realizando a ordenação...");
                    int[] lista_numero_4 = ReadFile.readFile(inputFileName);
                    InsertionSort.sort(lista_numero_4);
                    fim = System.currentTimeMillis();

                    System.out.println("Tempo final InsertionSort " + (fim - inicio));

                    break;

                case 5:

                    inicio = System.currentTimeMillis();
                    System.out.println("Realizando a ordenação...");
                    int[] lista_numero_5 = ReadFile.readFile(inputFileName);
                    HeapSort.sort(lista_numero_5);
                    fim = System.currentTimeMillis();

                    System.out.println("Tempo final HeapSort " + (fim - inicio));

                    break;

                case 6:

                    try {

                        inicio = System.currentTimeMillis();
                        System.out.println("Realizando a ordenação...");
                        int[] lista_numero_6 = ReadFile.readFile(inputFileName);
                        MergeSort.sort(lista_numero_6);
                        fim = System.currentTimeMillis();
                        System.out.println("Tempo final MergeSort " + (fim - inicio));

                        // JOptionPane.showMessageDialog(null, "Tempo final MergeSort" + (fim - inicio),
                        // "Resultado", 0);
                    } catch (Exception e) {
                        System.out.println("Erro ao reaelizar a ordenação: " + e);
                    }

                    break;
                default:
                    break;
            }
        } while (opcao != 0);

        scn.close();
    }

}