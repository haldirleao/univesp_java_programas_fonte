// ******************
// 11-05-2019. Videoaula: 05
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a �rea de uma casa (e seus c�modos) de 3 c�modos:
- Uma sala de 10x10m, um banheiro e um quarto de 5X7m cada.

*/
// ******************

public class CasaRet5
{
   public static void main (String[] args)
   {
    int areas; // �rea da sala
    int areaq; // �rea do quarto
    int areat; // �rea total 
     
    System.out.println("Programa para c�lculo\nda �rea da casa");
    
    areas = 10*10;
    System.out.println("A �rea da sala � " + areas);
    
    areaq = 5*7;
    System.out.println("A �rea do quarto � " + areaq);
    System.out.println("A �rea do banheiro � " + areaq);
    
    areat = areas + 2*areaq;
	System.out.println("A �rea total � " + areat);
   }
}