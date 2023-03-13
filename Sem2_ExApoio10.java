// ******************
// 13-05-2019. Semana 2, Exercicio de apoio: 10
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Escreva um aplicativo para separar os d�gitos de um n�mero inteiro de 5 d�gitos. 
Para isso, ele deve pedir que o usu�rio forne�a um n�mero consistindo em cinco
 d�gitos, separar o n�mero em seus d�gitos individuais e imprimir os d�gitos 
separados uns dos outros por tr�s espa�os. Por exemplo, se o usu�rio digitar o
 n�mero 42339, o programa deve imprimir 4 2 3 3 9. Dica: use o comando �a % b�,
 que d� o resto da divis�o de a por b. 
*/
// ******************

import java.util.Scanner;

public class Sem2_ExApoio10
{ 
   public static void main(String[] args) // Rotina principal
   {
    Scanner input = new Scanner(System.in); //cria scanner para ler entrada do usu�rio
    System.out.println("Entre com um numero de 5 digitos: ");
    int num = input.nextInt(); //l� a entrada

    System.out.println("RESULTADO: ");
    System.out.print((num / 10000) + " "); //primeiro
    System.out.print((num % 10000) / 1000 + " "); //segundo
    System.out.print((num % 1000) / 100 + " "); //terceiro
    System.out.print((num % 100) / 10 + " "); //quarto
    System.out.print(num % 10 + " "); //quinto

   } // fim Rotina principal
  
} //fim class