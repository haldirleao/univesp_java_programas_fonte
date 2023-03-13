// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
5) Escreva um método chamado media que receba quatro variáveis do tipo 
double chamadas v1, v2, v3 e v4 e imprima: “Media maior que zero.”, caso
a média dos quatro valores seja maior que zero, ou “Media menor ou igual
 a zero.”, caso contrário.
*/
// ******************

import java.util.Scanner;
  
public class Sem3_ExApoio05
{ 
   public static void main(String[] args) // Rotina principal
   {     
    System.out.println("DADOS 4 NÚMEROS, IMPRIME A MÉDIA E SE É MENOR,MAIOR OU IGUAL A O");    

    Scanner s = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    double a = s.nextDouble();
     
    System.out.print("Digite o segundo número: ");
    double b = s.nextDouble();

    System.out.print("Digite o terceiro número: ");
    double c = s.nextDouble();
     
    System.out.print("Digite o quarto número: ");
    double d = s.nextDouble();

    imprimeMedia4Valores(a,b,c,d); // chama método. 
	
   } // fim Rotina principal

   static void imprimeMedia4Valores(double v1, double v2, double v3, double v4)
   {
    double media = (v1 + v2 + v3 + v4)/4;
    if (media>0) System.out.println("Média = " + media + ". Logo média maior que zero.");
    else System.out.println("Média = " + media + ". Logo média menor ou igual a zero.");
   } // fim método
} //fim class