public class Dados {
    private String nome;
    private double peso;
    private double altura;

    public void calcularIMC(){
        double imc = this.peso / Math.pow(this.altura,2);
        if (imc <= 18.5)
            System.out.println("Abaixo do peso!");
        else if (imc <= 24.9)
            System.out.println("Peso normal!");
        else if (imc <= 29.9)
            System.out.println("Acima do peso!");
        else if (imc <= 34.9)
            System.out.println("Obesidade I!");
        else if (imc <= 39.9)
            System.out.println("Obesidade II!");
        else
            System.out.println("Obesidade III");
    }
    public Dados(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
