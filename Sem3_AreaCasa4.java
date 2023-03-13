// ******************
// 25-05-2019. Videoaula: 10 (Condicionais Aninhados e Operadores L�gicos)
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a �rea de uma casa (e seus c�modos) de 3 c�modos + �rea de psicina redonda:
*/
// ******************


public class Sem3_AreaCasa4
{
   static double valorM2 = 1500;
   
   static double areaPiscina(double raio) // double instrui que m�todo retorno um valor tipo double.
   {  
    if (raio >= 0) return(Math.PI * Math.pow(raio,2)); // Testa e retorna valor para o m�todo.
    else return(-1); // Retorna valor de erro (raio <=0)
   } // fim m�todo
  
   static void areaCasa(float lateral, float cquarto) // void instrui que o m�todo n�o retorna valor
   {
    float areaq; // �rea do quarto
    float areas; // �rea da sala
    float areat; // �rea total

    if (lateral<0) System.out.println("Erro: lateral da sala < 0");
    else 
     {
      if (cquarto<0) System.out.println("Erro: lateral do quarto < 0");
      else 
       {      
        areas = lateral*lateral;
        System.out.println("A �rea da sala � "+areas);
    
        areaq = cquarto*(lateral/2);
        System.out.println("A �rea do quarto � "+areaq);
        System.out.println("A �rea do banheiro � "+areaq);
        areat = areas + 2*areaq;
        System.out.println("A �rea total � "+areat);
       }
     } 
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
    
                 System.out.print("O valor da constru��o "); 
    if (valorOK) System.out.println("� "+preco);
    else         System.out.println("n�o foi obtido: �rea negativa.");

   } // fim m�todo
  
} //fim class