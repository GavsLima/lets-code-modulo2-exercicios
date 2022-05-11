package aula02;

public class Produto {
    private String nome;
    private String sessao;
    private  String tipo;
    private int quantidade;
    private String marca;
    private int id;
    private static int contadorId = 0;

    public Produto() {
        this.id = ++contadorId;
    }

    public Produto(String nome, String sessao, String tipo, int quantidade, String marca) {
        this();
        this.nome = nome;
        this.sessao = sessao;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Produto.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produto:" +
                 nome + '\'' +
                ", id='" + id + '\'' +
                ", sessao='" + sessao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", quantidade=" + quantidade +
                ", marca='" + marca + '\'' +
                '}';
    }
}
