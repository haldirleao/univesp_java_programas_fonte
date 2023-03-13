// ******************
// 25-05-2019. Videoaula: 11 (Switch e Laço While)
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos + área de psicina redonda:
*/
// ******************


public class Sem3_AreaCasa6
{
   static double valorM2 = 1500;
  
   // Materiais para a piscina  
   static final int ALVENARIA = 0;
   static final int VINIL = 1;
   static final int FIBRA = 2;
   static final int PLASTICO = 3;  
  
   static double areaPiscina(double raio) // double instrui que método retorno um valor tipo double.
   {  
    if (raio >= 0) return(Math.PI * Math.pow(raio,2)); // Testa e retorna valor para o método.
    else return(-1); // Retorna valor de erro (raio <=0)
   } // fim método
  
   static void areaCasa(float lateral, float cquarto) // void instrui que o método não retorna valor
   {
    float areaq; // área do quarto
    float areas; // área da sala
    float areat; // área total

    if (lateral<0) System.out.println("Erro: lateral da sala < 0");
    else 
     {
      if (cquarto<0) System.out.println("Erro: lateral do quarto < 0");
      else 
       {      
        areas = lateral*lateral;
        System.out.println("A área da sala é "+areas);
    
        areaq = cquarto*(lateral/2);
        System.out.println("A área do quarto é "+areaq);
        System.out.println("A área do banheiro é "+areaq);
        areat = areas + 2*areaq;
        System.out.println("A área total é "+areat);
       }
     } 
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
    
                 System.out.print("O valor da construção "); 
    if (valorOK) System.out.println("é "+preco);
    else         System.out.println("não foi obtido: área negativa.");

   } // fim método
  
   static double valorPiscina(double area, int material)
   {
    double valor;
    if (material == ALVENARIA) valor = 1500;
    else
       if (material == VINIL) valor = 1100;
       else
          if (material == FIBRA) valor = 750;
          else
            if (material == PLASTICO) valor = 500;
            else valor = -1;
    return(area*valor); 
   } // fim método
  
} //fim class