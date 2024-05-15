public class Comentarios {

  public static void main(String[] args) {
    // Este é um comentário de uma linha
    System.out.println("Hello World");
    /* Este é um comentário de múltiplas linhas
    que pode ser utilizado para comentar várias linhas
    de código */
    System.out.println("Hello World");
  }

  /**
   * Este é um comentário de documentação
   * que pode ser utilizado para documentar
   * o código
   */
  public void metodo() {}

  /*
   * Este método foi elaborado as pressas
   * por isso eu abrevei o nome das variáveis
   * mas olha, ele tem a finalidade somar ou  multiplicar
   * dois números
   */
  public int somaMultiplica(int n, int x, String m) {
    // codigo ruim pois necessita de muito comentario para compreensão.
    int r = 0; // r é igual ao resultado
    if (m == "M") { // M= multiplicação
      r = n * x;
    } else {
      // se não soma mesmo
      r = n + x;
    }
    return r;
  }
  // java doc

  // javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
}
