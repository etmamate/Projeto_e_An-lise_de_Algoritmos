## Resposta das Perguntas

### **1. Qual algoritmo apresenta melhor desempenho com dados ordenados de forma crescente?**
Resposta: O Insertion Sort e o Bubble Sort.

Justificativa:

Embora a maioria dos algoritmos de alto desempenho opere em O(NlogN), o Insertion Sort e o Bubble Sort são algoritmos adaptativos.   

Quando o conjunto de dados já está em ordem crescente (ou quase ordenado), eles atingem sua melhor complexidade de caso: O(N) (Linear).   

Essa complexidade linear é assintoticamente mais rápida do que O(NlogN) para qualquer N grande. Seu gráfico de tempo para este cenário deve se parecer com uma linha reta, com inclinação muito pequena, tornando-os os mais rápidos para entradas pré-ordenadas.

### **2. Qual é o mais eficiente com dados ordenados de forma decrescente?**
Resposta: O Quick Sort (Otimizado) ou o Merge Sort.

Justificativa:

Dados decrescentes representam o pior caso para o Bubble Sort, Insertion Sort  e, crucialmente, para implementações ingênuas do Quick Sort, levando todos a uma performance de    

O(N 
2
 ).   

O Merge Sort e o Heap Sort garantem O(NlogN) independentemente da ordem inicial, pois sua estrutura (divisão e conquista ou heap) não é afetada pela pré-ordenação dos dados.   

No entanto, o Quick Sort moderno, se implementado com técnicas de otimização como a Mediana-de-Três para seleção do pivô , evita o pior caso    

O(N 
2
 ). Empiricamente, o Quick Sort otimizado costuma ser ligeiramente mais rápido que o Merge Sort e o Heap Sort no caso médio/pior, devido à sua menor necessidade de memória auxiliar (é um algoritmo    

in-place).   

Portanto, a escolha mais eficiente será um dos três algoritmos O(NlogN) estáveis.

### **3. Qual algoritmo é mais estável em relação ao tempo de execução, independentemente da organização dos dados?**
Resposta: O Merge Sort e o Heap Sort.

Justificativa:

A estabilidade temporal (ou consistência) é definida pela baixa variação entre o Melhor Caso, o Caso Médio e o Pior Caso.

Tanto o Merge Sort quanto o Heap Sort mantêm a complexidade O(NlogN) em todos os cenários (Crescente, Decrescente ou Aleatório).   

O Quick Sort, apesar de rápido, é inerentemente instável, pois seu pior caso teórico é O(N 
2
 ) , mesmo com otimizações, ele ainda é tecnicamente mais arriscado que o Merge Sort ou o Heap Sort.   

O Selection Sort é também estável em termos de tempo, mas de forma negativa: ele é sempre O(N 
2
 ) , o que o torna a pior escolha para desempenho.   

Portanto, o Merge Sort e o Heap Sort são os mais estáveis e confiáveis para garantir alto desempenho em qualquer condição de entrada.



### **Funcionamento da Aplicação**

- Ao rodar a aplicação, será solicitado a inserção do arquivo de texto, onde você irá selecionar os arquivos na pasta `/doc` separados diferenciados pela quantidade de números.
- Ao final de todos o processo de ordenação será gerado um arquivo na pasta `/doc` com os resultados de cara algoritmo de ordenação.
