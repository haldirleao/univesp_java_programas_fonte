// ******************
// 10-05-2019. Semana 2. Texto Base - Java: Como programar, 2.5, p�g.36
// Para testar: Copiar o texto e colar em https://www.jdoodle.com/online-java-compiler 
// ******************

// Figura 2.7: Addition.java
 // Programa de adi��o que insere dois n�meros, ent�o exibe a soma deles.

import java.util.Scanner; // programa utiliza a classe Scanner

public class Addition
{
   // m�todo main inicia a execu��o do aplicativo Java
   public static void main(String[] args)
   {
      // cria um Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner(System.in); // Vari�vel nomeada input do tipo Scanner. "New" cria novo objeto Scanner que l� a partir do teclado (System.in)

      int number1; // primeiro n�mero a somar   
      int number2; // segundo n�mero a somar
      int sum; // soma de number1 e number2

      System.out.print("Digite o primeiro numero inteiro: "); // prompt
      number1 = input.nextInt(); // l� primeiro o n�mero fornecido pelo usu�rio

      System.out.print("Digite o segundo numero inteiro: "); // prompt
      number2 = input.nextInt(); // l� o segundo n�mero fornecido pelo usu�rio

      sum = number1 + number2; // soma os n�meros, depois armazena o total em sum

      System.out.printf("A soma e %d%n", sum); // exibe a soma
   } // fim do m�todo main
} // fim da classe Addition