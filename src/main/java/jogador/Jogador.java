package jogador;

import java.time.LocalDate;
import java.util.Random;

public class Jogador {
    int id;
    String nome;
    String apelido;
    LocalDate dataNasc;
    int numero;
    String posicao;
    int cartoesAmarelos;
    boolean cartaoVermelho;
    boolean suspenso;
    private double qualidade;
    private int treinamentosAntesDaPartida = 0;

    Jogador(){

    }

    public Jogador(int id,
                   double qualidade,
                   String nome,
                   String apelido,
                   LocalDate dataNasc,
                   int numero, String posicao,
                   int cartoesAmarelos,
                   boolean cartaoVermelho,
                   int treinamentosAntesDaPartida) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNasc = dataNasc;
        this.numero = numero;
        this.posicao = posicao;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
        this.qualidade = qualidade;
        this.treinamentosAntesDaPartida = treinamentosAntesDaPartida;

        this.suspenso = !verificarCondicaoDeJogo();
    };

     public boolean verificarCondicaoDeJogo(){
        if( (cartoesAmarelos < 3) && (cartaoVermelho == false) ){
            this.suspenso = false;
            return true;
        }
        else{
            this.suspenso = true;
            return false;
        }
    };

    public void aplicarCartaoAmarelo(int quantidadeCartoes){
        cartoesAmarelos += quantidadeCartoes;
        verificarCondicaoDeJogo();
    };

    public void aplicarCartaoVermelho(){
        cartaoVermelho = true;
        verificarCondicaoDeJogo();
    };

    public void cumprirSuspensao(){
        cartoesAmarelos = 0;
        cartaoVermelho = false;
        verificarCondicaoDeJogo();
    };

    public void sofrerLesao (){
        Random random = new Random();
        int gravidadeLesao = (random.nextInt(100));
        if (gravidadeLesao <= 5){
            this.qualidade -= this.qualidade * 0.15;
        } else if(gravidadeLesao <= 10){
            this.qualidade -= this.qualidade * 0.10;
        } else if (gravidadeLesao <= 15){
            this.qualidade -= this.qualidade * 0.05;
        } else if (gravidadeLesao <= 30){
            this.qualidade -= 2;
        } else if (gravidadeLesao <= 40){
            this.qualidade -= 1;
        }

        this.qualidade = (this.qualidade <= 0 ? 0 : this.qualidade);
    }

    public void executarTreinamento(){
        if(treinamentosAntesDaPartida < 1){
            Random random = new Random();
            var qualidadeAumentada = random.nextInt(3);
            if(this.qualidade + qualidadeAumentada >= 10){
                this.qualidade = 10;
            }
            else{
                this.qualidade += qualidadeAumentada;
            }

        }
    }
    @Override
    public String toString() {
        var condicao = ( suspenso ) ? "Não pode jogar" : "Pode jogar";

        return posicao + ": " + numero + " - " + nome + " (" + apelido + ") - "
                + dataNasc + "Condição: " + condicao;
    };
}
