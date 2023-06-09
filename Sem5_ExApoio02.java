// 08-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 2) Escreva um método que determine a soma dos elementos 
na diagonal secundária de uma matriz quadrada de inteiros de 
n≥0 linhas e colunas. Exemplo: A soma dos elementos da diagonal secundária 

da matriz.
 2   5   10   4
-3   8    1   5
 4   0    7  11
 3  -4    1   2

é: 4 + 1 + 0 + 3 = 8

*/
// ******************

import java.lang.Integer;

public class Sem5_ExApoio02

{
 static int somaDiagonalSecundariaMatriz(int[][] m)
 {
  int soma = 0;
  for (int i=0; i < m.length; i++) // Percorre todas as linhas
  {
     if (m.length != m[i].length) return -9999; // Erro: matriz não é quadrada. Comprimento da linha deve ser igual às das colunas, senão não é matriz quadrada.
     
     soma += m[i][(m[i].length - (i+1))]; // Linha 0, último elemento... Linha 1, penúltimo elemento... e assim vai
  }
  return soma;
 }
 
 public static void main(String[] args) // rotina principal 
 {
  int[][] m={{1,2,3,2},{4,5,2,0},{8,2,1,0},{8,9,1,0}}; // Entre com os valores dos elementos da matriz QUADRADA.
  
  for (int i=0; i<m.length; i++) // for para imprimir a matriz
   { 
    System.out.println();
    for (int j=0; j<m[i].length; j++) System.out.print(m[i][j]+"\t"); 
   }
  System.out.println();
  if (somaDiagonalSecundariaMatriz(m) == -9999) 
   {
    System.out.println("ERRO: Matriz deve ser quadrada. Execução interrompida.");
    System.exit(0);
   }
  else System.out.println("Soma da diagonal secundária da matriz quadrada é: " + (int)somaDiagonalSecundariaMatriz(m)); 
 } // fim do método main
  
} //fim da classe