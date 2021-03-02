/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;
import java.util.Scanner;
        
        
/**
 *
 * @author Admin
 */
public class Salary {
        
    Scanner sc = new Scanner(System.in);
    private final Double nivel1 = 17.0;
    private final Double nivel2 = 20.0;
    private final Double nivel3 = 22.0;
    private final Double sMedico = 32.50;
    private final Double sDientes = 20.0;
    private final Double incapacidad = 10.0;

    private Integer nivel;
    private Integer horas;
    private Integer horasExtras;
    private Double salario;
    private Double seguro;
    private Double jubilacion;




    public Salary(Integer nivel, Integer horas) {
        this.nivel = nivel;
        this.horas = horas;
        if(horas>40){
            this.horasExtras = horas-40;}
        else{
            this.horasExtras = 0;
        }
        this.salario();
        this.jubilacion = 0.0;
    }

    public void jubilacion(){
        if(this.nivel == 3){
            System.out.println("Deseas agregar jubilacion plan [1]si   [0]no");
            int n = sc.nextInt();
            if(n == 1){
                this.jubilacion = this.salario*0.03;
            }
        }else{
            System.out.println("No tienes nivel para elegir jubilacion");
        }
    }

    public void seguro() {
        if (this.nivel > 1) {
            System.out.println("Que seguro quieres:\n 1 Medical insurance 32.50\n"
                    + "2 Dental insurance 20.00\n"
                    + "3 Long-term disability insurance 10.00");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    this.seguro = sMedico;
                    break;
                case 2:
                    this.seguro = sDientes;
                    break;
                case 3:
                    this.seguro = incapacidad;
                    break;
                default:
                    this.seguro = 0.0;
                    break;
            }
        } else {
            System.out.println("No tienes el nivel para elegir seguro");
            this.seguro = 0.0;
        }

        private void salario() {
            switch (this.nivel) {
                case 1:
                    this.salario = (this.nivel1 * this.horas) + (this.nivel1 * 1.5 * this.horasExtras);
                    break;
                case 2:
                    this.salario = (this.nivel2 * this.horas) + (this.nivel2 * 1.5 * this.horasExtras);
                    break;
                case 3:
                    this.salario = (this.nivel3 * this.horas) + (this.nivel3 * 1.5 * this.horasExtras);
                    break;
                default:
                    this.seguro = 0.0;
                    break;
            }
        }
    }

 

