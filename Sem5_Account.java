// 06-06-2019. Semana 5, Texto-base: Java como programar
// Para testar: Copiar o texto e colar em https://www.compilejava.net
//              ou no https://www.jdoodle.com/online-java-compiler
/*

Capítulo 3 - pág. 57
Figura 3.1: Account.java
Classe Account que contém uma variável de instância name
e métodos para configurar e obter seu valor.

*/
// ******************

public class Sem5_Account
{
private String name; // variável de instância 

// método para definir o nome no objeto  
public void setName(String name)  
{ 
 this.name = name; // armazena o nome  
} 

// método para recuperar o nome do objeto  
public String getName()  
 {  
  return name; // retorna valor do nome para o chamador 
 }  
} // fim da classe Account
