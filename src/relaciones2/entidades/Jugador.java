package relaciones2.entidades;

public class Jugador {
    private static Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(String nombre) {
        Jugador.id = 1;
        this.nombre = nombre;
        this.mojado = false;
        id++;
    }
    
    //GETTERS & SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    //METODOS
    
    public String infoJugador(){
        return (id + ") " + nombre);
    }
    //TOSTRING

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
}
