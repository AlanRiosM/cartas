import java.util.Random;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String []  palos = {"♥", "♦", "♣", "♠"};
        int [] numerico = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        String [] especiales = {"A", "J", "Q", "K"};
        Map<String, Integer> valoresCartas = new HashMap<>();
        valoresCartas.put("A", 1);
        valoresCartas.put("J", 11);
        valoresCartas.put("Q", 12);
        valoresCartas.put("K", 13);
        int numeroMesa = 0;
        int numeroJugador = 0;
        Random random = new Random();
        int opcion = random.nextInt(2);
        if (opcion == 0){
            CartaNumerica cartaMesa = new CartaNumerica(palos[random.nextInt(4)], numerico[random.nextInt(8)]);
            cartaMesa.mostrarDescripcion();
            numeroMesa= cartaMesa.getNumero();

        } else {
            CartaEspecial cartaMesa = new CartaEspecial(palos[random.nextInt(4)], especiales[random.nextInt(4)]);
            cartaMesa.mostrarDescripcion();
            String especialMesa= cartaMesa.getEspecial();
            numeroMesa = valoresCartas.get(especialMesa);
        }
        int opcion2 = random.nextInt(2);
        if (opcion2 == 0){
            CartaNumerica cartaJugador = new CartaNumerica(palos[random.nextInt(4)], numerico[random.nextInt(8)]);
            cartaJugador.mostrarDescripcion();
            numeroJugador= cartaJugador.getNumero();
        } else {
            CartaEspecial cartaJugador = new CartaEspecial(palos[random.nextInt(4)], especiales[random.nextInt(4)]);
            cartaJugador.mostrarDescripcion();
            String especialJugador= cartaJugador.getEspecial();
            numeroJugador = valoresCartas.get(especialJugador);
        }
        if(numeroJugador > numeroMesa){
            System.out.println("Usted gana");
        } else if (numeroJugador < numeroMesa) {
            System.out.println("Usted perdio");
        } else {
            System.out.println("Empate");
        }
    }
}