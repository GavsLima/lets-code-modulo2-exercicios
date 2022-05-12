package escola;

import javax.swing.*;
import java.util.ArrayList;

public class Escola {
    ArrayList<Aluno> alunos;
    ArrayList<Funcionario> funcionarios;
    ArrayList<Professor> professores;

    public Escola(){
        this.alunos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void adicionaAluno(Aluno newAluno){
        int indexOfAluno = encontraIndexAluno(newAluno.cpf);

        if (indexOfAluno == -1){
            alunos.add(newAluno);
            System.out.println("Aluno cadastrado com sucesso!");
        }
        else {
            System.out.println("Aluno já existente!");
        }

    }

    public void modificaAluno(String cpf, Aluno aluno){
        for (Aluno a : alunos){
            if (cpf.equals(a.getCpf())){
                a = aluno;
                System.out.println("Modificação realizada com sucesso!");
                return;
            }
        }
        System.out.println("Cpf não encontrado!");
    }

    public void removeAluno(String cpf){
        int indexOfAluno = encontraIndexAluno(cpf);

        if (indexOfAluno != -1){
            alunos.remove(indexOfAluno);
            System.out.println("Aluno removido com sucesso!");
        }
        else {
            System.out.println("Aluno não encontrado!!");
        }
    }

    public void adicionaFuncionario(Funcionario newFuncionario){
        int indexOfFuncionario = encontraIndexFuncionario(newFuncionario.cpf);

        if (indexOfFuncionario == -1) {
            funcionarios.add(newFuncionario);
            System.out.println("Funcionário cadastrado com sucesso!");
        }
        else {
            System.out.println("Funcionário já existente!");;
        }
    }

    public void modificaFuncionario(String cpf, Funcionario funcionario){
        for (Funcionario f : funcionarios){
            if (cpf.equals(f.getCpf())){
                f = funcionario;
                System.out.println("Modificação realizada com sucesso!");
                return;
            }
        }
        System.out.println("Cpf não encontrado!");
    }

    public void removeFuncionario(String cpf){
        int indexOfFuncionario = encontraIndexFuncionario(cpf);

        if (indexOfFuncionario != -1){
            funcionarios.remove(indexOfFuncionario);
            System.out.println("Funcionário removido com sucesso!");
        }
        else {
            System.out.println("Funcionário não encontrado!!");
        }
    }

    public void adicionaProfessor(Professor newProfessor){
        int indexOfProfessor = encontraIndexProfessor(newProfessor.cpf);

        if (indexOfProfessor == -1 ){
            professores.add(newProfessor);
            System.out.println("Aluno cadastrado com sucesso!");
        }
        else{
            System.out.println("Aluno já cadastrado!");
        }
    }

    public void modificaProfessor(String cpf, Professor professor){
        for (Professor p : professores){
            if (cpf.equals(p.getCpf())){
                p = professor;
                System.out.println("Modificação realizada com sucesso!");
                return;
            }
        }
        System.out.println("Cpf não encontrado!");
    }

    public void removeProfessor(String cpf){
        int indexOfProfessor = encontraIndexProfessor(cpf);

        if (indexOfProfessor != -1){
            professores.remove(indexOfProfessor);
            System.out.println("Professor removido com sucesso!");
        }
        else {
            System.out.println("Professor não encontrado!!");
        }
    }

    public void listarAlunos(){
        for (Aluno a : alunos){
            a.imprimirAluno();
        }
    }

    public void listarAlunoEspecifico(String cpf){
        int indexOfAluno = encontraIndexAluno(cpf);

        if(indexOfAluno != -1){
            Aluno aluno = alunos.get(indexOfAluno);
            aluno.imprimirAluno();
        }
        else {
            System.out.println("Aluno não encontrado!");
        }
    }

    public void listarFuncionarios(){
        for (Funcionario f : funcionarios){
            f.imprimirFuncionario();
        }
    }

    public void listarFuncionarioEspecifico(String cpf){
        int indexOfFuncionario = encontraIndexFuncionario(cpf);

        if (indexOfFuncionario != -1){
            Funcionario funcionario = funcionarios.get(indexOfFuncionario);
            funcionario.imprimirFuncionario();
        }
        else {
            System.out.println("Funcionário não encontrdo!");
        }
    }

    public void listarProfessores(){
        for (Professor p : professores){
            p.imprimirProfessor();
        }
    }

    public void listarProfessorEspecifico(String cpf){
        int indexOfProfessor = encontraIndexProfessor(cpf);

        if (indexOfProfessor != -1){
            Professor professor = professores.get(indexOfProfessor);
            professor.imprimirProfessor();
        }
        else {
            System.out.println("Professor não encontrado!");
        }
    }

    public void imprimeMediaDoAluno(String cpf){
        int indexOfaluno = encontraIndexAluno(cpf);

        if (indexOfaluno != -1){
            Aluno aluno = alunos.get(indexOfaluno);
            float media = aluno.calculaMediaDasNotas();
            System.out.printf("Média das notas: %.2f", media);
        }
        else {
            System.out.println("Aluno não encontrado!");
        }
    }

    private int encontraIndexAluno(String cpf){
        for (Aluno a: alunos){
            if (a.getCpf().equals(cpf)){
                return funcionarios.indexOf(a);
            }
        }
        return -1;
    }

    private int encontraIndexFuncionario(String cpf){
        for (Funcionario f : funcionarios){
            if (f.getCpf().equals(cpf)){
                return funcionarios.indexOf(f);
            }
        }
        return -1;
    }

    private int encontraIndexProfessor(String cpf){
        for (Professor p : professores){
            if (p.getCpf().equals(cpf)){
                return funcionarios.indexOf(p);
            }
        }
        return -1;
    }

}
