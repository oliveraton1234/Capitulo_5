/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero entero");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero "+ numero + " es par.");
        }else {
            System.out.println("El numero "+ numero + " es impar.");
        }
    }
}
