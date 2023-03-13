// ******************
// 13-05-2019. Semana 2, Exercicio de apoio: 9
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Escreva um aplicativo que solicite ao usu�rio inserir dois inteiros. Obtenha
 do usu�rio esses n�meros e imprima sua soma, produto, diferen�a e quociente
 (divis�o). Utilize as t�cnicas mostradas na Figura 2.7 do livro-texto. 
*/
// ******************

import java.util.Scanner;

public class Sem2_ExApoio09
{ 
   public static void main(String[] args) // Rotina principal
   {
    Scanner input = new Scanner(System.in); // cria um Scanner para obter entrada a partir da janela de comando
     
    int inteiro1; // Primeiro n�mero inteiro;
    int inteiro2; // Segundo n�mero inteiro;
    int soma;
    int produto;
    int diferenca;
    int quociente;

    System.out.print("Digite o primeiro inteiro: "); //prompt
    inteiro1 = input.nextInt(); // l� o primeiro inteiro digitado pelo usu�rio
    
    System.out.print("Digite o segundo inteiro: "); //prompt
    inteiro2 = input.nextInt(); // l� o segundo inteiro digitado pelo usu�rio
    
    soma = inteiro1 + inteiro2;
    produto = inteiro1 * inteiro2;
    diferenca = inteiro1 - inteiro2;
    quociente = inteiro1 / inteiro2; // somente a parte inteira da divis�o.
     
    System.out.printf("Soma � %d%n", soma);
    System.out.printf("Produto � %d%n", produto);
    System.out.printf("Diferen�a � %d%n", diferenca);
    System.out.printf("Quociente � %d%n", quociente);

   } // fim Rotina principal
  
} //fim class