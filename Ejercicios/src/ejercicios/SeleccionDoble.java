/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.Operacion;

/**
 *
 * @author Salas
 */
public class SeleccionDoble {
    
    public static void main(String[] args) {
     
        String miMensaje = Operacion.mensaje;
        String miMensaje2 = Operacion.mensaje2;
        int calificacion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la calificación: ");
        calificacion = entrada.nextInt();
        if (calificacion >= 85){
            //System.out.printf("Usted esta aprobado con %d\n", calificacion);
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }else{
            System.out.printf("%s %d\n", miMensaje2, calificacion);
        }
        //int calificacion_2 = 45;
        int calificacion_2;
        System.out.println("Ingrese la segunda calificación:  ");
        calificacion_2 = entrada.nextInt();
        if (calificacion_2 >= 85){
            System.out.printf("%s %d\n",miMensaje, calificacion_2);
        }else{
            System.out.printf("%s %d\n",miMensaje2, calificacion_2);   
            
        }
    }
}
