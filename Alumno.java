
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    private int numClase;
    private int notas[];
    public static int APROBADO_MIN = 5;
    
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre , int edad)
    {
       this.nombre = nombre;
       this.edad = edad;    
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
    
   
}
