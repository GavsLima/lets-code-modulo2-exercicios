package joguinho;

public class Vampiro extends Personagem {

    public Vampiro() {
        this.name = "Vampiro";
        this.life = 80;
        this.isDead = false;
    }

    @Override
    protected void atacar(Personagem personagem, TipoAtaque tipoAtaque) {
        personagem.receberAtaque(20, TipoAtaque.FOGO);

        if (personagem.checkIsDead()){
            this.interagir();
        }
        else {
            System.out.println("Seu personagem está sangrando!");
        }
    }

    @Override
    protected void receberAtaque(float dano, TipoAtaque tipoDano) {
        float danoRecebido = dano;
        if (!this.checkIsDead()){
            if (tipoDano.equals(TipoAtaque.PERFURANTE)){
                danoRecebido *= 2;
            }
            this.life -= danoRecebido;
        }

    }

    @Override
    protected void interagir() {
        System.out.println("O que é um homem?");
    }
}
