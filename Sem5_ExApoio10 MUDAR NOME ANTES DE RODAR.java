// 09-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*
ENUNCIADO: 10) Defina uma classe Complexo, contendo atributos correspondentes
 à parte real e imaginária do número complexo. Escreva métodos estáticos
 para efetuar a soma e subtração de dois números complexos (ou seja, dois objetos Complexo).

*/
// ******************

public class Complexo {
    /* Parte real */
    double re;
    /* Parte imaginária */
    double im;

    static Complexo soma(Complexo c1, Complexo c2) { // método pertence à classe.
        Complexo resp = new Complexo();

        resp.re = c1.re + c2.re;
        resp.im = c1.im + c2.im;

        return(resp);
    }

    static Complexo subtrai(Complexo c1, Complexo c2) { // método pertence à classe.
        Complexo resp = new Complexo();

        resp.re = c1.re - c2.re;
        resp.im = c1.im - c2.im;

        return(resp);
    }
//Testar a classe  
public static void main(String[] args)
 {
  Complexo cA = new Complexo();
  Complexo cB = new Complexo();
  Complexo cCalcula = new Complexo();
  
  cA.re = 1; cA.im = 11;
  cB.re = 2; cB.im = 22;
  
  System.out.println("cA.re: " + cA.re + " cA.im: " + cA.im);
  System.out.println("cB.re: " + cB.re + " cB.im: " + cB.im);
  
  Complexo resposta = cCalcula.soma(cA,cB);
  System.out.println("Soma.re: " + resposta.re + " Soma.im: " + resposta.im);

  resposta = cCalcula.subtrai(cA,cB);
  System.out.println("Subtracao.re: " + resposta.re + " Subtracao.im: " + resposta.im);

 } // fim do método main
} // fim da classe