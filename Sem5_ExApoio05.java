// 08-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 5) Escreva um método que verifica se uma matriz de inteiros é simétrica,
retornando true se for e false se não. Uma matriz a é simétrica se a[i, j] = a[ j, i]
para todo 1<= i, j <= n.

*/
// ******************


public class Sem5_ExApoio05

{
 static boolean matrizEhSimetrica(int[][] m)
 {
  /* para ser simétrica, deve ser quadrada - Supondo que todas as linhas tem o mesmo numero de colunas */
  if (m.length != m[0].length) return(false);
  
  for (int i=0; i < m.length; i++) // Percorre todas as linhas
   for (int j=0; j < m[0].length; j++) // Percorre todos os elementos da coluna
      {
       if (m[i][j] != m[j][i]) return(false); // Se qualquer comparação é falsa, matriz não é simétrica
      }
  return(true);
 }
 
 public static void main(String[] args) // rotina principal 
 {
  int[][] m={{1,2,3},{2,3,4},{3,4,9}}; // Entre com os valores dos elementos da matriz m quadrada.


  for (int i=0; i<m.length; i++) // for para imprimir os elementos de de m
   { 
    System.out.println();
    for (int j=0; j<m[i].length; j++) System.out.print(m[i][j]+"\t");
   }
  System.out.println();
  System.out.println();
    // como método retorna booleano, pode ser testado direto no if.
    if (matrizEhSimetrica(m)) System.out.println("A matriz é simétrica");
    else System.out.println("A matriz NÃO é simétrica");
 } // fim do método main
  
} //fim da classe