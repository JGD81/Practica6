import java.util.*;

public class Estudiante extends Persona {
    
    private boolean repetidor;

    //Constructor
    public Estudiante (String dni, String nombre, Date fechaNacimiento, Direccion direccion, boolean repetidor){
        super(dni, nombre, fechaNacimiento, direccion);
        this.repetidor = repetidor;
    }

    //Método abstracto heredado. Override soobreescribre el método de Persona con los datos de Estudiante.
    @Override
    public int getEdad() {
        return 0;
    }

    //Métodos
    public void asignarCurso (Curso c){
        
    }


}




