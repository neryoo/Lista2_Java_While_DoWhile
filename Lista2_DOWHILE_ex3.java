/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2_dowhile_ex3;

/**
 *
 * @author sabri
 */

import java.util.Scanner;

public class Lista2_DOWHILE_ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N;

        do {
            System.out.println("--------------SISTEMA DE CONTAGEM REGRESSIVA-----------");
            System.out.print("Informe um número: ");
            N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("Por favor, digite um número positivo.");
            } else {
                System.out.println("Contagem regressiva:");
                while (N >= 1) {
                    System.out.println(N);
                    N--;
                }
            }
        } while (N <= 0);
    }
}
