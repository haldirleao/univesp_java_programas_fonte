// ******************
// 25-05-2019. Videoaula: 09
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a �rea de uma casa (e seus c�modos) de 3 c�modos + �rea de psicina redonda:
*/
// ******************


public class Sem3_AreaCasa3
{
   
   static double valorM2 = 1500;
   
   static void areaCasa(float lateral, float cquarto) // void instrui que o m�todo n�o retorna valor
   {
    float areaq; // �rea do quarto
    float areas; // �rea da sala
    float areat; // �rea total

    areas = lateral*lateral;
    System.out.println("A �rea da sala � "+areas);
    
    areaq = cquarto*(lateral/2);
    System.out.println("A �rea do quarto � "+areaq);
    System.out.println("A �rea do banheiro � "+areaq);
    areat = areas + 2*areaq;
    System.out.println("A �rea total � "+areat);
   } // fim m�todo
   

   static double areaPiscina(double raio) // double instrui que m�todo retorno um valor tipo double.
   {
     
    return(Math.PI * Math.pow(raio,2)); // retorna valor para o m�todo e termina a subrotina.
   } // fim m�todo
  

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
    
    if (valorOK) System.out.println("O valor da constru��o � "+preco);
    else         System.out.println("O valor da �rea � negativo ");

   } // fim m�todo
  
} //fim class