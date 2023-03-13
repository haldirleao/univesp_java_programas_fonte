// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
2) O módulo (ou valor absoluto) de um número n, representado como |n|, 
corresponde à sua distância do número zero.

   a)Complete o código abaixo para calcular o módulo do parâmetro de entrada n.
         
         static double modulo(double n) { 

   b) Crie um aplicativo que, no seu método main, receba a entrada do usuário 
(um double) e imprima o módulo desse valor. Use o método modulo desenvolvido no
 item anterior.
*/
// ******************

import java.util.Scanner;
  
public class Sem3_ExApoio02
{ 
   public static void main(String[] args) // Rotina principal
   {
     
    System.out.println("CALCULA O MÓDULO DO NÚMERO DADO");    

    Scanner s = new Scanner(System.in);
    System.out.print("Digite o número: ");
    double num = s.nextDouble();
    
    System.out.println("\nO módulo de " + num +" é :" + modulo(num));
    
	
   } // fim Rotina principal

   static double modulo(double n)
   {
    if (!(n>=0)) return (n*(-1));
    return n;
     
   } // fim método
} //fim class