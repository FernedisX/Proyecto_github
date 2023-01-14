/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author Pc
 */
public class TestWS {
    public static void main(String[] args) {
        WSOperaciones_Service ser = new WSOperaciones_Service() ;
        WSOperaciones cliente = ser.getWSOperacionesPort();
        
         if(cliente.login("EdissonQuinde", "lacow")){
            System.out.println("Datos Correctos");
        }else{
            System.out.println("Datos Incorrectos");
        }
         
         //segundo metodo
         System.out.println(cliente.procesarPago(4000, 1000));
    }
}
