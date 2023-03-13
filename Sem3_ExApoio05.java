// ******************
// 26-05-2019. Semana 3, Exerc�cios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
5) Escreva um m�todo chamado media que receba quatro vari�veis do tipo 
double chamadas v1, v2, v3 e v4 e imprima: �Media maior que zero.�, caso
a m�dia dos quatro valores seja maior que zero, ou �Media menor ou igual
 a zero.�, caso contr�rio.
*/
// ******************

import java.util.Scanner;
  
public class Sem3_ExApoio05
{ 
   public static void main(String[] args) // Rotina principal
   {     
    System.out.println("DADOS 4 N�MEROS, IMPRIME A M�DIA E SE � MENOR,MAIOR OU IGUAL A O");    

    Scanner s = new Scanner(System.in);
    System.out.print("Digite o primeiro n�mero: ");
    double a = s.nextDouble();
     
    System.out.print("Digite o segundo n�mero: ");
    double b = s.nextDouble();

    System.out.print("Digite o terceiro n�mero: ");
    double c = s.nextDouble();
     
    System.out.print("Digite o quarto n�mero: ");
    double d = s.nextDouble();

    imprimeMedia4Valores(a,b,c,d); // chama m�todo. 
	
   } // fim Rotina principal

   static void imprimeMedia4Valores(double v1, double v2, double v3, double v4)
   {
    double media = (v1 + v2 + v3 + v4)/4;
    if (media>0) System.out.println("M�dia = " + media + ". Logo m�dia maior que zero.");
    else System.out.println("M�dia = " + media + ". Logo m�dia menor ou igual a zero.");
   } // fim m�todo
} //fim class