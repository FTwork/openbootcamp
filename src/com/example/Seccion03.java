/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author Usuario
 */
public class Seccion03 {

    public static void main(String[] args) {

        String[] nombresAmigos = {"Franco", "Tirry", "Gordo", "Negro", "Chino"};

        for (int i = 0; i < nombresAmigos.length; i++) {
            switch (i) {
                case 0:
                    System.out.println(nombresAmigos[0]);
                    break;
                case 1:
                    System.out.println(nombresAmigos[0] + " - " + nombresAmigos[1]);
                    break;
                case 2:
                    System.out.println(nombresAmigos[0] + " - " + nombresAmigos[1] + " - " + nombresAmigos[2]);
                    break;
                case 3:
                    System.out.println(nombresAmigos[0] + " - " + nombresAmigos[1] + " - " + nombresAmigos[2] + " - " + nombresAmigos[3]);
                    break;
                case 4:
                    System.out.println(nombresAmigos[0] + " - " + nombresAmigos[1] + " - " + nombresAmigos[2] + " - " + nombresAmigos[3] + " - " + nombresAmigos[4]);
                    break;
            }
        }

    }

}
