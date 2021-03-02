/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Temperatures {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura maxima");
        int max = sc.nextInt();
        System.out.println("Temperatura minima");
        int min = sc.nextInt();

        if (max > 90){
            System.out.println("Advertencia de calor");
        }if (min < 32){
            System.out.println("Advertenia de congelacion");
        }

        if ((max-min) > 40){
            System.out.println("Gran oscilacion de temperatura");
        }
    }
}
