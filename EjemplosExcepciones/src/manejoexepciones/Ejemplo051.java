/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo051 {
    
    public static void main(String[] args) {
        int contador = 0;
        // bandera = false;
        
        // while (bandera){
        while (contador == 0){
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese valor 1:");
            int valor1 = entrada.nextInt(); // se espera un valor entero 
            System.out.println("Ingrese valor 2:");
            int valor2 = entrada.nextInt(); // se espera un valor entero // 0
            int resultado = valor1 / valor2;
        
            System.out.printf("Resultado %d\n", resultado);
            
            contador = contador + 1;
            // bandera = false;
        }
       
        catch (InputMismatchException a) {
            
            System.out.printf("Existe un error de tipo %s\n", 
                    a);
            contador = 0;
        }
        catch(ArithmeticException arithmeticException){
            
            System.out.println("Lo sentimos hay un error");
            System.out.printf("De tipo %s\n", arithmeticException);
            contador = 0;
        
        }
        }
    System.out.println("Continuamos");
    
               
    }
}
