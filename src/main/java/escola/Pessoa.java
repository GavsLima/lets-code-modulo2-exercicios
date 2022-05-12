package escola;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String rg;

    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome + "\n Cpf: " + cpf +
                            "\n Rg: " + rg);
    }
}
