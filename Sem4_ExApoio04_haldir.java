// 03-06-2019. Semana 4, Exercícios de apoio 04
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

ENUNCIADO: 4) Escreva um método que desenhe um retângulo de "*" de 
n × m (n linhas × m colunas), n e m serão parâmetros inteiros do seu
método. Segue exemplo de 3 linhas e 4 colunas:
****
*  *
****

*/
// ******************

// System.exit(0); - Interrompe a execução do programa.

public class Sem4_ExApoio04_haldir
{
 public static void desenhaRetangulo(int linhas, int colunas)
 {
  System.out.println("*** Desenha retangulo de " + linhas + " linhas X " + colunas + " colunas ***");
   
  if ((linhas <= 2) || (colunas <= 2))
  {
   System.out.println("ERRO: Número de linhas e colunas devem ser >2\nPrograma finalizado.");
   System.exit(0);
  }
   
  System.out.println();
  for (int c = 1; c <= colunas; c++) System.out.print("*") ;
  System.out.println();
  
  for (int l = 2; l < linhas; l++)
  {
   System.out.print("*");
   for (int c = 2; c < colunas; c++)System.out.print(" ");
   System.out.print("*");
   System.out.println();
  }
   
  for (int c = 1; c <= colunas; c++) System.out.print("*") ;
  System.out.println();
 } // fim do método
  
 public static void main(String[] args) 
 {
  int linhas = 5, colunas = 5; // Defina aqui o número de linhas e colunas.
  
  desenhaRetangulo(linhas,colunas);
   
 } // fim do método main
  
} //fim da classe