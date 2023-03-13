// ******************
// 12-05-2019. Semana 2, Exercicio de apoio: 4
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
4. Mostre, passo a passo, a ordem de avaliação dos operadores em cada uma das seguintes
instruções Java:

a. x = 7 + 3 * 6 / 2 - 1;
b. x = 2 % 2 + 2 * 2 - 2 / 2;
c. x = (3 * 9 * (3 + (9 * 3 / (3))));
*/
// ******************


public class Sem2_ExApoio04
{ 
   public static void main(String[] args) // Rotina principal
   {
    int x;
     
    x = 7 + 3 * 6 / 2 - 1; 
    System.out.println("a) x = 7 + 3 * 6 / 2 - 1 = " + x);
     
    x = 2 % 2 + 2 * 2 - 2 / 2; 
    System.out.println("b) x = 2 % 2 + 2 * 2 - 2 / 2 = " + x);
     

    x = (3 * 9 * (3 + (9 * 3 / (3)))); 
    System.out.println("c) x = (3 * 9 * (3 + (9 * 3 / (3)))) = " + x);

   } // fim Rotina principal
} //fim class