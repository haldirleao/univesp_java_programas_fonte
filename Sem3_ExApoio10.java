// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
10) Para realizar a conversão de temperaturas como Celsius (C), Fahrenheit (F) e
 Kelvin (K), são utilizadas as seguintes fórmulas:

  - Celsius ? Fahrenheit: C/5 = (F-32)/9
  - Celsius ? Kelvin: K = C + 273
  - Kelvin ? Fahrenheit: (K-273)/5 = (F-32)/9

Construa um método para conversão de temperaturas seguindo as seguintes orientações:
  - O método recebe como parâmetros: um valor double chamado temp representando uma 
    temperatura, e um valor inteiro chamado conv representando um código de conversão 
    de temperaturas.
  - O método deve, então, converter de um sistema para outro, entre Celsius, Fahrenheit 
    e Kelvin dependendo do valor de conv, conforme descrito abaixo. Qualquer outro valor
    de conv deve fazer o método retornar Double.NaN.
     1. Converte temp, em Celsius, para Fahrenheit.
     2. Converte temp, em Fahrenheit, para Celsius.
     3. Converte temp, em Kelvin, para Celsius.
     4. Converte temp, em Celsius, para Kelvin.
     5. Converte temp, em Fahrenheit, para Kelvin.
     6. Converte temp, em Kelvin, para Fahrenheit.

Use switch...case para implementar esse método.

     static double conversorTemperatura(double temp, int conv){
         //seu código
}
*/
// ******************

import java.util.Scanner;

  public class Sem3_ExApoio10
{ 
   
   public static void main(String[] args) // Rotina principal
   { 
    System.out.println("CONVERSOR DE TEMPERATURAS");
    System.out.println("Opção\t\tDe:\t\tPara:");
    System.out.println("1\t\tCelsius\t\tFahrenheit");
    System.out.println("2\t\tFahrenheitt\tCelsius");
    System.out.println("3\t\tKelvin\t\tCelsius");
    System.out.println("4\t\tCelsius\t\tKelvin");
    System.out.println("5\t\tFahrenheit\tKelvin");
    System.out.println("6\t\tKelvin\t\tFahrenheit");

    Scanner s = new Scanner(System.in);
    System.out.print("Escolha a opção: ");
    int op = s.nextInt();
     
    System.out.print("Valor da temperatura a converter: ");
    double temp = s.nextDouble(); 

    System.out.print("Valor convertido: " + conversorTemperatura(temp, op)); 
     
   } // fim Rotina principal
    
   static double conversorTemperatura(double temp, int conv) 
   {
     
     switch(conv) 

       {
        case 1: // Converte temp, em Celsius, para Fahrenheit.
            return ((temp * (9.0/5.0)) + 32.0); // C = ((F-32)/9)*5 // Se não usar ".0" entende que é divisão de inteiros, e retorna somente a parte inteira da divisão.
       
        case 2: // Converte temp, em Fahrenheit, para Celsius.
            return ((temp-32.0)/9.0) * 5.0; // // C = ((F-32)/9)*5
       
        case 3: // Converte temp, em Kelvin, para Celsius.
            return temp - 273.0; //K = C + 273
       
        case 4: // Converte temp, em Celsius, para Kelvin.
            return temp + 273.0; // K = C + 273
       
        case 5: // Converte temp, em Fahrenheit, para Kelvin.
            return (1.0/9.0) * (5.0 * temp + 2297.0); // (K-273)/5 = (F-32)/9
       
        case 6: // Converte temp, em Kelvin, para Fahrenheit.
            return (1.0/5.0) * (9.0 * temp -  2297.0); // (K-273)/5 = (F-32)/9
       
        default:
            return Double.NaN; // Conversão não esperada.
       } // fim Switch 
   } // fim método
} //fim class