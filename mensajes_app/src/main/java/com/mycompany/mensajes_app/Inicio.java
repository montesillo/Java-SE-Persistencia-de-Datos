/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Inicio {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.out.println("------------");
            System.out.println(" Aplicación de mensajes");
            System.out.println(" 1. Crear Mensaje");
            System.out.println(" 2. Listar Mesajes");
            System.out.println(" 3. Editar Mesajes");
            System.out.println(" 4. Eliminar Mensajes");
            System.out.println(" 5. Salir");
            //Leemos la opcion del usuario
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    mensajeService.crearMensaje();
                    break;
                case 2:
                    mensajeService.listarMensajes();
                    break;
                case 3:
                    mensajeService.borrarMensaje();
                    break;
                case 4:
                    mensajeService.editarMensaje();
                    break;
                default:
                    break;
            }
            
        }while(opcion != 5);
        

    }
}
