// 03-06-2019. Semana 4, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

ENUNCIADO: 9) Dados dois polinômios p(x)=a0+a1x+a2x2+⋯+anxn e q(x)=b0+b1x+b2x2+⋯+bmxn, 
escrever um método que retorne a soma destes polinômios, na forma de um arranjo de elementos.
Os três arranjos que representarão os polinômios de entrada e de saída (retorno) deverão ser 
arranjos de elementos do tipo double, nos quais a primeira posição (índice zero do arranjo) 
contém o valor que não multiplica x, a segunda posição contém o valor que multiplica x 
elevado a primeira, a terceira contém o valor que multiplica x elevado a segunda potência
e assim por diante.

*/
// ******************

import java.util.Arrays;

public class Sem4_ExApoio09
{
  
 static double[] somaPolinomios(double[] p, double[] q) 
 {
  if (p.length != q.length)
  {
   System.out.println("ERRO: O polinômios devem ser de mesmo grau (mesmo número de elementos)\nExecução encerrada");
   System.exit(0);
  }
    
  double[] res = new double[p.length];
  
  for (int i=0;i<res.length;i++) res[i] = p[i] + q[i];   // no gabarito "for (int i=0;i    return res;"
  return res; 
 }
  
 public static void main(String[] args) 
 {
   double[] p = {1,2,3,4,5,6,7}; // define polinomio p
   double[] q = {1,1,1,1,1,1,1}; // define polinomio q
   
   System.out.println(Arrays.toString(p) + ": p");
   System.out.println(Arrays.toString(q) + ": q");
   
   System.out.println(Arrays.toString(somaPolinomios(p,q)) + ": soma polinomio");
   
 } // fim do método main
  
} //fim da classe