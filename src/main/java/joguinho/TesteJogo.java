package joguinho;

public class TesteJogo {
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Gavs");
        Gigante gigante = new Gigante();

        heroi.atacar(gigante, TipoAtaque.PERFURANTE);
        heroi.atacar(gigante, TipoAtaque.PERFURANTE);


        System.out.printf("Vida do giante: %f \n", gigante.getLife());
    }
}
