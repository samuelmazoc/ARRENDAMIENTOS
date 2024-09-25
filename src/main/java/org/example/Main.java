package org.example;

import org.example.MODELOS.APARTAMENTO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************");
        System.out.println("APARTAMENTO");
        System.out.println("**********************");

        Scanner lea = new Scanner(System.in);
        APARTAMENTO AP = new APARTAMENTO();

        System.out.print("digite el barrio: ");
        AP.setBarrio(lea.nextLine());

        System.out.print("digite la ciudad: ");
        AP.setCiudad(lea.nextLine());

        System.out.print("digite la direccion: ");
        AP.setDireccion(lea.nextLine());

        System.out.print("digite que servicios tiene la propedad: ");
        AP.setServicios(lea.nextLine());

        System.out.print("digite cantidad de parqueaderos: ");
        AP.setParqueadero(lea.nextLine());

        System.out.print("digite el area del apartamento: ");
        AP.setArea(lea.nextInt());

        System.out.print("digite el piso: ");
        AP.setPiso(lea.nextInt());

        System.out.println(AP);


    }
}