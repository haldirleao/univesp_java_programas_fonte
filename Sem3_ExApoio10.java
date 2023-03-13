// ******************
// 26-05-2019. Semana 3, Exerc�cios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
10) Para realizar a convers�o de temperaturas como Celsius (C), Fahrenheit (F) e
 Kelvin (K), s�o utilizadas as seguintes f�rmulas:

  - Celsius ? Fahrenheit: C/5 = (F-32)/9
  - Celsius ? Kelvin: K = C + 273
  - Kelvin ? Fahrenheit: (K-273)/5 = (F-32)/9

Construa um m�todo para convers�o de temperaturas seguindo as seguintes orienta��es:
  - O m�todo recebe como par�metros: um valor double chamado temp representando uma 
    temperatura, e um valor inteiro chamado conv representando um c�digo de convers�o 
    de temperaturas.
  - O m�todo deve, ent�o, converter de um sistema para outro, entre Celsius, Fahrenheit 
    e Kelvin dependendo do valor de conv, conforme descrito abaixo. Qualquer outro valor
    de conv deve fazer o m�todo retornar Double.NaN.
     1. Converte temp, em Celsius, para Fahrenheit.
     2. Converte temp, em Fahrenheit, para Celsius.
     3. Converte temp, em Kelvin, para Celsius.
     4. Converte temp, em Celsius, para Kelvin.
     5. Converte temp, em Fahrenheit, para Kelvin.
     6. Converte temp, em Kelvin, para Fahrenheit.

Use switch...case para implementar esse m�todo.

     static double conversorTemperatura(double temp, int conv){
         //seu c�digo
}
*/
// ******************

import java.util.Scanner;

  public class Sem3_ExApoio10
{ 
   
   public static void main(String[] args) // Rotina principal
   { 
    System.out.println("CONVERSOR DE TEMPERATURAS");
    System.out.println("Op��o\t\tDe:\t\tPara:");
    System.out.println("1\t\tCelsius\t\tFahrenheit");
    System.out.println("2\t\tFahrenheitt\tCelsius");
    System.out.println("3\t\tKelvin\t\tCelsius");
    System.out.println("4\t\tCelsius\t\tKelvin");
    System.out.println("5\t\tFahrenheit\tKelvin");
    System.out.println("6\t\tKelvin\t\tFahrenheit");

    Scanner s = new Scanner(System.in);
    System.out.print("Escolha a op��o: ");
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
            return ((temp * (9.0/5.0)) + 32.0); // C = ((F-32)/9)*5 // Se n�o usar ".0" entende que � divis�o de inteiros, e retorna somente a parte inteira da divis�o.
       
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
            return Double.NaN; // Convers�o n�o esperada.
       } // fim Switch 
   } // fim m�todo
} //fim class