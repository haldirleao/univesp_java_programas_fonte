// ******************
// 12-05-2019. Semana 2, Exercicio de apoio: 1
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Determine o que será impresso (pelos comandos println()) após a execução das instruções a
seguir:
int a = 3;
int b = 5;
int c = 8;
int d = a * (b + c * 3) - 7;
int e = a - b - c;
System.out.println(a+" "+b+" "+c+" "+d+" "+e);
a = a + 1;
b = (4 * a + 1) / 10;
c = (4 * a + 1) % 10;
System.out.println(a+" "+b+" "+c+" "+d+" "+e);
*/
// ******************


public class Sem2_ExApoio01
{ 
   public static void main(String[] args) // Rotina principal
   {
    int a = 3;
    int b = 5;
    int c = 8;
    int d = a * (b + c * 3) - 7;
    int e = a - b - c;
    System.out.println(a+" "+b+" "+c+" "+d+" "+e);

    a = a + 1;
    b = (4 * a + 1) / 10;
    c = (4 * a + 1) % 10;
    System.out.println(a+" "+b+" "+c+" "+d+" "+e);
   } // fim Rotina principal
} //fim class