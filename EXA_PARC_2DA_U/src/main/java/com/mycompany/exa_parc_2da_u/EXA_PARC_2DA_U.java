/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exa_parc_2da_u;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EXA_PARC_2DA_U {

    public static void main(String[] args) {
           String[] opciones = {"Piedra", "Papel", "Tijera"};
           Scanner cap = new Scanner(System.in);
        int victoriasJugador = 0;
        int victoriasComputadora = 0;
        int Empate = 0;
        while (true) {
            System.out.println("Piedra = 1, Papel = 2, Tijera = 3");
            System.out.println(" "); 
            System.out.println("Por favor, digite el numero de su opcion (0 para salir): ");
            int jugador = cap.nextInt();

            
            if (jugador == 0) {
                  
            System.out.println("Victorias del jugador: " + victoriasJugador);
            System.out.println(" ");    
            System.out.println("Victorias de la computadora: " + victoriasComputadora);
            System.out.println(" ");
            System.out.println("Empates:" + Empate);
            System.out.println(" ");
            System.out.println("Gracias por jugar!!!");
               
                break;
            }

    
            if (jugador < 1 || jugador > 3) {
                System.out.println("Opcion invalida, por favor elija un numero entre 1 y 3.");
                  System.out.println(" ");
                continue;
            }

           
            int computadora = (int) (Math.random() * 3) + 1; 

            System.out.println("Usted eligio: " + opciones[jugador - 1]);
            System.out.println(" ");
            System.out.println("La computadora eligio: " + opciones[computadora - 1]);
            System.out.println(" ");
           
            if (jugador == computadora) {
                System.out.println("Es un empate!");
                Empate++;
            } else if ((jugador == 1 && computadora == 3) || 
                       (jugador == 2 && computadora == 1) || 
                       (jugador == 3 && computadora == 2)) {
                
                System.out.println("Usted gano!!!");
                
                victoriasJugador++;
            } else {
                System.out.println("La computadora gano!");
                
                victoriasComputadora++;
            }

            
          
        }
    }
}

    
    