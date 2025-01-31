package aprendizado.EstruturaDeDados.AulaED2703array.src;

import java.util.Random;

public class AppEx6 {

    public static void criarCartas(MyArray baralho) throws Exception {
        Naipe ouro = new Naipe("Ouro");
        Naipe espadas = new Naipe("Espadas");
        Naipe copas = new Naipe("Copas");
        Naipe paus = new Naipe("Paus");

        Naipe naipes[] = new Naipe[]{ouro, espadas, copas, paus};

        String simbolos[] = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (Naipe n : naipes) {
            for (int i = 0; i < simbolos.length; i++) {
                Carta c = new Carta(simbolos[i], i + 1, n);
                baralho.add(c);
            }
        }
    }

    public static int somar(MyArray baralho) throws Exception {

        return 0;
    }

    public static void main(String[] args) throws Exception {

        Random gerador = new Random();

        MyArray baralho = new MyArray(52);
        AppEx6.criarCartas(baralho);

        MyArray cartasViradas = new MyArray(5);
        for (int i = 0; i < 5; i++) {
            int x = gerador.nextInt(0, baralho.size());
            Carta c = (Carta) baralho.get(x);
            cartasViradas.add(c);
            baralho.remove(c);
            System.out.println(AppEx6.somar(cartasViradas));
        }
        System.out.println(baralho);
        System.out.println(cartasViradas);

    }

}
