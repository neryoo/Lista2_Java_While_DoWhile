/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2_dowhile_ex4;

/**
 *
 * @author sabri
 */

import java.util.Scanner;

public class Lista2_DOWHILE_ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N;
        int contador = 0 ;
        
        do {
            System.out.println("----------NÚMEROS ÍMPARES-----------");
            System.out.println("Insira números inteiros: [0] Para sair");
            N = scanner.nextInt();
            
            if(N % 2 != 0 && N !=0) {
                contador++;
        } 
        } while(N != 0);
            System.out.println("Você digitou " + contador + " números ímpares.");
            
        }
    }

