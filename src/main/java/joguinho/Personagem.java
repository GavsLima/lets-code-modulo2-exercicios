package joguinho;

public abstract class Personagem {
    protected String name;
    protected float life;
    protected boolean isDead;

    protected abstract void atacar(Personagem personagem, TipoAtaque tipoAtaque);

    protected abstract void receberAtaque(float dano, TipoAtaque tipoDano);

    protected abstract void interagir();

    protected boolean checkIsDead(){
        if (this.life > 0){
            this.isDead = false;
        }
        else {
            this.isDead = true;
            System.out.printf("%s está morto \n", this.name);
        }
        return this.isDead;
    };

    public float getLife() {
        return life;
    }

    public void setLife(float life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }
}
