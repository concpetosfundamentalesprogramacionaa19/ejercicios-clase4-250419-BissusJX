/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float tarifa= 3;
        //float valorTarifa = 0;
        float TarifaApagar ;
        TarifaApagar = 0;
        float valorTarifa = (float) (tarifa * 0.12);
        float mensaje;
        System.out.printf("Ingrese el total de mensajes por mes");
        mensaje =  entrada.nextFloat();
        //valorTarifa = (float)( tarifa *0.12);
        if( mensaje >= 40){
            valorTarifa = (float)(tarifa *0.12);
            System.out.printf("El valor mensual de la tarifa es %.2f\n",
                    valorTarifa);
        }else{
            if(mensaje>40 && mensaje==200){
                float tarifaApagar = (float)(tarifa+valorTarifa+0.5);
            System.out.printf("El valor mensual de la tarifa cuando exeden "
                    + "los 40 mensajes %d\n",tarifaApagar);
            
            }else{
                    if(mensaje>200){
                        float tarifaApagar = (float) (tarifa+valorTarifa+ 0.10);
                        System.out.printf("El valor de la tarifa cuando "
                                + "exceden los 200 mensajes es: %d6\n",
                                tarifaApagar);
                        
                    }
            }
        }
    }
}
            
            
        
        
    
    

