package relaciones2.entidades;

public class RevolverDeAgua {
    private Integer posiciónActual; // Posición actual del tambor aleatorio
    private Integer posiciónAgua; // Posición del agua aleatorio


    public RevolverDeAgua() {
    }
    
    public RevolverDeAgua(Integer posiciónActual, Integer posiciónAgua) {
        this.posiciónActual = posiciónActual;
        this.posiciónAgua = posiciónAgua;
    }
    
    
    //GETTERS & SETTERS
    
    public Integer getPosiciónActual() {
        return posiciónActual;
    }

    public Integer getPosiciónAgua() {
        return posiciónAgua;
    }

    public void setPosiciónActual(Integer posiciónActual) {
        this.posiciónActual = posiciónActual;
    }

    public void setPosiciónAgua(Integer posiciónAgua) {
        this.posiciónAgua = posiciónAgua;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posici\u00f3nActual=" + posiciónActual + ", posici\u00f3nAgua=" + posiciónAgua + '}';
    }
    
}
