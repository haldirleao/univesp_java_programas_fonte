// 03-06-2019. Semana 4, Exercícios de apoio 05
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

ENUNCIADO: 5) Produza três versões de um método que escreva n >= 0 
asteriscos em uma linha, sendo o valor n passado como parâmetro. A primeira
versão deve utilizar o comando for, a segunda o comando while e a terceira o comando
do-while.

*/
// ******************


public class Sem4_ExApoio05
{
 static void asterisco1(int n) 
 {
  for (int i=1;i<=n;i++) System.out.print("*");
 }

 static void asterisco2(int n) 
 {
  int i=0;
  while (i<n)
  {
   System.out.print("*");
   i++;
  }
 }

static void asterisco3(int n) 
{
 if (n>0) // Observe que para o do-while é necessária a existência de um if para tratar o caso de n valer zero.
  { // inicio if
   int i=0;
   do
    {
     System.out.print("*");
     i++;
    } 
   while (i<n);
  } // fim if
}
  
 public static void main(String[] args) 
 {
  int n = 5; // quantidade de asteriscos
  
  asterisco1(n);
  System.out.println();
  
  asterisco2(n);
  System.out.println();
  
  asterisco3(n);
   
 } // fim do método main
  
} //fim da classe