// ******************
// 26-05-2019. Semana 3, Exerc�cios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
3) Complete o c�digo abaixo do m�todo compara que recebe dois n�meros inteiros,
 n1 e n2, e ent�o diga se n1 � maior, menor ou igual a n2.
      
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
    if (n1>n2) System.out.println(n1 + " � maior que "+n2);
    else 
      if (n1<n2) System.out.println(n1 + " � menor que "+n2);
      else System.out.println(n1 + " � igual "+n2); // n1==n2
     
   } // fim m�todo
} //fim class