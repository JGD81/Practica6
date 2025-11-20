import java.sql.Date;
import java.util.*;

public class Matricula {
    
    private Date fecha;
    private double notaFinal;
    //Relaciones de asociación. Guarda curso y estudiante
    private Curso curso;
    private Estudiante estudiante;

    //Constructor
    public Matricula(Date fecha, double notaFinal, Curso curso, Estudiante estudiante){
        this.fecha = fecha;
        this.notaFinal = notaFinal;
        this.curso = curso;
        this.estudiante = estudiante;   
    }

    //Métodos
    public double calcularNotaFinal(){
        return 0.0;
    }
}
