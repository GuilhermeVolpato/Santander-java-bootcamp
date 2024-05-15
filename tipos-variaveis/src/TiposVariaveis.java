public class TiposVariaveis {

  public static void main(String[] args) throws Exception {
    double salarioMinimo = 2500.00;

    // Declaração de uma variável do tipo short (número inteiro curto) com valor 1
    short numeroCurto = 1;

    // Conversão implícita: a variável do tipo int (número inteiro normal) está recebendo o valor da variável short.
    // Isso é possível porque o tipo int tem uma capacidade maior do que o tipo short, então não há perda de informação.
    int numeroNormal = numeroCurto;

    // Conversão explícita (casting): a variável do tipo short está recebendo o valor da variável int.
    // Isso requer um casting porque estamos tentando colocar um valor de um tipo maior (int) em um tipo menor (short).
    // Se o valor da variável int for muito grande para o tipo short, haverá perda de informação.
    short numeroCurto2 = (short) numeroNormal;

    int numero = 5;

    numero = numero + 1;

    System.out.println("O valor de numero é: " + numero);

    // final é uma palavra-chave que indica que a variável é constante, ou seja, seu valor não pode ser alterado.
    final double VALOR_DE_PI = 3.14159;
  }
}
