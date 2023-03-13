// ******************
// 11-05-2019. Videoaula: 05
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos:
- Uma sala de 10x10m, um banheiro e um quarto de 5X7m cada.

*/
// ******************

public class CasaRet5
{
   public static void main (String[] args)
   {
    int areas; // área da sala
    int areaq; // área do quarto
    int areat; // área total 
     
    System.out.println("Programa para cálculo\nda área da casa");
    
    areas = 10*10;
    System.out.println("A área da sala é " + areas);
    
    areaq = 5*7;
    System.out.println("A área do quarto é " + areaq);
    System.out.println("A área do banheiro é " + areaq);
    
    areat = areas + 2*areaq;
	System.out.println("A área total é " + areat);
   }
}