import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Departamento {
    private String nome;
    private String sigla;

    /*public void adicionarFuncionario(Funcionario f){
        //this.funcionarios.add(f);
    */

    public void adicionarFuncionario(Funcionario...f){
        Collections.addAll(this.funcionarios,f);
    }

    public void removerFuncionario(Funcionario f){
        this.funcionarios.remove(f);
    }

    public double calcularFolhaPagamento(){
        double soma = 0;
        for (Funcionario f: funcionarios)
            soma = soma + f.getSalario();
        return soma;
    }

    public void mostrarFuncionarios(){
        System.out.println("Funcionários do departamento: " + nome);
        for (Funcionario f: funcionarios)
            f.mostrarDados();
    }

    public Departamento() {
    }

    private List <Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
