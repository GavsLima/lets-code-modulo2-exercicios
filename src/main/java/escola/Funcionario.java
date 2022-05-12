package escola;

public class Funcionario extends Pessoa{
    private String cargo;
    private float salario;

    public Funcionario(String nome, String cpf, String rg, String cargo, float salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void imprimirFuncionario(){
        imprimir();
        System.out.printf("Cargo: %s\n", cargo);
        System.out.printf("Salário R$ %.2f", salario);
    }
}
