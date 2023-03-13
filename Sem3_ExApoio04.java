// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
4) Crie um programa que leia três valores inteiros (variáveis a, b e c) 
fornecidos pelo usuário e apresente o menor e o maior deles.
*/
// ******************

import java.util.Scanner;
  
public class Sem3_ExApoio04
{ 
   public static void main(String[] args) // Rotina principal
   {     
    System.out.println("DADOS 3 NÚMEROS, IMPRIME O MENOR E MAIOR DELES");    

    Scanner s = new Scanner(System.in);
    System.out.print("Digite o primeiro número inteiro: ");
    int a = s.nextInt();
     
    System.out.print("Digite o segundo número inteiro: ");
    int b = s.nextInt();

    System.out.print("Digite o terceiro número inteiro: ");
    int c = s.nextInt();

    imprimeMenorEMaior(a,b,c); // chama método. 
	
   } // fim Rotina principal

   static void imprimeMenorEMaior(int a, int b, int c)
   {
    int menor = a;
	int maior = a;
	if (b > maior){ maior = b;}
    if (c > maior){ maior = c;}
    if (b < menor){ menor = b;}
    if (c < menor){ menor = c;}
    System.out.println("Maior: " + maior + ". Menor: " + menor);    
   } // fim método
} //fim class