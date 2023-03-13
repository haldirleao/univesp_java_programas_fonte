// ******************
// 12-05-2019. Videoaula: 07
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a �rea de uma casa (e seus c�modos) de 3 c�modos + �rea de psicina redonda:
*/
// ******************


public class AreaCasa7
{
   public static void main(String[] args) // Rotina principal
   {
    double areap;
         
    System.out.println("Programa para c�lculo da �rea da casa");
     
    areaCasa(11,7); //M�todo criado por Haldir. Buscar no c�digo por areaCasa.
    
    areap = areaPiscina(2); // //M�todo criado por Haldir. Buscar no c�digo por areaPiscina.
    System.out.println("A �rea da piscina � "+areap);
        
   } // fim Rotina principal
  
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

} //fim class