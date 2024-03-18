import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o texto de entrada: ");
        String texto = entrada.nextLine();

        System.out.println("String: " + texto);

        // Dizer qual é a quantidade de caracteres da String
        int StringLenght = texto.length();
        System.out.println("Quantidade de caracteres: " + StringLenght); // Imprimir a quantidade

        // Imprimir a String com todas as letras maiusculas
        System.out.println("String com as letras maiusculas: " + texto.toUpperCase());

        //O número de vogais da String
        int vogais = contarVogais(texto);
        System.out.println("Número de vogais: " + vogais);

        // Se a string começa com "IFSP"
        boolean comecaComIFSP = texto.toLowerCase().startsWith("ifsp");
        System.out.println("Começa com IFSP: " + comecaComIFSP);

        // Se a string termina com "IFSP"
        boolean terminaComIFSP = texto.toLowerCase().endsWith("ifsp");
        System.out.println("Termina com IFSP: " + terminaComIFSP);

        // O número de dígitos (0 a 9) na string
        int digitos = contarDigitos(texto);
        System.out.println("Número de dígitos: " + digitos);

        // Se a string é um palíndromo ou não
        boolean palindromo = verificarPalindromo(texto);
        System.out.println("É um palíndromo: " + palindromo);
    }

    // Função para contar vogais na string
    public static int contarVogais(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                contador++;
            }
        }
        return contador;
    }

    // Função para contar dígitos na string
    public static int contarDigitos(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    // Função para verificar se a string é um palíndromo
    public static boolean verificarPalindromo(String texto) {
        String textoSemEspacos = texto.replaceAll("\\s+", "").toLowerCase();
        int comprimento = textoSemEspacos.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (textoSemEspacos.charAt(i) != textoSemEspacos.charAt(comprimento - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}