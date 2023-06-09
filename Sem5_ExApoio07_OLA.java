// 08-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 7) Escreva uma classe Ola com um único método estático 
“cumprimenta” que, a cada chamada, cumprimenta o usuário de uma entre 
3 maneiras diferentes. Dica: use um atributo estático para, dependendo
 de seu valor, escolher qual das maneiras será usada; depois de imprimir
 a mensagem, altere o valor do atributo.

*/
// ******************


public class Sem5_ExApoio07_OLA {
    static int vez = 0;

    static void cumprimenta() {
        // verifica qual cumprimento usar
        switch (vez) {
            case 0 : System.out.println("Oi");
                    break;
            case 1 : System.out.println("Ola");
                    break;
            default : System.out.println("Alo");
        }
        // muda o cumprimento
        vez = vez==2 ? 0 : ++vez;
    }
    public static void main(String[] args)
    {
     Sem5_ExApoio07_OLA.cumprimenta(); 
     Sem5_ExApoio07_OLA.cumprimenta(); 
     Sem5_ExApoio07_OLA.cumprimenta(); 
     Sem5_ExApoio07_OLA.cumprimenta(); 
     Sem5_ExApoio07_OLA.cumprimenta(); 
     Sem5_ExApoio07_OLA.cumprimenta(); 
     Sem5_ExApoio07_OLA.cumprimenta(); 
    }
}