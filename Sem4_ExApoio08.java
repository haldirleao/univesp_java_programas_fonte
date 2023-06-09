// 03-06-2019. Semana 4, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

ENUNCIADO: 8) Em uma competição de ginástica olímpica a nota é determinada 
por um painel de seis juízes. Cada um dos juízes atribui uma nota entre 
zero e dez para o desempenho do atleta. Para calcular a nota final, a nota
mais alta e a nota mais baixa são descartadas e é calculada a média das 
quatro restantes. Escreva um método que receba por parâmetro um arranjo 
contendo as 6 notas entre zero e dez e calcule e retorne a média após o
descarte da maior e da menor nota. Considere que cada nota é representada 
por um elemento do tipo double.

*/
// ******************

import java.util.Arrays;

public class Sem4_ExApoio08
{
 static double min, max; // escopo global
  
 static double mediaGinastica_alt(double[] notas) 
 {
  double soma = notas[0];
  min = soma;
  max = soma;
  for (int i=1;i<6;i++)
  {
   soma = soma + notas[i];
   if (notas[i] < min) min = notas[i];
   else if (notas[i] > max) max = notas[i];
  }
 System.out.println("Excluídos: " + min + " e " + max); // embora tenham escopo global, min e max somente são alterados dentro do método!
 return ((soma-min-max)/4);
 }
  
 public static void main(String[] args) 
 {
   double[] notas = {8,7,3,10,1,8}; // Entre com as 6 notas.    
   
   System.out.println(Arrays.toString(notas));
   System.out.println("Media = " + mediaGinastica_alt(notas));
   
 } // fim do método main
  
} //fim da classe