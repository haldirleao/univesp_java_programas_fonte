// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
7) Escreva o que será impresso pela execução do método abaixo, caso ele receba
 como parâmetro o número 10.

public static void conjecturaDeCollatz(int n){
     System.out.println("Imprimindo sequencia iniciando em " + n);
     while (n>1){
           if (n % 2 == 0) n = n/2;
           else n = 3*n + 1;
           System.out.println(n);
      }
 }
 Para saber mais: https://pt.wikipedia.org/wiki/Conjectura_de_Collatz
*/
// ******************

  public class Sem3_ExApoio07
{ 
   public static void main(String[] args) // Rotina principal
   {     
    conjecturaDeCollatz(10); // chama método passando o valor 10 pedido no exercício.
   } // fim Rotina principal

   public static void conjecturaDeCollatz(int n){
     System.out.println("Imprimindo sequencia iniciando em " + n);
     while (n>1){
           if (n % 2 == 0) n = n/2;
           else n = 3*n + 1;
           System.out.println(n);
      }
    
   } // fim método
} //fim class