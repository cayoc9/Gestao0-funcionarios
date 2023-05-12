public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];
        funcionarios[0] = new Programador("João", 3000.00);
        funcionarios[1] = new Analista("Maria", 4000.00);

        for (Funcionario f : funcionarios) {
            System.out.println("Salário de " + f.getNome() + ": R$ " + f.calcularSalario());
        }
    }
}
