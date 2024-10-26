/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2_while_ex4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Lista2_While_ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int N = scanner.nextInt();
        
        int contador =  1;
        
        System.out.println("Os números pares de 1 a" + N + " é: ");
        
        while(contador <= N) {
            if(contador % 2 == 0) {
                System.out.println(contador);
            }
            contador ++;
        }
        
        
    }
}


/** . Números Pares: Crie um programa que exiba todos os números pares de 1 a N,
onde N é um número inteiro positivo fornecido pelo usuário.*/