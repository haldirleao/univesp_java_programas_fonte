// ******************
// 11-05-2019. Videoaula: 06
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a �rea de uma casa (e seus c�modos) de 3 c�modos:
- Uma sala de 10x10m, um banheiro e um quarto de 5X7m cada.

*/
// ******************


public class CasaRet6
{
   public static void main (String[] args)
   {
    float lateral = 11; // comprimento da lateral da cabana
    float cquarto = 7; // comprimento da lateral maior do quarto
    float areaq; // �rea do quarto
    float areas; // �rea da sala
    float areat; // �rea total
     
    System.out.println("Programa para c�lculo da �rea da casa");
     
    areas = lateral*lateral;
    System.out.println("A �rea da sala � "+areas);
    
    areaq = cquarto*(lateral/2);
    System.out.println("A �rea do quarto � "+areaq);
    System.out.println("A �rea do banheiro � "+areaq);
    
    areat = areas + 2*areaq;
    System.out.println("A �rea total � "+areat);
   }
}
