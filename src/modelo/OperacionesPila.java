/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import core.Base;
import core.Pila;

/**
 *
 * @author dacastro
 */
public class OperacionesPila <T extends Base> {
    
    public static <T extends Base> Pila<T> duplicar(Pila<T> pilaoriginal){
        Pila<T> piladuplicada=new Pila<>();
        Pila<T> pilaAux=new Pila<>();
        
        while(!pilaoriginal.estaVacio()){
            pilaAux.apilar(pilaoriginal.desapilar());
        }
        while(!pilaAux.estaVacio()){
           T elemento= pilaAux.desapilar();
           T copiaElemento=(T)elemento.copy();
           
           pilaoriginal.apilar(elemento);
           piladuplicada.apilar(copiaElemento);
        }
        
        return piladuplicada;
    }
    
     public static <T extends Base> Pila<T> invertir(Pila<T> pilaoriginal){
         Pila<T> pilainvertida=new Pila<>();
         Pila<T> piladucplicada=duplicar(pilaoriginal);
         
         while (!piladucplicada.estaVacio()) {             
             pilainvertida.apilar(piladucplicada.desapilar());
         }
         
         return pilainvertida;
     }
    
    
}
