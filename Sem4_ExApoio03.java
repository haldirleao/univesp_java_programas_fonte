// 03-06-2019. Semana 4, Exercícios de apoio 03
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

ENUNCIADO: 3) Faça um programa que imprima uma tabela com os 15 primeiros 
inteiros positivos, seus quadrados e cubos. Cada linha deve se referir a
um inteiro. Por exemplo, uma das linhas impressas deve ser “3 9 27”. Para
deixar a saída impressa do seu programa mais legível, não deixe de imprimir
um espaço ou uma tabulação (\t) entre os número de uma mesma linha.

*/
// ******************

import java.lang.Math; //importado para usar o método Math.pow(a,b)

public class Sem4_ExApoio03
{
 public static void main(String[] args) 
 {
  System.out.println("inteiro\t\tquadradro\tcubo");
  for (int num = 1; num <=15; num++)
  {
   System.out.println(num + "\t\t" + (int)Math.pow(num, 2) + "\t\t" + (int)Math.pow(num, 3));
  }
 } // fim do método main
  
} //fim da classe