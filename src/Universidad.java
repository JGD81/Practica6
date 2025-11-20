import java.util.*;

public class Universidad {
    
    private String nombre;
    //Relación composición. Añadimos lista, porque una universidad
    //puede tener varios departamentos.
    private List<Departamento> departamentos;

    //Constructor
    public Universidad (String nombre){
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }
}
