// ******************
// 01-06-2019. Exerc�cios de Avalia��o: Pergunta 03
// Para testar: Copiar o texto e colar em 
//       https://www.compilejava.net
// ou no https://www.jdoodle.com/online-// java-compiler
/*
RESPOSTA: III e IV verdadeiras
Programa foi alterado para somar n�meros �mpares entre 0 a 99.
Originalmente entrava em loop infinito e n�o imprimia nada.
*/
// ******************

public class Sem4_Avaliacao_Perg_03
{
 public static void main(String[] args) 
 {
  int i = 0, ac = 0;
  while(i < 100) 
    {
     if(i % 2 != 0) 
      {  
       ac = ac + i; 
       System.out.print(i + " + "); // inclu�do para imprimir "1 + 3 + 5 +..."
      }
     i++; // inclu�do para n�o entrar em loop infinito
    }
   System.out.println(" = " + ac); // inclu�do para imprimir o resultado da soma dos �mpares entre 0 e 99.
 } // fim m�todo

} // fim classe