// ******************
// 25-05-2019. Videoaula: 09
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos + área de psicina redonda:
*/
// ******************


public class Sem3_AreaCasa2
{
   
   static double valorM2 = 1500;
   
   static double valor(double area)
   { 
    if (area >= 0)
      return(valorM2*area);
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