// ******************
// 26-05-2019. Semana 3, Exerc�cios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
2) O m�dulo (ou valor absoluto) de um n�mero n, representado como |n|, 
corresponde � sua dist�ncia do n�mero zero.

   a)Complete o c�digo abaixo para calcular o m�dulo do par�metro de entrada n.
         
         static double modulo(double n) { 

   b) Crie um aplicativo que, no seu m�todo main, receba a entrada do usu�rio 
(um double) e imprima o m�dulo desse valor. Use o m�todo modulo desenvolvido no
 item anterior.
*/
// ******************

import java.util.Scanner;
  
public class Sem3_ExApoio02
{ 
   public static void main(String[] args) // Rotina principal
   {
     
    System.out.println("CALCULA O M�DULO DO N�MERO DADO");    

    Scanner s = new Scanner(System.in);
    System.out.print("Digite o n�mero: ");
    double num = s.nextDouble();
    
    System.out.println("\nO m�dulo de " + num +" � :" + modulo(num));
    
	
   } // fim Rotina principal

   static double modulo(double n)
   {
    if (!(n>=0)) return (n*(-1));
    return n;
     
   } // fim m�todo
} //fim class