// 08-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 1) Escreva métodos que recebam uma matriz de n × m inteiros como parâmetro e:
   a) Determine o maior valor nela contido.
   b) Retorne a posição da matriz em que se encontra a primeira ocorrência do valor máximo 
(na forma de um arranjo em que a posição 0 corresponde à linha e 1 à coluna).

*/
// ******************

public class Sem5_ExApoio01
{
 static int maiorValor(int[][] m) {
    int maior = m[0][0];
    for (int i=0; i<m.length; i++) {
        for (int j=0; j<m[i].length; j++)
           if (m[i][j] > maior) maior = m[i][j];
    }
    return(maior);
}
 
 public static void main(String[] args) // rotina principal 
 {
  int[][] m={{1,2,11,0},{15,35,55,4},{15,20,9,20}};
  
  for (int i=0; i<m.length; i++) {
        System.out.println();
        for (int j=0; j<m[i].length; j++)
           System.out.print(m[i][j]+"\t");
    }
  System.out.println();
  System.out.println("Maior valor da matriz é: "+ maiorValor(m)); 
 } // fim do método main
  
} 
//fim da classe
  