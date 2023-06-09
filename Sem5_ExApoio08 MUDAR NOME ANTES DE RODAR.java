// 09-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*
ENUNCIADO: 8) Escreva uma classe Simples contendo um método que recebe
 um arranjo de inteiros como parâmetro e que inicializa todos os elementos
 do arranjo com um valor, também dado como parâmetro. A assinatura do
 método deve ser a seguinte (note que não é estático):

    void inicializaArray ( int [] a , int v )

Crie agora um método dentro de Simples que, dado um inteiro, verifica se 
ele está presente no arranjo.
 
   boolean estaNoArray ( int[] a , int v )

Finalmente, escreva um método main que cria um arranjo, cria um objeto
 Simples e chama os seus dois métodos.
*/
// ******************


public class Simples{  
   void inicializaArray ( int[] a , int v )
   {
    for (int i=0; i < a.length; i++)
    {
     a[i] = v; // inicializa todos os elementos do arranjo com o valor dado     
    }
   }
    boolean estaNoArray ( int[] a , int v )
    {
     for (int val : a) //percorre todos os valores de a
     {
      if (val == v) return(true);  // TRUE se existe v em a
     }
     return(false); // FALSE se não existe v em a
    }
    
//Testar a classe  
public static void main(String[] args)
{
 int[] a = new int[5]; // cria novo arranjo de 5 elementos
 int   v = 23; // define valor de v a ser passado aos métodos
 
 Simples s = new Simples();
 
 s.inicializaArray(a,v); for (int var : a) System.out.print(var + "\t");
 System.out.println();
 System.out.println(v + " está no arranjo: " + s.estaNoArray(a,v));
  } // fim do método main
} // fim da classe