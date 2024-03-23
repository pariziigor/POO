public class Main {
    public static void main(String[] args) {
        Departamento d1 = new Departamento("Tec da Info", "TI");

        Funcionario f1 = new Funcionario("123", "Maria", 2500.00, d1);
        Funcionario f2 = new Funcionario("456", "José", 3500.00, d1);
        Funcionario f3 = new Funcionario("789", "Mario", 4500.00, d1);

        d1.adicionarFuncionario(f1, f2, f3);

        System.out.println("Folha de pagamento: "
                            +d1.calcularFolhaPagamento());

        d1.mostrarFuncionarios();
    }
}