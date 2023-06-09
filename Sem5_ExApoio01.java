// 08-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 2) Escreva um método que determine a soma dos elementos 
na diagonal secundária de uma matriz quadrada de inteiros de 
n≥0 linhas e colunas. Exemplo: A soma dos elementos da diagonal secundária da matriz.
 2   5   10   4
-3   8    1   5
 4   0    7  11
 3  -4    1   2

é: 4 + 1 + 0 + 3 = 8

*/
// ******************


public class Sem5_ExApoio01

{
 static int[] matriz(int[][] m)
 {
  int valorMaior = m[0][0];
  int[] indiceMaior = {0,0};
  for (int i=0; i < m.length; i++) // Usar m.length... m[i].lenght deu erro durante muito tempo!!!
  {
   for (int j=0; j < m[i].length; j++) // Comprimento da linha... se não for assim as colunas forem diferentes para cada linha não percorrá todos os elementos.
    {
      if (m[i][j] > valorMaior)
      {
       valorMaior = m[i][j]; // Armazena maior valor da matriz
       indiceMaior[0] = i; // Armazena linha do maior valor
       indiceMaior[1] = j; // Armazena coluna do maior valor
      }
          
    }
  }
  System.out.println("Maior valor contido na matriz é: " + valorMaior);
  return indiceMaior;
 }
 
 public static void main(String[] args) // rotina principal 
 {
  int[][] m={{1,1,2,3},{4,5,123},{7,8,100,123,15}}; // Entre com os valores dos elementos da matriz
  
  for (int i=0; i<m.length; i++) // for para imprimir a matriz
   { 
    System.out.println();
    for (int j=0; j<m[i].length; j++) System.out.print(m[i][j]+"\t"); 
   }
  System.out.println();
 
  int[] posicao = matriz(m); // Como o método retorna um arranjo deve ser atribuido a uma variável para que os dados possam ser manipulados.
  
  System.out.println("Na linha: " + (posicao[0]+1) +  " , coluna: " + (posicao[1]+1) + " está o primeiro maior valor da matriz."); 
 } // fim do método main
  
} //fim da classe