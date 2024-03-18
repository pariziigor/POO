import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite o peso: ");
        double peso = entrada.nextDouble();

        Dados p1 = new Dados(nome, altura, peso);
        System.out.println("IMC do paciente: " + p1.getNome());
        p1.calcularIMC();
    }
}