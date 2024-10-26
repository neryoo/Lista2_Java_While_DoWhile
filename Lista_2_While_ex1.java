/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_2_while_ex1;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class Lista_2_While_ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        
        while(true) {
            System.out.print("Insira um número inteiro: ");
            int N = scanner.nextInt();
            if (N >= 0) {
                contador++;
                contador = N + N;
            } else {
                break;
            }
            
        }
        System.out.println("Você inseriu um número negativo, fim  do programa!!");
        System.out.println("A soma dos números positivos digitados é de: " + contador);
    }
}





/**. Escreva um programa que peça ao usuário para inserir números inteiros até que ele
insira um número negativo. O programa deve somar todos os números positivos e
exibir a soma final. */
