// ******************
// 12-05-2019. Semana 2, Exercicio de apoio: 5
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
(TAREFA DIRIGIDA) Para treinar a construção de algoritmos em Java, vamos construir um programa 
que sabe calcular o custo de peças no estilo TANGRAM.
Para isso, precisamos calcular a área de diferentes formas geométricas e também o custo 
que teriam as peças construídas com essas formas, dependendo do tipo de material utilizado.
Responda às questões seguintes. Caso tenha dúvida em um item, veja o gabarito, e então tente 
fazer o item seguinte sem olhá-lo. Repita até o final da atividade.
*/
// ******************


import java.util.Scanner; // importa método Scanner da biblioteca java.util para capturar entrada do usuário via teclado.
  
public class Sem2_ExApoio05
{ 
   static double  custoCm2Metal = 2.5; // Valor de custo do cm² de metal, em reais.
   static double  custoCm2Plastico = 1.5; // Valor de custo do cm² de plástico, em reais.
  
   public static void main(String[] args)
   {
    double areaQuadrado; 
    double lado = 2.5; // lado do quadradro em cm.
    double areaTrianguloReto;
    double cateto = 4.0; // catetos do triângulo retângulo em cm.
    double areaParalelogramo;
    double basep = 4.0 ; // base do paralelogramo em cm.
    double alturap = 2.5; // altura do paralelogramo em cm.
     
// Custo para fazer um Tangram inteiramente de metal, nas dimensões 16 cm x 16 cm.
    double custoTangramMetal16x16cm2 = custoCm2Metal * areaQuadrado(16);
     
/*     Calcule o custo total para produzir as seguintes peças de reposição de
Tangram: 3 triângulos de 5 cm de cateto cada, em plástico; 2 paralelogramos
de base 7.1 cm e altura 2.7 cm, em plástico; 1 quadrado de lado 4 cm, em
metal; e 1 triângulo de cateto 4 cm, também em metal. Imprima o resultado.
*/
     double areaPlastico = 3 * areaTrianguloReto(5) + 2 * areaParalelogramo(7.1, 2.7); //area de plástico
     double areaMetal = areaQuadrado(4) + areaTrianguloReto(4); //area de metal
     double custoTotal = (custoCm2Plastico * areaPlastico) + (custoCm2Metal * areaMetal); //calcula o custo total

/*
Adicione ao seu programa uma funcionalidade: ele solicita ao usuário que forneça os valores de custo por área de borracha (variável do tipo double).
Então, ele usa esses valores para calcular o custo de um Tangram inteiramente de borracha, com dimensões 10.5x10.5 cm.
Para ler entrada do usuário, use a classe Scanner (veja Seção 2.5 do livro-texto) e o método nextDouble(). 
*/
     Scanner input = new Scanner(System.in); //cria scanner para ler dados do usuário
     System.out.print("Entre com o custo da borracha: ");
     double custoBorracha = input.nextDouble(); // lê o número fornecido pelo usuário, no formato double
     double custoTrangramBorracha = custoBorracha * areaQuadrado(10.5); //custo para tangram 16x16 de metal
  
     
    System.out.println("--- CALCULADOR DE ÁREAS ---");
    
    areaQuadrado = areaQuadrado(lado); 
    System.out.println("Quadrado de lado " + lado + " cm, logo a área deste quadradro é " + areaQuadrado + " cm².\n"); 
    
    areaTrianguloReto = areaTrianguloReto(cateto); 
    System.out.println("Triângulo retângulo com catetos de " + cateto + " cm, logo a área deste triângulo retângulo é " + areaTrianguloReto + " cm².\n"); 
     
    areaParalelogramo = areaParalelogramo(basep,alturap); 
    System.out.println("Paralelogramo com base " + basep + " cm e altura " + alturap + " cm, logo a área deste paralelogramo é " + areaParalelogramo + " cm².\n"); 
     
          
    System.out.println("--- CALCULADOR DE CUSTOS ---");
     
    System.out.println("Um Tangram de 16cm X 16cm de metal custa R$ " + custoTangramMetal16x16cm2 + " .\n"); 
  
    System.out.println("Custo total de pecas de reposicao R$" + custoTotal + " .\n"); //imprime custo total  
    
    System.out.println("Um Tangram de 10,5 cm X 10,5 cm de borracha custa R$ " + custoTrangramBorracha + " .\n"); //imprime custo total   

   } // fim Rotina principal

  
  public static double areaQuadrado(double lado) // Método. Dado lado em cm, retorna valor da área do quadrado em cm².
  {
   return Math.pow(lado,2);
  } // fim método

  public static double areaTrianguloReto(double cateto) // Método. Triângulo retângulo com os 2 catetos de igual valor. Dado cateto em cm, retorna valor da área do triângulo reto em cm².
  {
   return (cateto*cateto)/2; // Calcula área e retorna para o método. (A=(c*c)/2)
  } // fim método
  
  public static double areaParalelogramo(double base, double altura) // Método. Dadas a base e altura em cm, retorna valor da área do paralelogramo em cm².
  {
   return (base*altura); // Calcula área e retorna para o método. (A=b*h)
  } // fim método

} //fim class