// ******************
// 13-05-2019. Semana 2, Exercicio de apoio: 8
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
8) A CBF resolveu cobrar uma multa para os jogadores que, no campeonato brasileiro, 
receberem cart�es amarelos e vermelhos. Dados quatro n�meros inteiros, representando 
o time, o n�mero do jogador, o n�mero de cart�es amarelos e vermelhos do jogador, 
calcule o valor da multa, escrevendo a resposta na tela. Considere que a multa por 
cart�o amarelo � de R$1000,20 e por cart�o vermelho � de R$4523,75.
*/
// ******************


public class Sem2_ExApoio08
{ 
   public static void main(String[] args) // Rotina principal
   {
    int time = 15; // N�mero inteiro que representa o time;
    int numJogador = 10; // N�mero inteiro que representa o jogador;
    int qtdeCartaoAmarelo = 2; // N�mero inteiro que representa os cart�es amarelos sofridos pelo jogador;
    int qtdeCartaoVermelho = 2; // N�mero inteiro que representa os cart�es vermelhos sofridos pelo jogador;
     
    double valorMultaAmarelo = 1000.20; // Valor da multa por cart�o amarelo em reais.
    double valorMultaVermelho = 4523.75; // Valor da multa por cart�o amarelo em reais.
    
    double valorTotal = (qtdeCartaoAmarelo * valorMultaAmarelo) + (qtdeCartaoVermelho * valorMultaVermelho); // Valor total da multa.
     
    System.out.println("N�mero do time: " + time + "\nN�mero do Jogador: " + numJogador);
    System.out.println("Amarelos: " + qtdeCartaoAmarelo + "\nVermelhos: " + qtdeCartaoVermelho + "\nValor da multa: R$ " + valorTotal);

   } // fim Rotina principal
  
} //fim class