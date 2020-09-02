/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import core.Pila;
import datos.Caracter;
import datos.Producto;
import modelo.OperacionesPila;

/**
 *
 * @author dacastro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila<Producto> pilap=new Pila<>();
        pilap.apilar(new Producto("Arroz", 1500, 16));
        pilap.apilar(new Producto("Carne", 7500, 3));
        pilap.apilar(new Producto("Aceite", 12000, 9));
        pilap.apilar(new Producto("papa", 1000, 5));
        
        System.out.println("Pila Original \n" + pilap.toString());
        
        Pila<Producto> piladuplicada=OperacionesPila.duplicar(pilap);
        
        System.out.println("Pila duplicada \n" + piladuplicada.toString());
        
        Pila<Producto> pilainvertida=OperacionesPila.invertir(pilap);
        
         System.out.println("Pila Invertida \n" + pilainvertida.toString());
         
         
          Pila<Caracter> pilaC=new Pila<>();
          pilaC.apilar(new Caracter('A'));
          pilaC.apilar(new Caracter('B'));
          pilaC.apilar(new Caracter('C'));
          
           System.out.println("Pila Caracter \n" + pilaC.toString());
    }
    
}
