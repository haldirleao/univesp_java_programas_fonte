// ******************
// 11-05-2019. Videoaula: 06
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
Programa para calcular a �rea de uma casa (e seus c�modos) de 3 c�modos:
- Uma sala de 10x10m, um banheiro e um quarto de 5X7m cada.

*/
// ******************


public class AreaPiscina
{
   public static void main(String[] args) 
   {
   
   double raio = 2; // raio da piscina
   
   double areap; // �rea da piscina
 
   areap = Math.PI * Math.pow(raio,2); // outra forma: definir pi como "final double pi = 3.14159;" e areap como "area = pi * raio * raio;"
     
   System.out.println("�rea da piscina: "+ areap);
   }
}
