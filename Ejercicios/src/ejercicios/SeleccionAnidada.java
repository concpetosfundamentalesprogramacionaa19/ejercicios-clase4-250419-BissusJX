/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import paquetedos.Operacion2;
import java.util.Scanner;
//import paquete2.Operacion;

/**
 *
 * @author Salas
 */
public class SeleccionAnidada {
    public static void main(String[] args) {
     
        String miMensaje3 = Operacion2.mensaje3;
        String miMensaje4 = Operacion2.mensaje4;
        int calificacion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la calificación: ");
        calificacion = entrada.nextInt();
        if (calificacion >= 90){
            
            System.out.printf("%s (excelente) %d\n ", miMensaje3, 
                    calificacion);
        }else{
            if(calificacion < 90 && calificacion >=80){
            System.out.printf("%s (muy buena)  %d\n ", miMensaje3, 
                    calificacion);
            }else{
                if (calificacion <80 && calificacion >=50){
                    System.out.printf("%s (regular)%d\n", miMensaje3,
                            calificacion);
                }else{
                    System.out.printf("%s %d\n", miMensaje4 
                            , calificacion);
                }
            }
        }
        
    }
}
