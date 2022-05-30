package relaciones2.servicios;

import java.util.Objects;
import relaciones2.entidades.RevolverDeAgua;




public class ServicioRevolverDeAgua {
    RevolverDeAgua revolver = new RevolverDeAgua();
    
    public RevolverDeAgua llenarRevolver(){
        
        RevolverDeAgua revolver = new RevolverDeAgua();
        
        revolver.setPosiciónAgua((int) (Math.random() * 6));
        
        return revolver;
    }
    
    public boolean mojar(RevolverDeAgua revolver){
        
        return (revolver.getPosiciónAgua()==revolver.getPosiciónAgua());
        
    }
    
    public void siguienteChorro(RevolverDeAgua revolver){
        if (revolver.getPosiciónActual()<6) {
            revolver.setPosiciónActual(revolver.getPosiciónActual()+1);
        }else{
            revolver.setPosiciónActual(1);
        }
        
    }
    
//    public void disparoRevolver(){
//        mojar(1,1);
//        siguienteChorro();
//    }
    
//    public Integer posiciónAgua(){
//        return revolver.getPosiciónAgua();
//    }
//    
//    public Integer posiciónActual(){
//        return revolver.getPosiciónActual();
//    }
}
