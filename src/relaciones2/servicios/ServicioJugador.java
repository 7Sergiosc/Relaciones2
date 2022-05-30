package relaciones2.servicios;

import java.util.Scanner;
import relaciones2.entidades.Jugador;
import relaciones2.entidades.RevolverDeAgua;

public class ServicioJugador {
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    //CREAR UN JUGADOR
    public Jugador crearJugador(){
        System.out.println("Ingresa el nombre");
        String nombre = input.next();
        
        Jugador jugadorUsuario = new Jugador(nombre);
        
        jugadorUsuario.setNombre(nombre  + " (Jugador " + jugadorUsuario.getId() + ")");
        
        return jugadorUsuario;
    }
    
    public boolean disparo(RevolverDeAgua revolver, Jugador jugadorUsuario){
        ServicioRevolverDeAgua servicioRevolver = new ServicioRevolverDeAgua();

        jugadorUsuario.setMojado(servicioRevolver.mojar(revolver));

        if (jugadorUsuario.isMojado()== false) {

            servicioRevolver.siguienteChorro(revolver);
            return false;

        } else {

            return true;

        }
    }
}
