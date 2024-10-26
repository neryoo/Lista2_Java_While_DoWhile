/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_2_while_ex2;

/**
 *
 * @author Admin
 */
import  java.util.Scanner;
public class Lista_2_While_ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.println("-------------TABUADA----------");
        
        System.out.println("Informe um número: ");
        int N = scanner.nextInt();
        System.out.println("A tabuada do número " + N + " é: ");
        
        while(contador <= 10) {
            int mult = N * contador;
            System.out.println(N + " X " + contador + " = " + mult);
            contador++;
            
        }
        
    }
}


/** Faça um programa que peça ao usuário um número e exiba a tabuada desse
número de 1 a 10 usando um laço while.
*/