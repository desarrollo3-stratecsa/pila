/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import core.Base;

/**
 *
 * @author dacastro
 */
public class Caracter extends Base {

    private char caracter;

    public Caracter() {
    }

    public Caracter(char caracter) {
        this.caracter = caracter;
    }

    /**
     * Get the value of caracter
     *
     * @return the value of caracter
     */
    public char getCaracter() {
        return caracter;
    }

    /**
     * Set the value of caracter
     *
     * @param caracter new value of caracter
     */
    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    @Override
    public Base copy() {
        return new Caracter(caracter);
    }

    @Override
    public String toString() {
        return  caracter + "\n";
    }

}
