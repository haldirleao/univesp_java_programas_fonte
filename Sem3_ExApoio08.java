// ******************
// 26-05-2019. Semana 3, Exerc�cios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
8) O m�todo abaixo realiza diferentes opera��es (soma, subtra��o, multiplica��o, 
divis�o e exponencia��o) sobre as entradas n1 e n2, dependendo do valor do par�metro
 op. Escreva o resultado que ser� impresso pela execu��o do m�todo abaixo caso ele
 receba os seguintes par�metros:

Dica: crie uma classe �Calculadora� com um m�todo main que chame o m�todo �calcula�
 com cada um dos par�metros pedidos.
*/
// ******************

  public class Sem3_ExApoio08 // criada essa classe e n�o "Calculadora". Motivo: para manter a padroniza��o de nomes dos arquivos.
{ 
   
   public static void main(String[] args) // Rotina principal
   {     
    /* Valores dados no enunciado:
    a. 1.5, 3.5, 1
    b. 1.5, 3.5, 2
    c. 9, 1.5, 3
    d. 9, 1.5, 4
    e. 2, 3, 5
    f. 2, 3, 6
    */
    calcula(1.5, 3.5, 1);
    calcula(1.5, 3.5, 2);
    calcula(9, 1.5, 3);
    calcula(9, 1.5, 4);
    calcula(2, 3, 5);
    calcula(2, 3, 6);
     
   } // fim Rotina principal
    
   static void calcula(double n1, double n2, int op) // M�todo dado no enunciado do exerc�cio.
   {
    switch(op) 
       {
        case 1:
            System.out.println(n1 + "+" + n2 + " = " + (n1+n2));
            break;
        case 2:
            System.out.println(n1 + "-" + n2 + " = " + (n1-n2));
            break;
        case 3:
            System.out.println(n1 + "*" + n2 + " = " + (n1*n2));
            break;
        case 4:
            System.out.println(n1 + "/" + n2 + " = " + (n1/n2));
            break;
        case 5:
            System.out.println(n1 + "^" + n2 + " = " + (Math.pow(n1, n2)));
            break;
        default:
            System.out.println("Operacao invalida!");
       } // fim Switch 
   } // fim m�todo
} //fim class