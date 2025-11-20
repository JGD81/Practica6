import java.util.*;

public abstract class Persona {

private String dni;
private String nombre;
private Date fechaNacimiento;
//Relación de composición con Dirección. No añadimos lista, porque
//a una persona, se le supone una dirección
private Direccion direccion; 

//Constructor
public Persona(String dni, String nombre, Date fechaNacimiento, Direccion direccion){

    this.dni = dni;
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.direccion = direccion;

}

//Métodos
//Método abstracto, sin cuerpo. Va sin llaves y sin implementación
public abstract int getEdad(); 

}


