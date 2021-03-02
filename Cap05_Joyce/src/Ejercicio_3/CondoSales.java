/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CondoSales {
    Scanner sc = new Scanner(System.in);
    private Integer condominio;

    public CondoSales(){
        System.out.println("Introduce el numero de condominio 1-3");
        condominio = sc.nextInt();
    }

    public Integer getCondominio() {
        return condominio;
    }

    public void precio(){
        switch (this.condominio){
            case 1:
                System.out.println("Condominios con vista al parque $ 150,000");
            break;
            case 2:
                System.out.println("Condominios con vista al campo de golf $ 170,000");
            break;
            case 3:
                System.out.println("Condominios con vista al lago $ 210,000.");
            break;
            default:
                System.out.println("El precio es de 0");
            break;
        }
    }
}
