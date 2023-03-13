// ******************
// 13-05-2019. Semana 2, Exercicio de apoio: 9
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Escreva um aplicativo que solicite ao usuário inserir dois inteiros. Obtenha
 do usuário esses números e imprima sua soma, produto, diferença e quociente
 (divisão). Utilize as técnicas mostradas na Figura 2.7 do livro-texto. 
*/
// ******************

import java.util.Scanner;

public class Sem2_ExApoio09
{ 
   public static void main(String[] args) // Rotina principal
   {
    Scanner input = new Scanner(System.in); // cria um Scanner para obter entrada a partir da janela de comando
     
    int inteiro1; // Primeiro número inteiro;
    int inteiro2; // Segundo número inteiro;
    int soma;
    int produto;
    int diferenca;
    int quociente;

    System.out.print("Digite o primeiro inteiro: "); //prompt
    inteiro1 = input.nextInt(); // lê o primeiro inteiro digitado pelo usuário
    
    System.out.print("Digite o segundo inteiro: "); //prompt
    inteiro2 = input.nextInt(); // lê o segundo inteiro digitado pelo usuário
    
    soma = inteiro1 + inteiro2;
    produto = inteiro1 * inteiro2;
    diferenca = inteiro1 - inteiro2;
    quociente = inteiro1 / inteiro2; // somente a parte inteira da divisão.
     
    System.out.printf("Soma é %d%n", soma);
    System.out.printf("Produto é %d%n", produto);
    System.out.printf("Diferença é %d%n", diferenca);
    System.out.printf("Quociente é %d%n", quociente);

   } // fim Rotina principal
  
} //fim class