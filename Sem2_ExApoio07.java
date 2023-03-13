// ******************
// 12-05-2019. Semana 2, Exercicio de apoio: 7
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
7. Escreva um método que determine quanto tempo leva para um corpo cair de determinada altura 
a partir do repouso. Este método receberá como parâmetro um valor do tipo double contendo a 
altura em centímetros em que o corpo está, e deverá retornar um valor do tipo double contendo
o tempo da queda em segundos. Considere que a força da gravidade é igual a 9, 8m/s2. Use o
método Math.sqrt()1 para obter a raiz quadrada.
*/
// ******************


public class Sem2_ExApoio07
{ 
   public static void main(String[] args) // Rotina principal
   {
    double h = 1000.0; // Altura, em metros (m).
    final double g = 9.8; // Gravidade igual 9,8 m²/s.     
    double t; // Tempo de queda, em segundos
     
    t = Math.sqrt(2*h/g); // Calcula queda livre. Fórmula horária: s = (gt²)/2. Parâmetro do método Math.sqrt deve ser tipo double.
     
    System.out.println("Um corpo em queda livre a partir da altura h = " + h + " metros leva " + t + " segundos até tocar o solo.");

   } // fim Rotina principal
  
} //fim class