public class MinhaClasse {
    public static void main(String[] args) {
        String nome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
        System.out.println("Hello world!");
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}
