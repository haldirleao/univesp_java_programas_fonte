// ******************
// 01-06-2019. Exerc�cios de Avalia��o: Pergunta 04
// Para testar: Copiar o texto e colar em 
//       https://www.compilejava.net
// ou no https://www.jdoodle.com/online-// java-compiler
/*
RESPOSTA: 
*/
// ******************

import java.util.Arrays;

public class Sem4_Avaliacao_Perg_04
{
 public static void main(String[] args) 
 {
  int[] A = {2,3,4,5,6}; // cria array A com 5 valores inteiros
  // int[] B = new in [A.length]; - ERRO NO "IN", na realidade � "int"
  int[] B = new int [A.length]; // cria array B ?com 5 com espa�o para 5 inteiros?
  System.out.println(A[2]); // imprime 4
  B = A; // como est� atribuindo A para B os dois compartilham os mesmos valores inteiros.
  B[2] = 1; // A = B = {2,3,1,5,6}
  System.out.println(A[2]); // imprime 1
   
  System.out.println(Arrays.toString(A)); // acrescentado por Haldir
  System.out.println(Arrays.toString(B)); // acrescentrado por Haldir
 } // fim m�todo

} // fim classe