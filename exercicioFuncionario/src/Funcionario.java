public class Funcionario {
    private String cpf;
    private String nome;
    private Double salario;
    private Departamento departamento;

    public void mostrarDados(){
        System.out.println("\nCPF: " + cpf
                            + "\nNome: " + nome
                            + "\nSalário: " + salario
                            + "\nDepartamento: " + departamento.getNome());
    }

    public Funcionario(String cpf, String nome, Double salario, Departamento departamento) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
