// 09-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*
ENUNCIADO: 9) Crie a seguinte classe que represente figuras esféricas:

Atributos: 
   . raio (double, não estático)
Métodos:
   . Construtor que recebe um valor, via parâmetro, para o atributo raio
   . area() – calcula a área (double) da superfície da esfera
   . volume() – calcula o volume (double) da esfera

*/
// ******************
public class Esfera {
    
    // atributo único para cada objeto instanciado.
    double raio; 
    
    // construtor
    Esfera(double r) {
        raio = r;
    }

    // método único para cada objeto instanciado.
    double area() {
        return(4 * Math.PI * Math.pow(raio,2));
    }

    //método único para cada objeto instanciado.
    // Em volume(), é um erro fazer 4/3, a menos que faça 4.0/3 ou 4/3.0. Não importa se Math.pow(raio,2) for substituido por raio*raio, ou Math.pow(raio,3) por raio*raio*raio
    double volume() {
        return(4 * Math.PI * Math.pow(raio,3) / 3);
    }
    
//Testar a classe  
public static void main(String[] args)
 {
  double raio = 1; // define valor do raio da esfera.
  Esfera a = new Esfera(raio);
 
  System.out.println(raio + " eh o raio da esfera. A area eh: " + a.area());
  
  System.out.println("O volume eh: " + a.volume());
  
 
 } // fim do método main
} // fim da classe