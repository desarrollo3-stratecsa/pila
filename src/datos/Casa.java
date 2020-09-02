/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author dacastro
 */
public class Casa {
    
    private String direccion;

    private String zona;
    private int numero_de_habitaciones;

    public Casa() {
    }

    public Casa(String direccion, String zona, int numero_de_habitaciones) {
        this.direccion = direccion;
        this.zona = zona;
        this.numero_de_habitaciones = numero_de_habitaciones;
    }

    /**
     * Get the value of numero_de_habitaciones
     *
     * @return the value of numero_de_habitaciones
     */
    public int getNumero_de_habitaciones() {
        return numero_de_habitaciones;
    }

    /**
     * Set the value of numero_de_habitaciones
     *
     * @param numero_de_habitaciones new value of numero_de_habitaciones
     */
    public void setNumero_de_habitaciones(int numero_de_habitaciones) {
        this.numero_de_habitaciones = numero_de_habitaciones;
    }


    /**
     * Get the value of zona
     *
     * @return the value of zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * Set the value of zona
     *
     * @param zona new value of zona
     */
    public void setZona(String zona) {
        this.zona = zona;
    }

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Casa{" + "direccion=" + direccion + ", zona=" + zona + ", numero_de_habitaciones=" + numero_de_habitaciones + '}';
    }

    

}
