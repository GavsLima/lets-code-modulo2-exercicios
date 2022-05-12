package escola;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private int idade;
    private String turma;
    ArrayList<Disciplina> disciplinas;

    public Aluno(String nome, String cpf, String rg, int idade,
                 String turma, ArrayList<Disciplina> disciplinas) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.disciplinas = disciplinas;
    }

    public Aluno(String nome, String cpf, String rg, int idade, String turma) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.disciplinas = new ArrayList<>();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public float calculaMediaDasNotas(){
        float somaNotas = 0;
        int qtdDisciplinas = 0;
        for (Disciplina d : disciplinas){
            somaNotas += d.getNota();
            qtdDisciplinas += 1;
        }
        return somaNotas / qtdDisciplinas;
    }

    public void imprimirAluno() {
       imprimir();
       System.out.println("Idade: " + idade);
       System.out.println("Turma: " + turma);
       System.out.println("Notas:");
       for (Disciplina d : disciplinas){
           System.out.printf("%s: %.2f", d.getNome(), d.getNota());
       }
    }
}
