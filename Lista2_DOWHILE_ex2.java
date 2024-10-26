/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2_dowhile_ex2;

/**
 *
 * @author sabri
 */
import java.util.Scanner;
public class Lista2_DOWHILE_ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int temp;
        int F;
        
        System.out.println("------------CONVERSÃO DE TEMPERATURA Cº > Fº---------------");
        
        do{
            System.out.print("Informe a temperatura em Graus Celcius que deseja converter para Fahrenheit: ");
            temp = scanner.nextInt();
            System.out.println(temp + " Graus Celcius em Fahrenheit é:  ");
            F = (temp * 9 / 5) + 32;
            System.out.println(F + " Fº");
        } while(temp != 0);
        
        
    }
}
