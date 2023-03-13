// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
6) Escreva um método chamado mediana que receba três variáveis do tipo int
 chamadas v1, v2 e v3 e imprima o valor da mediana dessas três variáveis.
 
NOTA: PRIMEIRO EXEMPLO DE SOLUÇÃO DO GABARITO, SALVO ENGANO, NÃO ESTÁ CORRETA
EX.: QUANDO SE TESTA COM 3 VALORES IGUAIS NENHUM DOS 3 VALORES É ESCOLHIDO.
*/
// ******************

import java.util.Scanner;
  
public class Sem3_ExApoio06
{ 
   public static void main(String[] args) // Rotina principal
   {     
    System.out.println("DADOS 3 NÚMEROS INTEIRNO IMPRIME A MEDIANA");    

    Scanner s = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    int a = s.nextInt();
     
    System.out.print("Digite o segundo número: ");
    int b = s.nextInt();

    System.out.print("Digite o terceiro número: ");
    int c = s.nextInt();

    imprimeMediana3Valores(a,b,c); // chama método. 
	
   } // fim Rotina principal

   static void imprimeMediana3Valores(int v1, int v2, int v3) // A mediana de três valores é o "valor do meio" deste conjunto de dados.
   {

    double mediana = 999;
    
    // INÍCIO - TENTATIVA - NÃO FUNCIONA PARA (0,1,0) E (1,1,0)
    //if ((v2<=v1)&&(v1<=v3)) mediana = v1;
    // else if ((v1<=v2)&&(v2<=v3)) mediana = v2;
    //  else  ((v2<=v3)&&(v3<=v1)) mediana = v3;
    // FINAL - TENTATIVA - NÃO FUNCIONA PARA (0,1,0) E (1,1,0)

    // Baseado na 2a. implementação do gabarito
    // Feito teste de mesa (testadas com 8 possibilidades). 
    if (v1<v2)
     {
      if (v1>v3) mediana = v1; // v3<v1<v2
       else{
            if (v2<v3) mediana = v2; // v1<v2<v3
            else mediana = v3;
           }
     }
    else // !(v1<v2) == (v1>=v2)
         {
          if (v1<v3) mediana = v1; // v2<=v1<v3
          else
              {
               if (v2>v3) mediana = v2; // v3<v2<=v1
               else mediana = v3; 
              }
         }
    System.out.println("Mediana = " + mediana);
   } // fim método
} //fim class