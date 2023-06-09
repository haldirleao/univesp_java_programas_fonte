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


public class Sem4_ExApoio04_gabarito // resolução com base no gararito. Muito elegante a solução !!!
{
 static void desenhaRetangulo(int n, int m)
 {
  System.out.println("*** Desenha retangulo de " + n + " linhas X " + m + " colunas ***");
   
  if ((n <= 2) || (m <= 2))
  {
   System.out.println("ERRO: Número de linhas e colunas devem ser >2\nPrograma finalizado.");
   System.exit(0); //Interrompe a execução do programa.
  }

// INÍCIO: cópia do gabarito   
  for (int i=1;i<=n;i++)
  {
   for (int j=1;j<=m;j++)
   {
    if (j==1 || j==m || i==1 || i==n) System.out.print("*");
    else System.out.print(" ");
   }
   System.out.println();
  }
// FIM: cópia do gabarito
   
 } // fim do método
  
 public static void main(String[] args) 
 {
  int linhas = 3, colunas = 6; // Defina aqui o número de linhas e colunas.
  
  desenhaRetangulo(linhas,colunas);
   
 } // fim do método main
  
} //fim da classe