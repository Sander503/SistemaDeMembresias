//
package com.modelo;

/**
 *Nombre de la clase: Marca
 *Fecha: 09/10/2020
 *CopyRigth:
 *Version:0.1
 * @author 
 */
public class Marca {
    
    private int idMarca;
    private String nombre;

    public Marca() {
    }

    public Marca(int idMarca, String nombre) {
        this.idMarca = idMarca;
        this.nombre = nombre;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
