/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

/**
 *
 * @author Admin
 */
public class CamaraDigital {
    private Integer precio;
    private String marca;
    private Integer resolucion;

    public CamaraDigital( String marca, Integer resolucion) {
        this.marca = marca;
        if (resolucion > 10){
            resolucion = 10;
        }
        this.resolucion = resolucion;
        setPrecio();
    }

    public void setPrecio(){
        if (this.resolucion <7){
            this.precio = 99;
        }else{
            this.precio = 129;
        }
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }
}
