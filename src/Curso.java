import java.util.*;

public class Curso {
    
    private String codigo;
    private String nombre;
    private int cupoMaximo;
    //Relación Asociación con Profesor
    //Curso guarda a profesor, porque es quién usa un profesor
    private Profesor profesor;
    //Relación agregación con Departamento
    //Un departamento agrupa cursos, pero Curso debe
    //saber a qué departamento pertenece
    private Departamento departamento;
    //Relación composición con Horario
    //El horario forma parte del curso y no existe sin él
    //El horario está dentro del curso.
    private List <Horario> horarios;

    //Constructor
    public Curso (String codigo, String nombre, int cupoMaximo, Profesor profesor, Departamento departamento){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        //Se usan aunque pertenezcan a otra clase, porque los atributos están en Curso
        this.profesor = profesor;
        this.departamento = departamento;
        this.horarios = new ArrayList<>();
    }

    //Métodos
    public Matricula inscribir(Estudiante e){
        return null;
    }
}
