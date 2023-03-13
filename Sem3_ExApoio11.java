// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
11) Um número qualquer é primo se ele for maior do que 1 e divisível
 apenas por 1 e por ele mesmo. Crie um método que verifica se um 
número inteiro passado como parâmetro é primo, conforme as instruções
 a seguir:

  - O método deve receber um valor inteiro (int) positivo, chamado 
val, como parâmetro.
  - O método deve retornar true se val for um número primo e false, 
caso contrário. Entretanto, se val for zero ou negativo, o método deve
 imprimir uma mensagem de erro e então retornar false.
  - DICA: na sua implementação, use um laço de repetição while para 
testar o resto da divisão de val por 2, 3, . . ., até o valor inteiro
 anterior val. Se o resto de alguma dessas divisões for zero, então val
 não é primo. Se nenhuma dessas divisões resultar em resto zero, então
 val só é divisível por 1 e por ele mesmo, ou seja, ele é primo.

    static boolean isPrime(int val){
         //seu código
    }
*/
// ******************

import java.util.Scanner;

  public class Sem3_ExApoio11
{ 
   
   public static void main(String[] args) // Rotina principal
   { 
    System.out.println("--- VERIFICA SE NÚMERO INTEIRO POSITIVO DADO É PRIMO ---");

    Scanner s = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int num = s.nextInt();

    System.out.print("O número " + num);
    if (ehPrimo(num)) System.out.println(" é PRIMO.");
     else System.out.println(" NÃO é PRIMO.");
     
   } // fim Rotina principal
    
   static boolean ehPrimo(int val) // An integer greater than one is called a prime number if its only positive divisors (factors) are one and itself. 
   {
    int divisor = 2;
     
    if (val <= 0)
    {
     System.out.println(" . ERRO: Calcula somente inteiros positivos. Execução interrompida");
     return false;
    }
    if (val == 1) return false; // número 1 não é primo!
    while (divisor < val)
    {
     if ((val % divisor) == 0) return false;
     divisor++;
    }
    return true;
   } // fim método
} //fim class