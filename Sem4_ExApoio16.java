// 03-06-2019. Semana 4, Exercícios de apoio
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

ENUNCIADO: 9) Escreva um método chamado contagemMaior que recebe dois arranjos de 
inteiros como parâmetros (chamados arranjo1 e arranjo2), encontra o valor do maior 
elemento do arranjo1, verifica quantas vezes esse valor ocorre no arranjo2 e 
imprime uma frase da seguinte forma:

O numero yyy aparece zzz vezes no arranjo2.

Sendo yyy o valor do maior elemento do arranjo1 e zzz a quantidade de vezes que esse
número ocorre no arranjo2. Você pode considerar que todos os valores presentes no 
arranjo1 e no arranjo2 serão positivos.

*/
// ******************

import java.util.Arrays;

public class Sem4_ExApoio16
{
  
 static void contagemMaior(int[] arranjo1, int[] arranjo2){ // GABARITO NÃO FUNCIONA
    int maior = 0;
    int contagem = 0;
    for (int i=0;i<arranjo1.length;i++)
    {
        if (arranjo1[i] > maior) maior = arranjo1[i];
    }
        for (int j=0;j<arranjo1.length;j++){
            if (arranjo2[j] == maior) contagem++;
    }
    System.out.println("O numero " + maior + " aparece " + contagem + " vezes no arranjo2.");

 }
  
 public static void main(String[] args) 
 {
   int[] a1 = {10,2,3,4,532,6,7}; // digite os inteiros positivos do arranjo1
   int[] a2 = {7,7,532,10,10,532,532}; // digite os inteiros positivos do arranjo2

   contagemMaior(a1,a2);
   
 } // fim do método main
  
} //fim da classe