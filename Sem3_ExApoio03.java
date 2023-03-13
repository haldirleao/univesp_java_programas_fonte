// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
3) Complete o código abaixo do método compara que recebe dois números inteiros,
 n1 e n2, e então diga se n1 é maior, menor ou igual a n2.
      
       static void compara(int n1, int n2) {
*/
// ******************

public class Sem3_ExApoio03
{ 
   public static void main(String[] args) // Rotina principal
   {
    compara(3,2); // Altere aqui os valores dos inteiros n1 e n2.	
   } // fim Rotina principal

   static void compara(int n1, int n2)
   {
    if (n1>n2) System.out.println(n1 + " é maior que "+n2);
    else 
      if (n1<n2) System.out.println(n1 + " é menor que "+n2);
      else System.out.println(n1 + " é igual "+n2); // n1==n2
     
   } // fim método
} //fim class