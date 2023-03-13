// ******************
// 13-05-2019. Semana 2, Exercicio de apoio: 8
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*
8) A CBF resolveu cobrar uma multa para os jogadores que, no campeonato brasileiro, 
receberem cartões amarelos e vermelhos. Dados quatro números inteiros, representando 
o time, o número do jogador, o número de cartões amarelos e vermelhos do jogador, 
calcule o valor da multa, escrevendo a resposta na tela. Considere que a multa por 
cartão amarelo é de R$1000,20 e por cartão vermelho é de R$4523,75.
*/
// ******************


public class Sem2_ExApoio08
{ 
   public static void main(String[] args) // Rotina principal
   {
    int time = 15; // Número inteiro que representa o time;
    int numJogador = 10; // Número inteiro que representa o jogador;
    int qtdeCartaoAmarelo = 2; // Número inteiro que representa os cartões amarelos sofridos pelo jogador;
    int qtdeCartaoVermelho = 2; // Número inteiro que representa os cartões vermelhos sofridos pelo jogador;
     
    double valorMultaAmarelo = 1000.20; // Valor da multa por cartão amarelo em reais.
    double valorMultaVermelho = 4523.75; // Valor da multa por cartão amarelo em reais.
    
    double valorTotal = (qtdeCartaoAmarelo * valorMultaAmarelo) + (qtdeCartaoVermelho * valorMultaVermelho); // Valor total da multa.
     
    System.out.println("Número do time: " + time + "\nNúmero do Jogador: " + numJogador);
    System.out.println("Amarelos: " + qtdeCartaoAmarelo + "\nVermelhos: " + qtdeCartaoVermelho + "\nValor da multa: R$ " + valorTotal);

   } // fim Rotina principal
  
} //fim class