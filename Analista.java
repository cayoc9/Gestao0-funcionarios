public class Analista extends Funcionario {

    public Analista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.3;
    }
}
