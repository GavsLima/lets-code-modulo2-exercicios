package escola;

import java.util.ArrayList;

public class Professor extends Pessoa {
    private float salario;
    private ArrayList<String> turmas = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, String cpf, String rg, float salario,
                     ArrayList<String> turmas, ArrayList<Disciplina> disciplinas) {
        super(nome, cpf, rg);
        this.salario = salario;
        this.turmas = turmas;
        this.disciplinas = disciplinas;
    }

    public void adicionaDisciplina(Disciplina disciplina){
        if(!verificaSeExisteDisciplina(disciplina)){
            disciplinas.add(disciplina);
            System.out.println("Disciplina adicionada com sucesso!");
        }
        else{
            System.out.println("Disciplina já está relacionada ao professor!");
        }
    }

    public boolean verificaSeExisteDisciplina(Disciplina disciplina){
        if (disciplinas.contains(disciplina)){
            return true;
        }
        else{
            return false;
        }
    }

    public void imprimirProfessor(){
        imprimir();
        System.out.printf("Salário: R$ %f.2f \n");
        System.out.println("Turmas: ");
        for (String t : turmas){
            System.out.printf("%s ", t);
        }
        System.out.println("\nDisciplinas:");
        for (Disciplina d : disciplinas){
            System.out.printf("%s ", d.getNome());
        }
    }
}
