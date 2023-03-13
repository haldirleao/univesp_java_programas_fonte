// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
1) Escreva o que será impresso pela execução do método abaixo caso ele receba como
parâmetro os seguintes números:

a. 10 b. 15 c. 21 d. 25 e. 30

static void multiplos2357(int num){
System.out.print("Multiplos de " + num + ": (");
if(num%2 == 0){
System.out.print(" 2 ");
}
if(num%3 == 0){ System.out.print(" 3 ");
}
if(num%5 == 0){
System.out.print(" 5 ");
}
if(num%7 == 0){
System.out.print(" 7 ");
}
System.out.println(")");
}
*/
// ******************


public class Sem3_ExApoio01
{ 
   public static void main(String[] args) // Rotina principal
   {
    /* Números para teste e repostas:
       a. 10    R: Multiplos de 10: ( 2 5 )
       b. 15    R: Multiplos de 15: ( 3 5 )
       c. 21    R: Multiplos de 21: ( 3 7 ) 
       d. 25    R: Multiplos de 25: ( 5 ) 
       e. 30    R: Multiplos de 30: ( 2 3 5 )
    */
     multiplos2357(10);
     multiplos2357(15);
     multiplos2357(21);
     multiplos2357(25);
     multiplos2357(30);
     
   } // fim Rotina principal

   static void multiplos2357(int num)
   {
    System.out.print("Multiplos de " + num + ": (");
    if(num%2 == 0) { System.out.print(" 2 "); }
    if(num%3 == 0){ System.out.print(" 3 "); }
    if(num%5 == 0){System.out.print(" 5 ");}
    if(num%7 == 0){System.out.print(" 7 ");}
    System.out.println(")");
   } // fim método
} //fim class