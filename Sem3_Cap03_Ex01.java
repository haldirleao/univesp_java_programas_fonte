// ******************
// 25-05-2019. Texto-base: 01 (Capítulo 3: Programação de Computadores com Java)
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos + área de psicina redonda:
*/
// ******************


import java.io.*;
import java.util.Scanner;

public class Sem3_Sem3_Cap03_Ex01
{
  public static void main(String args[])
  {
   int A, B, R; 
   Scanner s = new Scanner(System.in);
   System.out.println();
   System.out.print("Entre o valor <A>: ");
   A = s.nextInt(); 
  
   System.out.print("Entre o valor <B>: ");
   B = s.nextInt();
  
   R = A + B;
   System.out.println();
   
   if (R > 10) System.out.print("Resultado = " + R);
   else System.out.print("Não apresentado pois soma menor que 10.");
   System.out.println();
  } // fim método
} //fim classe