public class Main3 {
    public static void main(String[] args) {

        String frase = "Olá mundo!";

        String fraseSemExclamacao = frase.substring(0, frase.length() - 1);

        String[] palavras = fraseSemExclamacao.split(" ");

        StringBuilder invertida = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            invertida.append(palavras[i]);
            if (i != 0) {
                invertida.append(" ");
            }
        }

        String resultado = invertida.toString();
        resultado = resultado.substring(0,1).toUpperCase() + resultado.substring(1).toLowerCase();

        resultado += "!";

        System.out.println(resultado);
    }
}