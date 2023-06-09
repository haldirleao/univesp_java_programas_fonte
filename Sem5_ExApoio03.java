// 08-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 3) Escreva um método que retorne a soma de duas matrizes com 
valores inteiros, de m linhas e n colunas, recebidas como parâmetros.

*/
// ******************


public class Sem5_ExApoio03

{
 static int[][] somaMatriz(int[][] m, int[][] n)
 {
  int[][] soma = new int[m.length][n[0].length];
  int[][] erro = {{-9999,-9999},{-9999,-9999}}; // vaiável usado para indicar erro.

  if (m.length != n.length) return erro; // Erro: matrizes m e n não tem o mesmo número de linhas.

  for (int i=0; i < m.length; i++) // Percorre todas as linhas
  {
   for (int j=0; j < m[i].length; j++) // Percorre todos os elementos da coluna
     {
     if (m[i].length != n[i].length) return erro; // Erro: matrizes m e n não tem o mesmo número de colunas.
     
     soma[i][j] = m[i][j] + n[i][j]; // soma cada elemento m+n
     }
         
  }
  return soma;
 }
 
 public static void main(String[] args) // rotina principal 
 {
  // m e n devem ser do mesmo tamanho
  int[][] m={{1,1,1},{1,1,1},{1,1,1}}; // Entre com os valores dos elementos da matriz m.
  int[][] n={{20,21,22},{23,24,25},{26,27,28}}; // Entre com os valores dos elementos da matriz n.

  
  for (int i=0; i<m.length; i++) // for para imprimir os elementos de de m e n
   { 
    System.out.println();
    for (int j=0; j<m[i].length; j++) System.out.print(m[i][j]+"\t");
    System.out.print("\t\t");
    for (int j=0; j<n[i].length; j++) System.out.print(n[i][j]+"\t");
   }
  System.out.println();
  System.out.println();
  
  int[][] res = somaMatriz(m,n); // Executa o método e armazena retorno da variável res[][]
  
  if (res[0][0] == -9999) // trata erro
   {
    System.out.println("ERRO: As matriz devem  ser do mesmo tamanho. Execução interrompida.");
    System.exit(0);
   }  
  
  for (int i=0; i<m.length; i++) // for para imprimir a soma de m e n
   { 
    System.out.println();
    for (int j=0; j<m[i].length; j++) System.out.print(res[i][j]+"\t");
   }
 } // fim do método main
  
} //fim da classe