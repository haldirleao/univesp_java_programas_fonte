// 09-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 14) Visando a escrita de uma classe para representar retângulos utilizando
a linguagem de programação Java (ou seja, cujos objetos representam retângulos
específicos), as seguintes observações devem ser verificadas:

   . Essa classe deve conter 2 atributos de objeto (não de classe), correspondentes ao 
     comprimento e altura do retângulo;
   . Estes atributos devem ser do tipo double;
   . A classe deve conter um construtor que receba, via seus parâmetros, a altura e comprimento
     do retângulo, abastecendo então os atributos do objeto;
   . Além disso, ela deve também conter os seguintes métodos:
      .Um método sem parâmetros que retorne a área do retângulo representado pelo objeto;
      .Um método sem parâmetros que retorne o valor do perímetro do retângulo representado pelo objeto.

Sendo assim, analise quais das alternativas a seguir contém a classe em Java, descrita nas observações
acima, utilizada para representar retângulos:
*/
// ******************



public class Retangulo {
    double comprimento;
    double altura;
    
    Retangulo (double comprimento, double altura) {
        /*THIS -  Within an instance method or a constructor, this is a reference to 
        the current object — the object whose method or constructor is being 
        called. You can refer to any member of the current object from within
        an instance method or a constructor by using this.
        */
        this.comprimento = comprimento;
        this.altura = altura;
    }
    double area () {
        return(comprimento*altura);
    }
    double perimetro () {
         return(2*comprimento+2*altura);
    }
    
 public static void main(String[] args)
   {
    Retangulo r = new Retangulo(10,10); // cria objeto retangulo com os valores dados
    
    System.out.println("Comprimento: " + r.comprimento + ". Largura: " + r.altura);
    System.out.println("Área: " + r.area() + ". Perimetro: " + r.perimetro());
   } // fim do método main
} // fim da classe