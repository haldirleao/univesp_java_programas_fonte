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

public class Sem3_Sem3_Cap03_Ex03
{
  public static void main(String args[])
  {
   int MES; 
   Scanner s = new Scanner(System.in);
  
   System.out.println(); 
   System.out.print("Entre um valor referente a um MES: "); 
   MES = s.nextInt();
   System.out.println();

   switch (MES) 
   {
    case 1: System.out.println("Janeiro");	break; 
    case 2: System.out.println("Fevereiro");	break;
    case 3: System.out.println("Marco");	break; 
    case 4:  System.out.println("Abril");	break;
    case 5: System.out.println("Maio");	break;
    case 6: System.out.println("Junho");	break;
    case 7: System.out.println("Julho");	break;
    case 8: System.out.println("Agosto");	break;
    case 9: System.out.println("Setembro");	break;
    case 10: System.out.println("Outubro");	break;
    case 11: System.out.println("Novembro");	break;
    case 12: System.out.println("Dezembro");	break;
    default: System.out.println("Mes invalido");	break;
} System.out.println();


  } // fim método
} //fim classe