package relaciones2.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones2.entidades.Jugador;
import relaciones2.entidades.RevolverDeAgua;
import relaciones2.entidades.Juego;

public class ServicioJuego {
    
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private int cantJugadores;
    ArrayList<Jugador> listaJugadores;
    Juego j1 = new Juego();
    ServicioRevolverDeAgua r = new ServicioRevolverDeAgua();
    
    public void decidirNumeroDeJugadores(){
        System.out.print("Ingrese la cantidad de jugadores que van a jugar (Max 6)>");
        cantJugadores = input.nextInt();
        /* FALTA AGREGAR UN CONTROLADOR DE JUGADORES MAXIMO 6 MINIMO 1*/
    }
    
    public ArrayList<Jugador> llenarJugadores(){
        ServicioJugador servicioJugador = new ServicioJugador();
        listaJugadores = new ArrayList();

        for (int i = 0; i < cantJugadores; i++) {

            System.out.println("Ingrese los datos del jugador N°" + (i + 1));
            Jugador jugadorUsuario = servicioJugador.crearJugador();

            listaJugadores.add(jugadorUsuario);

        }

        return listaJugadores;
    }
    
    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        Juego juegoUsuario = new Juego();
        
        juegoUsuario.setJugadores(jugadores);
        juegoUsuario.setRevolver(revolver);
        
        return juegoUsuario;
    }

    public void ronda(Juego juego) {
        /*cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
        ServicioJugador servicioJugador = new ServicioJugador();
        boolean bandera = false;
        int cantidadRondas = 0;
        int numeroJugador = 0;

        while (bandera == false) {

            if (numeroJugador >= cantJugadores) {

                numeroJugador = 0;

            }

            cantidadRondas++;
            
            System.out.println(cantidadRondas + "° ronda");

            System.out.println("Jugador " + (numeroJugador + 1));

            bandera = servicioJugador.disparo(juego.getRevolver(), listaJugadores.get(numeroJugador));

            if (bandera == true) {

                System.out.println("¡BANG!");
                System.out.println(listaJugadores.get(numeroJugador).getNombre() + ", ¡Perdiste!");
                break;

            } else {

                System.out.println("...");
                System.out.println("No ha salido nada. ¡Safaste!");

            }

            numeroJugador++;

        }
    }
    
    public void jugar() {

        ServicioRevolverDeAgua servicioRevolver = new ServicioRevolverDeAgua();

        System.out.println("¡Comienza el juego!");
        System.out.println("");
        decidirNumeroDeJugadores();
        System.out.println("");
        llenarJugadores();
        System.out.println("");
        RevolverDeAgua revolver = servicioRevolver.llenarRevolver();
        Juego juego = llenarJuego(listaJugadores, revolver);
        System.out.println("");
        ronda(juego);
        System.out.println("");
        listaJugadores.clear();

    }
}
