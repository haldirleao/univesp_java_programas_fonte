// ******************
// 26-05-2019. Semana 3, Exerc�cios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
11) Um n�mero qualquer � primo se ele for maior do que 1 e divis�vel
 apenas por 1 e por ele mesmo. Crie um m�todo que verifica se um 
n�mero inteiro passado como par�metro � primo, conforme as instru��es
 a seguir:

  - O m�todo deve receber um valor inteiro (int) positivo, chamado 
val, como par�metro.
  - O m�todo deve retornar true se val for um n�mero primo e false, 
caso contr�rio. Entretanto, se val for zero ou negativo, o m�todo deve
 imprimir uma mensagem de erro e ent�o retornar false.
  - DICA: na sua implementa��o, use um la�o de repeti��o while para 
testar o resto da divis�o de val por 2, 3, . . ., at� o valor inteiro
 anterior val. Se o resto de alguma dessas divis�es for zero, ent�o val
 n�o � primo. Se nenhuma dessas divis�es resultar em resto zero, ent�o
 val s� � divis�vel por 1 e por ele mesmo, ou seja, ele � primo.

    static boolean isPrime(int val){
         //seu c�digo
    }
*/
// ******************

import java.util.Scanner;

  public class Sem3_ExApoio11
{ 
   
   public static void main(String[] args) // Rotina principal
   { 
    System.out.println("--- VERIFICA SE N�MERO INTEIRO POSITIVO DADO � PRIMO ---");

    Scanner s = new Scanner(System.in);
    System.out.print("Digite um n�mero inteiro: ");
    int num = s.nextInt();

    System.out.print("O n�mero " + num);
    if (ehPrimo(num)) System.out.println(" � PRIMO.");
     else System.out.println(" N�O � PRIMO.");
     
   } // fim Rotina principal
    
   static boolean ehPrimo(int val) // An integer greater than one is called a prime number if its only positive divisors (factors) are one and itself. 
   {
    int divisor = 2;
     
    if (val <= 0)
    {
     System.out.println(" . ERRO: Calcula somente inteiros positivos. Execu��o interrompida");
     return false;
    }
    if (val == 1) return false; // n�mero 1 n�o � primo!
    while (divisor < val)
    {
     if ((val % divisor) == 0) return false;
     divisor++;
    }
    return true;
   } // fim m�todo
} //fim class