// ******************
// 12-05-2019. Semana 2, Exercicio de apoio: 6
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
6. Escreva um m�todo que converta um valor em real (recebido em um par�metro)
para d�lar e retorne o valor em d�lar. A taxa de convers�o real para d�lar
tamb�m ser� um par�metro de entrada desse m�todo. O valor em real, a taxa 
de convers�o e o valor em d�lar dever�o ser do tipo float. 
*/
// ******************


public class Sem2_ExApoio06
{ 
   public static void main(String[] args) // Rotina principal
   {
    float valorEmReal = (float) 400.0; // nota: o valor float deve ser declarado explicitamente quando possui casas decimais. "float x = 1.25F" ou "float x = (float) 1.25"     
    float taxaConversao = (float) 0.25; // Taxa de convers�o de real para d�lar. Ex.: R$ 4,00 = USD 1,00, logo taxa = 0,25.
    float valorEmDolar;
     
    valorEmDolar = converteDeRealParaDolar(valorEmReal, taxaConversao);
     
    System.out.println("R$ " + valorEmReal + " � taxa de convers�o " + taxaConversao + " equivalem a USD " + valorEmDolar + " .");

   } // fim Rotina principal
  
   public static float converteDeRealParaDolar(float valorEmReal, float taxaConversao) // M�todo. Dado lado em cm, retorna valor da �rea do quadrado em cm�.
  {
   return valorEmReal * taxaConversao;
  } // fim m�todo
  
} //fim class