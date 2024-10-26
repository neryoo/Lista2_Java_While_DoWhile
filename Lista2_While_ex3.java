/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2_while_ex3;

/**
 *
 * @author sabri
 */
import java.util.Scanner;

public class Lista2_While_ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 17;
        
        System.out.println("------------------JOGO DE ADIVINHAÇÃO--------------");
        
        int contador = 0;
        
        while(true) {
            System.out.print("Tente adivinhar o número entre 1 e 100: ");
            int numero = scanner.nextInt();
            contador++;
            
            if(numero > N) {
                System.out.println("Muito alto! Tente novamente.");
            } else if(numero < N) {
                    System.out.println("Muito baixo! Tente novamente.");
                } else if (numero == N){ 
                            System.out.println("Você acertou! O número era 17!");
                            System.out.println("Você realizou " + contador + " tentativas.");
                        }
                    }
    }
}
