// 08-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 4) Escreva uma função que calcule a transposta de uma dada matriz de floats. 
Se At representa a transposta da matriz A, então At[j, i]=A[i, j] para 1 ≤ i ≤ n  e 1 ≤ j ≤ m, 
onde n representa o número de linhas e m o número de colunas da matriz A.

*/
// ******************


public class Sem5_ExApoio04

{
 static float[][] matrizTransposta(float[][] a)
 {
  // Supondo que todas as linhas têm o mesmo número de elementos
  float[][] at = new float[a.length][a[0].length];

  for (int i=0; i < a.length; i++) // Percorre todas as linhas
  {
   for (int j=0; j < a[i].length; j++) // Percorre todos os elementos da coluna
     {
      at[j][i] = a[i][j];
     }
         
  }
  return at;
 }
 
 public static void main(String[] args) // rotina principal 
 {
  // m e n devem ser do mesmo tamanho
  float[][] m={{1f,1f,1f},{2f,2f,2f},{3f,3f,3f}}; // Entre com os valores dos elementos da matriz m.

  
  for (int i=0; i<m.length; i++) // for para imprimir os elementos de de m
   { 
    System.out.println();
    for (int j=0; j<m[i].length; j++) System.out.print(m[i][j]+"\t");
   }
  System.out.println();
  
  float[][] res = matrizTransposta(m); // Executa o método e armazena retorno da variável res[][]
  
  
  for (int i=0; i<m.length; i++) // for para imprimir a matriz transposta
   { 
    System.out.println();
    for (int j=0; j<m[i].length; j++) System.out.print(res[i][j]+"\t");
   }
 } // fim do método main
  
} //fim da classe