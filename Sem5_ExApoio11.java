// 09-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 11) Uma imagem digital é o emprego mais comum de uma matriz em um computador.
Cada elemento da matriz, formado por linhas e colunas, é denominado de pixel. Cada pixel
descreve uma cor para aquele ponto da imagem. Pode-se dizer que o ponto é uma matriz com 
dimensões n x m, em que n representa a linha e m a coluna.

Com base no enunciado acima, assinale qual das alternativas abaixo representa o método
que gera uma matriz de dimensões 10x10 de números aleatórios: 

Resposta: C
*/
// ******************

import java.text.DecimalFormat;

public class Sem5_ExApoio11 
{
 public static void main(String[] args)
   {
    double[][] m = new double[10][10];
    
    DecimalFormat df = new DecimalFormat();
    df.applyPattern("00.00");
    
    for (int i=0; i<10; i++)
    {
     System.out.println();    
     for (int j=0; j<10; j++)
      {
       m[i][j] = Math.random();
       System.out.print(df.format(m[i][j]) + "\t");
      }
    }
   } // fim do método main
} // fim da classe