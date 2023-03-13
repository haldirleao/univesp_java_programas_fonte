// ******************
// 10-05-2019. Semana 2. Texto Base - Java: Como programar, 2.5, pág.36
// Para testar: Copiar o texto e colar em https://www.jdoodle.com/online-java-compiler 
// ******************

// Figura 2.7: Addition.java
 // Programa de adição que insere dois números, então exibe a soma deles.

import java.util.Scanner; // programa utiliza a classe Scanner

public class Addition
{
   // método main inicia a execução do aplicativo Java
   public static void main(String[] args)
   {
      // cria um Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner(System.in); // Variável nomeada input do tipo Scanner. "New" cria novo objeto Scanner que lê a partir do teclado (System.in)

      int number1; // primeiro número a somar   
      int number2; // segundo número a somar
      int sum; // soma de number1 e number2

      System.out.print("Digite o primeiro numero inteiro: "); // prompt
      number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

      System.out.print("Digite o segundo numero inteiro: "); // prompt
      number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

      sum = number1 + number2; // soma os números, depois armazena o total em sum

      System.out.printf("A soma e %d%n", sum); // exibe a soma
   } // fim do método main
} // fim da classe Addition