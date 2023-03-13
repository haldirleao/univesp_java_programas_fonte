// ******************
// 25-05-2019. Videoaula: 11 (Switch e Laço While)
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos + área de psicina redonda:
*/
// ******************


public class Sem3_AreaCasa8
{
   static double valorM2 = 1500;
  
   // Materiais para a piscina  
   static final int ALVENARIA = 0;
   static final int VINIL = 1;
   static final int FIBRA = 2;
   static final int PLASTICO = 3;  
  
   public static void main(String[]args)
   {
    double preco;
    boolean valorOK = false;
     
    preco = valor(-20);
    valorOK = preco >= 0;     
    
                 System.out.print("O valor da construção "); 
    if (valorOK) System.out.println("é "+preco);
    else         System.out.println("não foi obtido: área negativa.");

    System.out.println("Valor da piscina (área x preço_material): " + valorPiscina(1,FIBRA));
   
    double area = 1;
    int tipo = 0;
     
    System.out.println("MATERIAL\tVALOR");
    while (tipo <= 3)
    {
	 System.out.println(tipo + "\t\t" + valorPiscina(area,tipo)); // "\t" = tabulação
	 tipo = ++ tipo; // "++" = incrementa 1 
    } // fim while
   } // fim método  
   
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
  
   static double valorPiscina(double area, int material)
   {
    double valor;
     
    switch (material)
    {
     case ALVENARIA: return(area*1500);
     case VINIL: return(area*1100);
     case FIBRA: return(area*750);
     case PLASTICO: return(area*500);
     default: return(-1);
    }
   } // fim método
  
} //fim class