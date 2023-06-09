// 03-06-2019. Semana 4, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

ENUNCIADO: 7) Escreva um método, que determine o índice do arranjo (posição) 
onde se encontra o maior elemento de um arranjo de elementos do tipo float 
dado como parâmetro, imprima o índice e o retorne.

*/
// ******************

import java.util.Arrays;

public class Sem4_ExApoio07
{
 static int indiceMaiorElemento(float[] arranjo) 
 {
  int indice = 0;
  for (int i=1; i<arranjo.length; i++)
  {
   if (arranjo[i] > arranjo[indice]) indice = i; // no gabarito está errado: "if (arranjo[i] ;arranjo[indice]) indice = i;"
  }
  return indice;
 }
  
 public static void main(String[] args) 
 {
   float[] arranjo = {3.0f,2.5f,15.5f,6.5f,10f};   // usado "f" para declarar explicitamente que são float. 
   
   System.out.println(Arrays.toString(arranjo));
   System.out.println("Dos valores acima [" + indiceMaiorElemento(arranjo) + "] é o índice do maior valor.");
   
 } // fim do método main
  
} //fim da classe