import java.util.*;

public class Departamento {
    
    private String nombre;
    //Atributo por agregación, un departamento tiene varios cursos
    private List<Curso> cursos;

    //Constructor
    public Departamento(String nombre){
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }


}
