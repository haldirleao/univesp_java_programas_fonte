// ******************
// 11-05-2019. Videoaula: 06
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos:
- Uma sala de 10x10m, um banheiro e um quarto de 5X7m cada.

*/
// ******************


public class CasaRet6
{
   public static void main (String[] args)
   {
    float lateral = 11; // comprimento da lateral da cabana
    float cquarto = 7; // comprimento da lateral maior do quarto
    float areaq; // área do quarto
    float areas; // área da sala
    float areat; // área total
     
    System.out.println("Programa para cálculo da área da casa");
     
    areas = lateral*lateral;
    System.out.println("A área da sala é "+areas);
    
    areaq = cquarto*(lateral/2);
    System.out.println("A área do quarto é "+areaq);
    System.out.println("A área do banheiro é "+areaq);
    
    areat = areas + 2*areaq;
    System.out.println("A área total é "+areat);
   }
}
