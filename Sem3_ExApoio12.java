// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
11) Implemente um programa que leia valores inteiros passados pelo usuário
 e some esses valores até que o valor total da soma seja maior ou igual
 a 21. Quando isso acontecer, o programa escreve “Venceu!” se a soma
 for exatamente 21 e “Perdeu!”, caso contrário.
*/
// ******************

import java.util.Scanner;

  public class Sem3_ExApoio12
{ 
   
   public static void main(String[] args) // Rotina principal
   { 
    System.out.println("--- Código base para o jogo Blackjack (ou Vinte-e-um) ---");

    vinteEUm(); 
     
   } // fim Rotina principal
    
   static void vinteEUm() 
   {
    int soma = 0;
    
    Scanner s = new Scanner(System.in); 
    while (soma < 21)
    {
     System.out.print("Escolha uma carta: ");
     soma = soma + s.nextInt();
    }
    if (soma == 21) System.out.println("VOCE VENCEU!!!");
     else System.out.println("VOCE PERDEU!!!");
   } // fim método
} //fim class