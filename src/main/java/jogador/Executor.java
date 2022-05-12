package jogador;

import java.time.LocalDate;

public class Executor {
    public static void main(String[] args) {
        Jogador j1 = new Jogador(1,10,  "Carlos", "Dentinho",
                LocalDate.of(1989,10,22), 10, "Atacante",
                0, false, 0);

        System.out.println(j1.toString());

        j1.aplicarCartaoVermelho();
        System.out.println(j1.suspenso);
        System.out.println(j1.toString());
        j1.cumprirSuspensao();
        System.out.println(j1.suspenso);
        System.out.println(j1.toString());
    }
}
