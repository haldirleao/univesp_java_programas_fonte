// ******************
// 12-05-2019. Semana 2, Exercicio de apoio: 6
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
6. Escreva um método que converta um valor em real (recebido em um parâmetro)
para dólar e retorne o valor em dólar. A taxa de conversão real para dólar
também será um parâmetro de entrada desse método. O valor em real, a taxa 
de conversão e o valor em dólar deverão ser do tipo float. 
*/
// ******************


public class Sem2_ExApoio06
{ 
   public static void main(String[] args) // Rotina principal
   {
    float valorEmReal = (float) 400.0; // nota: o valor float deve ser declarado explicitamente quando possui casas decimais. "float x = 1.25F" ou "float x = (float) 1.25"     
    float taxaConversao = (float) 0.25; // Taxa de conversão de real para dólar. Ex.: R$ 4,00 = USD 1,00, logo taxa = 0,25.
    float valorEmDolar;
     
    valorEmDolar = converteDeRealParaDolar(valorEmReal, taxaConversao);
     
    System.out.println("R$ " + valorEmReal + " à taxa de conversão " + taxaConversao + " equivalem a USD " + valorEmDolar + " .");

   } // fim Rotina principal
  
   public static float converteDeRealParaDolar(float valorEmReal, float taxaConversao) // Método. Dado lado em cm, retorna valor da área do quadrado em cm².
  {
   return valorEmReal * taxaConversao;
  } // fim método
  
} //fim class