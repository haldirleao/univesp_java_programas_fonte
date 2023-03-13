// ******************
// 03-06-2019. Semana 4, Exercícios de apoio 01d
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

ENUNCIADO: 1) Determine o que cada um dos trechos de código a seguir irá imprimir:

Aqui está somente o item "d" do exercício
*/
// ******************

  public class Sem4_ExApoio01d
{  
 static void horiz() 
 {
  for (int comp = 1; comp < 11; comp++) System.out.print("*");
  System.out.println();
 }


 static void lado()
 {
  System.out.print("*");
  for (int espaco = 1; espaco <= 8; espaco++) System.out.print(" ");
  System.out.println("*");
 }

 public static void main(String[] args) 
 {
  horiz();
  for (int vert = 1; vert < 4; vert++) lado();
  horiz();

 } // fim método
  
} //fim classe