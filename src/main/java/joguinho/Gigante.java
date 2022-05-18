package joguinho;

public class Gigante extends Personagem {

    public Gigante() {
        this.name = "Gigante";
        this.life = 50;
        this.isDead = false;
    }

    @Override
    protected void atacar(Personagem personagem, TipoAtaque tipoAtaque) {
        personagem.receberAtaque(25, TipoAtaque.PANCADA);

        if (personagem.checkIsDead()){
            this.interagir();
        }
        else {
            System.out.println("Seu personagem está atordoado!");
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
        System.out.println("Me desculpe!");
    }
}
