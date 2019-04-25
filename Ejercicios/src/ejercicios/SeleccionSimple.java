/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import paquetedos.Operacion;
import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class SeleccionSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int calificacion = 85;
        String miMensaje=Operacion.mensaje;
        int calificacion;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la calificación");
        calificacion = entrada.nextInt();
        if (calificacion>=85){
            //System.out.printf("Usted esta aprobado con %d\n", calificacion);
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }
        //int calificacion_2 = 45;
        int calificacion_2;
        System.out.println("Ingrese la segunda calificación");
        calificacion_2= entrada.nextInt();
        if (calificacion_2>= 85){
            System.out.printf("%s %d\n",miMensaje,calificacion_2);
            
        }
    }
    
}
