import java.util.*;

//Clase heredada de Persona (extends)
public class Profesor extends Persona {
    
    private double salario;

    //Constructor
    public Profesor(String dni, String nombre, Date fechaNacimiento, Direccion direccion, double salario){
        //Atributos heredados de Persona mediante super
        super(dni, nombre, fechaNacimiento, direccion);
        this.salario = salario;
    }

    //Método abstracto heredado. Override soobreescribre el método de Persona con los datos de Profesor.
    @Override
    public int getEdad() {
        return 0;
    }

    //Métodos
    public void asignarCurso (Curso c){

    }

}
