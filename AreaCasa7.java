// ******************
// 12-05-2019. Videoaula: 07
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos + área de psicina redonda:
*/
// ******************


public class AreaCasa7
{
   public static void main(String[] args) // Rotina principal
   {
    double areap;
         
    System.out.println("Programa para cálculo da área da casa");
     
    areaCasa(11,7); //Método criado por Haldir. Buscar no código por areaCasa.
    
    areap = areaPiscina(2); // //Método criado por Haldir. Buscar no código por areaPiscina.
    System.out.println("A área da piscina é "+areap);
        
   } // fim Rotina principal
  
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

} //fim class