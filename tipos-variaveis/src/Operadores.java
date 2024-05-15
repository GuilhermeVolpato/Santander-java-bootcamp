public class Operadores {

  public static void main(String[] args) {
    int numero = 5;

    //transforma numero em negativo
    numero = -numero;
    System.out.println("O valor de numero é: " + numero);

    //transforma numero em positivo
    numero = numero * -1;

    ///

    System.out.println("O valor de numero é: " + numero);

    String nomeCompleto = "João" + "da Silva";

    System.out.println(nomeCompleto);

    String cocatenacao = "?";

    cocatenacao = 1 + 1 + 1 + "1";

    System.out.println("O valor de cocatenacao 1 é: " + cocatenacao);

    cocatenacao = 1 + "1" + 1 + 1;

    System.out.println("O valor de cocatenacao 2 é: " + cocatenacao);

    cocatenacao = 1 + "1" + 1 + "1";

    System.out.println("O valor de cocatenacao 3 é: " + cocatenacao);

    cocatenacao = "1" + 1 + 1 + 1;

    System.out.println("O valor de cocatenacao 4 é: " + cocatenacao);

    cocatenacao = "1" + (1 + 1 + 1);

    System.out.println("O valor de cocatenacao 5 é: " + cocatenacao);
    ///

    int numero1 = 5;

    // Adiciona 1 ao valor de numero1, onde o ++numero é diferente de numero++, pois o primeiro incrementa antes de
    // atribuir o valor a variável e o segundo incrementa depois de atribuir o valor a variável.
    numero1++;

    System.out.println("O valor de numero1 é: " + numero1);

    boolean boleano = true;

    // ! é o operador de negação, ele inverte o valor de uma variável booleana.
    boleano = !boleano;
    System.out.println(boleano);

    // operadores ternários

    int a, b;

    a = 5;
    b = 6;

    String resultado = "";

    if (a == b) {
      resultado = "A é igual a B";
    } else {
      resultado = "A é diferente de B";
    }
    // ou

    System.out.println("if normal" + resultado);
    resultado = a == b ? "A é igual a B" : "A é diferente de B";

    System.out.println("if com ? " + resultado);

    // operadores de comparação

    int numero2 = 5;
    int numero3 = 6;

    boolean resultado2 = numero2 == numero3;

    System.out.println("numero1 igual numero2 ?: " + resultado2);

    resultado2 = numero2 != numero3;

    System.out.println("numero1 diferente de numero2 ?: " + resultado2);

    resultado2 = numero2 > numero3;

    System.out.println("numero1 maior que numero2 ?: " + resultado2);

    resultado2 = numero2 < numero3;

    System.out.println("numero1 menor que numero2 ?: " + resultado2);

    if (numero2 == numero3) {
      System.out.println("numero2 é igual a numero3");
    }

    if (numero2 > numero3) {
      System.out.println("numero2 é maior que numero3");
    } else if (numero2 < numero3) {
      System.out.println("numero2 é menor que numero3");
    } else {
      System.out.println("numero1 é igual a numero2");
    }

    String nomeUm = "João";
    String nomeDois = "João";

    // pode ocorrer problemas de comparação de strings, pois o == compara a referência de memória e não o valor da string
    System.out.println("nomeUm é igual a nomeDois ?: " + nomeUm == nomeDois);

    // para comparar o valor de strings, é necessário utilizar o método equals
    System.out.println(
      "nomeUm é igual a nomeDois ?: " + nomeUm.equals(nomeDois)
    );

    // operadores lógicos

    boolean condicao1 = true;
    boolean condicao2 = false;
    // ambas as condições precisam ser verdadeiras
    if (condicao1 && condicao2) {
      System.out.println("condicao1 e condicao2 são verdadeiras");
    }
    // somente uma das condições precisa ser verdadeira
    if (condicao1 || condicao2) {
      System.out.println("condicao1 ou condicao2 são verdadeiras");
    }
  }
}
