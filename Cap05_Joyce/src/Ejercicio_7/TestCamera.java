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
public class TestCamera {

    public static void main(String[] args) {
        CamaraDigital sony = new CamaraDigital("Cannon", 20);
        System.out.println(sony.getMarca());
        System.out.println(sony.getPrecio());
        System.out.println(sony.getResolucion());
    }
    
}
