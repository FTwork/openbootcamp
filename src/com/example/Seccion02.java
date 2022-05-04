/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author Usuario
 */
public class Seccion02 {

public static double precioIva (double precio){
double iva = 0.24;
return (precio + (precio*iva));
}

    public static void main(String [] args){

        System.out.println("El precio con el iva incluido es de $" + precioIva(100));

}

}
