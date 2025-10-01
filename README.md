Trabalho feito por:

Mateus Cristo da Silva & Mikaella Cintra

## **Funcionamento da Aplicação**

- Ao rodar a aplicação, será solicitado a inserção do arquivo de texto, onde você irá selecionar os arquivos na pasta `/doc` separados diferenciados pela quantidade de números. 
- Ao final de todos o processo de ordenação será gerado um arquivo na pasta `/doc` com os resultados de cara algoritmo de ordenação.

## **Tabela de resultados**
Função utilizada para medir o tempo de execução:

> System.currentTimeMillis();

| Aleatório c/ Repetição  | 100K | 160K | 220K | 280K | 340K | 400K | 460K | 520K | 580K | 640K | 700K |
| ----------------------- |:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|
| Bubble Sort             | 44   | 60   | 83   | 108  | 123  | 150  | 180  | 227  | 320  | 344  | 351  |
| Selection Sort          | 46   | 68   | 79   | 100  | 140  | 149  | 188  | 212  | 320  | 300  | 365  |
| Quick Sort              | 32   | 40   | 46   | 55   | 57   | 70   | 75   | 88   | 101  | 114  | 125  |
| Insertion Sort          | 36   | 45   | 50   | 62   | 67   | 70   | 84   | 96   | 123  | 143  | 145  |
| HeapSort                | 32   | 41   | 46   | 48   | 57   | 62   | 73   | 84   | 93   | 118  | 121  |
| MergeSort               | 35   | 39   | 46   | 51   | 54   | 64   | 70   | 91   | 104  | 115  | 135  |

## Resposta das Perguntas

### **1. Qual algoritmo apresenta melhor desempenho com dados ordenados de forma crescente?**
Resposta: O Insertion Sort ou o Bubble Sort.

**Justificativa:**

Os algoritmos de ordenação mais eficientes para dados já ordenados (ou quase ordenados) são aqueles que são adaptativos, o que significa que seu tempo de execução melhora drasticamente com o nível de pré-ordenação.   

Tanto o Insertion Sort quanto o Bubble Sort possuem a melhor complexidade de caso de O(N) (Linear) quando a entrada está em ordem crescente. Isso significa que o tempo de execução é proporcional apenas ao número de elementos (   

N), e não ao fator logN.

Em contraste, Merge Sort, Quick Sort e Heap Sort ainda exigirão pelo menos O(NlogN) mesmo em dados pré-ordenados.

Empiricamente, o Insertion Sort (e ocasionalmente o Bubble Sort se tiver uma flag de otimização) é o algoritmo mais rápido neste cenário.   

### **2. Qual é o mais eficiente com dados ordenados de forma decrescente?**
Resposta: O Merge Sort e o Heap Sort, ou o Quick Sort (Implementado de forma robusta).

**Justificativa:**

Dados ordenados de forma decrescente (ou inversa) representam o pior caso para:

Algoritmos O(N 
2
 ) (Bubble Sort, Insertion Sort, Selection Sort), que levam a O(N 
2
 ).   

Implementações ingênuas do Quick Sort (que levam a O(N 
2
 ) se o pivô for sempre o menor ou maior elemento).   

Para este cenário, a escolha mais eficiente deve garantir o desempenho O(NlogN):

Merge Sort e Heap Sort: Estes algoritmos garantem O(NlogN) em seu Pior Caso , pois sua lógica estrutural (divisão e conquista, ou construção de    

heap) é independente da ordem inicial dos dados.

Quick Sort: O Quick Sort moderno, se implementado com técnicas robustas como a Mediana-de-Três para seleção de pivô, evita o colapso para O(N 
2
 ) e mantém um desempenho próximo a O(NlogN). Quick Sort (quando robusto) é frequentemente o mais rápido na prática devido à sua natureza    

in-place e melhor eficiência de memória (cache).   

### **3. Qual algoritmo é mais estável em relação ao tempo de execução, independentemente da organização dos dados?**
Resposta: O Merge Sort e o Heap Sort.

**Justificativa:**

A estabilidade temporal é determinada pela baixa variação na complexidade entre o Melhor Caso, o Caso Médio e o Pior Caso.

O Merge Sort e o Heap Sort são os únicos algoritmos que mantêm consistentemente a complexidade O(NlogN) em todos os cenários (Melhor, Médio e Pior Caso).   

Em contraste:

Insertion Sort varia de O(N) para O(N 
2
 ).   

Quick Sort varia de O(NlogN) para O(N 
2
 ) (Pior Caso).   

Selection Sort é estável, mas em O(N 
2
 ) (proibitivo para escalabilidade).   

Portanto, o Merge Sort e o Heap Sort são os algoritmos que oferecem o tempo de execução mais previsível e consistente, independentemente da distribuição dos dados de entrada.




