// ******************
// 13-05-2019. Semana 2, Exercicio de apoio: 10
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Escreva um aplicativo para separar os dígitos de um número inteiro de 5 dígitos. 
Para isso, ele deve pedir que o usuário forneça um número consistindo em cinco
 dígitos, separar o número em seus dígitos individuais e imprimir os dígitos 
separados uns dos outros por três espaços. Por exemplo, se o usuário digitar o
 número 42339, o programa deve imprimir 4 2 3 3 9. Dica: use o comando “a % b”,
 que dá o resto da divisão de a por b. 
*/
// ******************

import java.util.Scanner;

public class Sem2_ExApoio10
{ 
   public static void main(String[] args) // Rotina principal
   {
    Scanner input = new Scanner(System.in); //cria scanner para ler entrada do usuário
    System.out.println("Entre com um numero de 5 digitos: ");
    int num = input.nextInt(); //lê a entrada

    System.out.println("RESULTADO: ");
    System.out.print((num / 10000) + " "); //primeiro
    System.out.print((num % 10000) / 1000 + " "); //segundo
    System.out.print((num % 1000) / 100 + " "); //terceiro
    System.out.print((num % 100) / 10 + " "); //quarto
    System.out.print(num % 10 + " "); //quinto

   } // fim Rotina principal
  
} //fim class