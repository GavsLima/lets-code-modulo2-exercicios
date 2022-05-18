package joguinho;

public class Cobra extends Personagem {

    public Cobra() {
        this.name = "Cobra";
        this.life = 30;
        this.isDead = false;
    }

    @Override
    protected void atacar(Personagem personagem, TipoAtaque tipoAtaque) {
        personagem.receberAtaque(10, TipoAtaque.PERFURANTE);

        if (personagem.checkIsDead()){
            this.interagir();
        }
        else {
            System.out.println("Seu personagem está envenenado!");
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
        System.out.println("Se você acender a chama a maldição acaba.");
    }
}
