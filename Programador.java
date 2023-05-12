public class Programador extends Funcionario {

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.2;
    }
}
