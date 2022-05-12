package escola;

public class Disciplina {
    private String nome;
    private float nota;

    public Disciplina(String nome) {
        this.nome = nome;
        this.nota = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
