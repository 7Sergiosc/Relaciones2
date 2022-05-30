package relaciones2.entidades;

import java.util.ArrayList;
import java.util.List;


public class Juego {
    
    private List<Jugador> jugadores;
    private RevolverDeAgua revolver;
    
    // CONSTRUCTORES
    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    //GETTERS & SETTERS
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    

}
