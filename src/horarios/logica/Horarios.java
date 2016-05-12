/*
Enunciado problema 20 del libro de tardos: 
 20. Suppose it’s nearing the end of the semester and you’re taking n courses, 
each with a final project that still has to be done. Each project will be graded on the following scale: 
It will be assigned an integer number on a scale of 1 to g > 1, higher numbers being better grades. 
Your goal, of course, is to maximize your average grade on the n projects.
You have a total of H > n hours in which to work on the n projects cumulatively, 
and you want to decide how to divide up this time. For simplicity, 
assume H is a positive integer, and you’ll spend an integer number of hours on each project. 
To figure out how best to divide up your time, you’ve come up with a set of functions{fi :i=1, 2, . . . ,n}(rough estimates, of course) 
for each of your n courses; if you spend h≤H hours on the project for course i, you’ll get a grade of fi(h). 
(You may assume that the functions fi are nondecreasing: ifh < h, then fi(h)≤fi(h).)

So the problem is: Given these functions{fi}, decide how many hours
to spend on each project (in integer values only) so that your average grade, as computed according to the fi, 
is as large as possible. In order to be efficient, the running time of your algorithm should be polynomial in n, g, and H;
none of these quantities should appear as an exponent in your running time.
 */
package horarios.logica;

/**
 *
 * @author Julian Devia y Daniela Sepulveda 
 */
public class Horarios {
    
    //Entrada del problema: 
    //Numero de proyectos
    private int n;
    //Numero de horas con las que se cuenta para todos los proyectos.
    private int H;
    // n funciones para calcular la nota de cada uno de los proyectos. 
    private Funcion[] f;
   
    //Datos de solución
    //Notas de cada proyecto invirtiendo 0<h<=H horas
    private int[][] notas;
    //rastro para hallar el numero de horas invertidas en cada proyecto
    private Posicion[][] rastro;
    //
    private int[] horasPorProyecto;
    
    private double[][] promedios;
    
    
    
    
    /**
     * Crea un horario para invertir en los proyectos y maximizar el promedio de las notas
     * 
     * @param n
     * @param H
     * @param coeficientes
     * @param exponentes
     */
    public Horarios(int n, int H, int[][] coeficientes, int[][] exponentes){
        this.H=H;
        this.n=n;
        f=new Funcion[n];
        for (int i = 0; i < coeficientes.length; i++) {
            f[i]=new Funcion(coeficientes[i], exponentes[i]);
        }
    }
    
    public void calcularNotas(){
        notas=new 
    }
    
}
