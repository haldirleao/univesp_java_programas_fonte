// ******************
// 25-05-2019. Videoaula: 09
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos + área de psicina redonda:
*/
// ******************


public class Sem3_AreaCasa3
{
   
   static double valorM2 = 1500;
   
   static void areaCasa(float lateral, float cquarto) // void instrui que o método não retorna valor
   {
    float areaq; // área do quarto
    float areas; // área da sala
    float areat; // área total

    areas = lateral*lateral;
    System.out.println("A área da sala é "+areas);
    
    areaq = cquarto*(lateral/2);
    System.out.println("A área do quarto é "+areaq);
    System.out.println("A área do banheiro é "+areaq);
    areat = areas + 2*areaq;
    System.out.println("A área total é "+areat);
   } // fim método
   

   static double areaPiscina(double raio) // double instrui que método retorno um valor tipo double.
   {
     
    return(Math.PI * Math.pow(raio,2)); // retorna valor para o método e termina a subrotina.
   } // fim método
  

   static double valor(double area)
   { 
    if (area >= 0) return(valorM2*area);
    return(-1); 
   }

   public static void main(String[]args)
   {
    double preco;
    boolean valorOK = false;
     
    preco = valor(-20);
    valorOK = preco >= 0;
     
    if (preco >= 0) valorOK = true;
    
    if (valorOK) System.out.println("O valor da construção é "+preco);
    else         System.out.println("O valor da área é negativo ");

   } // fim método
  
} //fim class