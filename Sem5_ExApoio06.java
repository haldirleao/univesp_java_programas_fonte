// 08-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

ENUNCIADO: 6) Uma determinada loja tem 4 filiais. Ao final do semestre, 
a matriz recebe um balanço de vendas de cada filial (em R$):

Filial	Jan	        Fev	        Mar	        Abr	        Mai	        Jun
Aqui	20.000,00	35.000,00	2.000,20	20.832,00	10.500,00	12.000,00
Lá	    15.453,00	5.300,00	42.000,00	135.832,00	18.580,36	85.200,00
Acolá	14.320,00	55.800,00	12.356,00	2.563,00	100.000,00	63.325,00
Por Aí	12.345,00	44.823,00	15.863,25	56.483,55	93.000,00	4.852,33

Escreva um método que receba essa tabela como parâmetro, retornando a 
filial que mais vendeu durante o semestre (dica: atribua códigos de 0 
a 3 para as filiais e de 0 a 11 para os meses).

*/
// ******************


public class Sem5_ExApoio06

{ 
 // copiado do gabarito
 // a filial que mais vendeu é a linha com maior soma
    static int filial(double[][] t) {
      int fMaior=0; // filial com maior soma
      int sMaior=0; // valor da maior soma

    // para cada filial
    for (int i=0; i<t.length; i++) {
        // calcula sua soma
        int soma = 0;
        for (int j=0; j<t[0].length; j++) soma += t[i][j];
        // verifica se é a maior
        if (i==0) {
            sMaior = soma;
        }
        else {
            if (soma > sMaior) {
                fMaior = i;
                sMaior = soma;
            }
        }
    }
    // retorna o índice dessa filial
    return(fMaior);
}

 
 public static void main(String[] args) // rotina principal 
 {
  double[][] m={{20000, 35000, 2000 , 20832, 10500, 12000}, // Entre com os valores dos elementos da matriz de valores.
                {15453, 5300, 42000, 135832, 18580, 85200},
                {14320, 55800, 12356, 2563, 100000, 63325},
                {12345, 44823, 15863.25, 56483.55, 93000, 4852.33}}; 

  String[] mes={"Janeiro", "Fevereiro", "Março", "Abril","Maio","Junho"};
  String[] filial={"AQUI", "LA", "ACOLA", "POR AI"};

  System.out.println();
  System.out.print("\t\t\t");
  for (int i=0; i<mes.length; i++) // for para imprimir os meses
   {
    System.out.print(mes[i]+"\t");
   }
  System.out.println();
  for (int i=0; i < m.length; i++) // for para imprimir os elementos de de m
   { 
    System.out.println();
    System.out.print(filial[i]+"\t\t");
    for (int j=0; (j < m[i].length); j++)
    {
     System.out.print(m[i][j]+"\t\t");
    }
   }
  System.out.println();
  System.out.println();
    // como método retorna booleano, pode ser testado direto no if.
    System.out.println("A matriz que mais vendeu durante o semestre foi: " + filial[filial(m)]);
 } // fim do método main
  
} //fim da classe