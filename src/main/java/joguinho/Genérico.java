package joguinho;

public class Genérico extends Personagem {

    public Genérico() {
        this.name = "Inimigo";
        this.life = 10;
        this.isDead = false;
    }

    @Override
    protected void atacar(Personagem personagem, TipoAtaque tipoAtaque) {
        personagem.receberAtaque(10, TipoAtaque.PANCADA);
        if (personagem.checkIsDead()){
            this.interagir();
        }
    }

    @Override
    protected void receberAtaque(float dano, TipoAtaque tipoDano) {
        float danoRecebido = dano;
            this.life -= danoRecebido;
    }

    @Override
    protected void interagir() {
        System.out.println("Por que eu responderia meu inimigo???");
    }
}
