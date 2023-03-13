// ******************
// 01-06-2019. Exercícios de Avaliação: Pergunta 01
// Para testar: Copiar o texto e colar em 
// https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
RESPOSTA: IMPRIME: b
*/
// ******************

public class Sem4_Avaliacao_Perg_01
{
 public static void main(String[] args) 
 {
  int num = 567;
  if(num % 2 == 0) { System.out.print("a");} 
   else if(num % 3 == 0) { System.out.print ("b");} 
    else if(num % 5 == 0) { System.out.print ("c"); } 
     else if(num % 7 == 0) { System.out.print("d"); } 
      else { System.out.print ("e");}
 } // fim método

} // fim classe