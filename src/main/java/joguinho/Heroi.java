package joguinho;

public class Heroi extends Personagem {


    public Heroi(String name) {
        this.name = name;
        this.life = 100;
        this.isDead = false;
    }

    @Override
    protected void atacar(Personagem personagem, TipoAtaque tipoAtaque) {
            personagem.receberAtaque(20, tipoAtaque);

        if (personagem.checkIsDead()){
            this.interagir();
        }
    }

    @Override
    protected void receberAtaque(float dano, TipoAtaque tipoDano) {
        if (!this.checkIsDead()){
            this.life -= dano;
        }

    }

    @Override
    protected void interagir() {
        System.out.println("Nada pode me deter!");
    }
}
