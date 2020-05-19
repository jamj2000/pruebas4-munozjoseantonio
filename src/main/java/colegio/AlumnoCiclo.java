package colegio;

import java.util.Date;
/**
 * Clase para Alumnos de Ciclo de FP
 * @author: José Antonio Muñoz Jiménez
 * @version: 1.0
 */
public final class AlumnoCiclo extends Alumno {

    /**
     * Constructor sin parámetros para alumno/a de ciclo de FP
     */
    public AlumnoCiclo() {
        super();
    }

    /**
     * Constructor con 2 parámetros para alumno/a de ciclo de FP
     * @param nombre Nombre del alumno/a
     * @param apellidos Apellidos del alumno/a
     */
    public AlumnoCiclo(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    /**
     * Constructor con 4 parámetros para alumno/a de ciclo de FP
     * @param nombre Nombre del alumno/a
     * @param apellidos Apellidos del alumno/a
     * @param nacimiento Fecha de nacimiento
     * @param notas Array con notas de cada trimestre
     */
    public AlumnoCiclo(String nombre, String apellidos, Date nacimiento, int[] notas) {
        super(nombre, apellidos, nacimiento, notas);
    }
      
    /**
     * Método para matricular un alumno/a en un curso
     * @param curso Curso en el cual matricular
     */
    @Override
    public void matricular(Curso curso) {
        if ( curso == Curso.SMR1 || curso == Curso.SMR2 || curso == Curso.ASIR1 || curso == Curso.ASIR2)
            this.curso = curso;
    }

    /**
     * Método para matricular un alumno/a en un curso
     */
    @Override
    public void desmatricular() {
        if (curso != null)
            this.curso = null;
    }

  
}