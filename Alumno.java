
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    //nombre
    private String nombre;
    //edad
    private int edad;
    //numclase
    private int numClase;
    //notasAlumno
    private int notas[];
    //nota minima de aprobado 
    public static int APROBADO_MIN = 5;
    
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre , int edad ,int numClase)
    {
       this.nombre = nombre;
       this.edad = edad;
       this.numClase= numClase;
       notas = new int[0];
    }

    /**
     * metodo para añadir una nota 
     * 
     */
    public void  añadirNota(int nota)
    {
        int cant[] = new int[notas.length + 1];
        int a;
        for(a = 0; a < notas.length; a++) {
            cant[a] = notas[a];
        }
        cant[a] = nota;
        notas = cant;
    }
    
     /**
     * true si esta aprobado
     * sino false.
     */
    public boolean estado()
    {
        return (mediaAlumno() >=  APROBADO_MIN);
    }
    
     /**
     * media de notas del alumno.
     */
    public int mediaAlumno() 
    {
        int mediaAlumno = 0;
        int cont;
        if (notas.length != 0) {
            for (cont = 0; cont < notas.length; cont++) {
                mediaAlumno  += notas[cont];
            }
            mediaAlumno  = (mediaAlumno / cont);
        }  
        else{
            System.out.println("error notas no introducidas");
            mediaAlumno = -1;
        }
        return mediaAlumno;
    }
    
     /**
     * Muestra  los datos de los alumnos.
     */
    public void mostrarDatos() 
    {
       System.out.println("Alumno: " + nombre + "\n Edad: " + edad + "\n Número de clase: " + numClase + "\n Nota media: " + mediaAlumno()  + "\n ");
    }
}
   

