/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2_dowhile_ex1;

/**
 *
 * @author sabri
 */
 
import java.util.Scanner;

public class Lista2_DOWHILE_ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int resposta;
        
        do{
            System.out.println("--------MENU DE OPÇÕES--------");
            System.out.println("[1] Para adicionar;");
            System.out.println("[2] Para remover;");
            System.out.println("[3] Para sair;");
            
            System.out.println("Escolha uma opção: ");
            resposta = scanner.nextInt();
          }while(resposta != 3);  
        
        } 
}
