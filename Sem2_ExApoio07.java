// ******************
// 12-05-2019. Semana 2, Exercicio de apoio: 7
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
7. Escreva um m�todo que determine quanto tempo leva para um corpo cair de determinada altura 
a partir do repouso. Este m�todo receber� como par�metro um valor do tipo double contendo a 
altura em cent�metros em que o corpo est�, e dever� retornar um valor do tipo double contendo
o tempo da queda em segundos. Considere que a for�a da gravidade � igual a 9, 8m/s2. Use o
m�todo Math.sqrt()1 para obter a raiz quadrada.
*/
// ******************


public class Sem2_ExApoio07
{ 
   public static void main(String[] args) // Rotina principal
   {
    double h = 1000.0; // Altura, em metros (m).
    final double g = 9.8; // Gravidade igual 9,8 m�/s.     
    double t; // Tempo de queda, em segundos
     
    t = Math.sqrt(2*h/g); // Calcula queda livre. F�rmula hor�ria: s = (gt�)/2. Par�metro do m�todo Math.sqrt deve ser tipo double.
     
    System.out.println("Um corpo em queda livre a partir da altura h = " + h + " metros leva " + t + " segundos at� tocar o solo.");

   } // fim Rotina principal
  
} //fim class