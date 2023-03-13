// ******************
// 26-05-2019. Semana 3, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
9) Escreva um método chamado cor que receba como parâmetro uma variável do
 tipo inteiro, chamada identificador, e imprima a palavra verde caso o valor
 do identificador seja igual a 1, amarelo caso o valor do identificador seja
 igual a 2, azul caso o valor do identificador seja igual a 3, e branco caso
 o valor do identificador seja igual a 4. Caso contrário (isto é, se o valor
 do identificador não for 1, 2, 3 ou 4), deverá imprimir “identificador 
invalido”. Utilize a estrutura switch...case...default para resolver este problema.
*/
// ******************

  public class Sem3_ExApoio09
{ 
   
   public static void main(String[] args) // Rotina principal
   {
    int id=1;
     
    while (id<=5)
    {
     cor(id);
     id++;
    }  
     
   } // fim Rotina principal
    
   static void cor(int identificador) 
   {
    switch(identificador) 
       {
        case 1:
            System.out.println("VERDE");
            break;
        case 2:
            System.out.println("AMARELO");
            break;
        case 3:
            System.out.println("AZUL");
            break;
        case 4:
            System.out.println("BRANCO");
            break;
        default:
            System.out.println("Identificador inválido!");
       } // fim Switch 
   } // fim método
} //fim class