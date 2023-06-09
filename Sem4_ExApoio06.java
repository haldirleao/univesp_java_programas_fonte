// 03-06-2019. Semana 4, Exercícios de apoio 06
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

ENUNCIADO: 6) Escreva um método, que determine o valor do maior elemento
 de um arranjo de elementos do tipo float dado como parâmetro, imprima 
este valor e o retorne..

*/
// ******************

import java.util.Arrays;

public class Sem4_ExApoio06
{
 static float maiorValor(float[] arranjo)
 {
   float maior = arranjo[0];
   // iniciado "int=1" porque posição 0 já é carregado em "float maior = arranjo[0];"
   for (int i=1; i < arranjo.length; i++) if (arranjo[i]>maior) maior = arranjo[i];
   
   return maior;
 }
  
 public static void main(String[] args) 
 {
   float[] arranjo = {3.0f,2.5f,1.5f,0.5f};   // usado "f" para declarar explicitamente que são float. 
   
   System.out.println(Arrays.toString(arranjo));
   System.out.println("Dos valores acima " + maiorValor(arranjo) + " é o maior valor.");
   
 } // fim do método main
  
} //fim da classe