/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

import java.util.Scanner;

/**
 *
 * @author PC-09
 */
public class Arreglo {

        public int[] crearVector(int f){
        var retorno = new int[f];
        var lectura = new Scanner(System.in);
        for (int i = 0; i < f; i++) {
            System.out.println("Ingrese número en la posición: "+i);
            retorno[i]=lectura.nextInt();
        }   
        return retorno;
    }
    
    public int[][] crearMatriz(int f, int c){
        var retorno = new int[f][c];
        
        return retorno;
    }
    
    public int[] sumaVector(int[] v1, int[] v2){
        var retorno= new int[v1.length];
        
        return retorno;
    }
    
    public int[][] sumaMatriz = new int[matriz1.lenght][matriz1[0].length];
    for (j=0; j< matriz1.length ; j++); 
    {

            for (int i = 0; i < matriz1[j].length; i++) {
            int numeroMatriz1 = matriz1[j][i];
            int numeroMatriz2 = matriz2[j][i];
            int suma = numeroMatriz1 + numeroMatriz2;
            sumaMatriz[j][i] = suma;
        }
    }
    var retorno = new int[v1.length];

    return retorno ;
}
}
 
