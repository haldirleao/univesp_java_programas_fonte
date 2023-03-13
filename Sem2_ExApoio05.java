// ******************
// 12-05-2019. Semana 2, Exercicio de apoio: 5
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
(TAREFA DIRIGIDA) Para treinar a constru��o de algoritmos em Java, vamos construir um programa 
que sabe calcular o custo de pe�as no estilo TANGRAM.
Para isso, precisamos calcular a �rea de diferentes formas geom�tricas e tamb�m o custo 
que teriam as pe�as constru�das com essas formas, dependendo do tipo de material utilizado.
Responda �s quest�es seguintes. Caso tenha d�vida em um item, veja o gabarito, e ent�o tente 
fazer o item seguinte sem olh�-lo. Repita at� o final da atividade.
*/
// ******************


import java.util.Scanner; // importa m�todo Scanner da biblioteca java.util para capturar entrada do usu�rio via teclado.
  
public class Sem2_ExApoio05
{ 
   static double  custoCm2Metal = 2.5; // Valor de custo do cm� de metal, em reais.
   static double  custoCm2Plastico = 1.5; // Valor de custo do cm� de pl�stico, em reais.
  
   public static void main(String[] args)
   {
    double areaQuadrado; 
    double lado = 2.5; // lado do quadradro em cm.
    double areaTrianguloReto;
    double cateto = 4.0; // catetos do tri�ngulo ret�ngulo em cm.
    double areaParalelogramo;
    double basep = 4.0 ; // base do paralelogramo em cm.
    double alturap = 2.5; // altura do paralelogramo em cm.
     
// Custo para fazer um Tangram inteiramente de metal, nas dimens�es 16 cm x 16 cm.
    double custoTangramMetal16x16cm2 = custoCm2Metal * areaQuadrado(16);
     
/*     Calcule o custo total para produzir as seguintes pe�as de reposi��o de
Tangram: 3 tri�ngulos de 5 cm de cateto cada, em pl�stico; 2 paralelogramos
de base 7.1 cm e altura 2.7 cm, em pl�stico; 1 quadrado de lado 4 cm, em
metal; e 1 tri�ngulo de cateto 4 cm, tamb�m em metal. Imprima o resultado.
*/
     double areaPlastico = 3 * areaTrianguloReto(5) + 2 * areaParalelogramo(7.1, 2.7); //area de pl�stico
     double areaMetal = areaQuadrado(4) + areaTrianguloReto(4); //area de metal
     double custoTotal = (custoCm2Plastico * areaPlastico) + (custoCm2Metal * areaMetal); //calcula o custo total

/*
Adicione ao seu programa uma funcionalidade: ele solicita ao usu�rio que forne�a os valores de custo por �rea de borracha (vari�vel do tipo double).
Ent�o, ele usa esses valores para calcular o custo de um Tangram inteiramente de borracha, com dimens�es 10.5x10.5 cm.
Para ler entrada do usu�rio, use a classe Scanner (veja Se��o 2.5 do livro-texto) e o m�todo nextDouble(). 
*/
     Scanner input = new Scanner(System.in); //cria scanner para ler dados do usu�rio
     System.out.print("Entre com o custo da borracha: ");
     double custoBorracha = input.nextDouble(); // l� o n�mero fornecido pelo usu�rio, no formato double
     double custoTrangramBorracha = custoBorracha * areaQuadrado(10.5); //custo para tangram 16x16 de metal
  
     
    System.out.println("--- CALCULADOR DE �REAS ---");
    
    areaQuadrado = areaQuadrado(lado); 
    System.out.println("Quadrado de lado " + lado + " cm, logo a �rea deste quadradro � " + areaQuadrado + " cm�.\n"); 
    
    areaTrianguloReto = areaTrianguloReto(cateto); 
    System.out.println("Tri�ngulo ret�ngulo com catetos de " + cateto + " cm, logo a �rea deste tri�ngulo ret�ngulo � " + areaTrianguloReto + " cm�.\n"); 
     
    areaParalelogramo = areaParalelogramo(basep,alturap); 
    System.out.println("Paralelogramo com base " + basep + " cm e altura " + alturap + " cm, logo a �rea deste paralelogramo � " + areaParalelogramo + " cm�.\n"); 
     
          
    System.out.println("--- CALCULADOR DE CUSTOS ---");
     
    System.out.println("Um Tangram de 16cm X 16cm de metal custa R$ " + custoTangramMetal16x16cm2 + " .\n"); 
  
    System.out.println("Custo total de pecas de reposicao R$" + custoTotal + " .\n"); //imprime custo total  
    
    System.out.println("Um Tangram de 10,5 cm X 10,5 cm de borracha custa R$ " + custoTrangramBorracha + " .\n"); //imprime custo total   

   } // fim Rotina principal

  
  public static double areaQuadrado(double lado) // M�todo. Dado lado em cm, retorna valor da �rea do quadrado em cm�.
  {
   return Math.pow(lado,2);
  } // fim m�todo

  public static double areaTrianguloReto(double cateto) // M�todo. Tri�ngulo ret�ngulo com os 2 catetos de igual valor. Dado cateto em cm, retorna valor da �rea do tri�ngulo reto em cm�.
  {
   return (cateto*cateto)/2; // Calcula �rea e retorna para o m�todo. (A=(c*c)/2)
  } // fim m�todo
  
  public static double areaParalelogramo(double base, double altura) // M�todo. Dadas a base e altura em cm, retorna valor da �rea do paralelogramo em cm�.
  {
   return (base*altura); // Calcula �rea e retorna para o m�todo. (A=b*h)
  } // fim m�todo

} //fim class