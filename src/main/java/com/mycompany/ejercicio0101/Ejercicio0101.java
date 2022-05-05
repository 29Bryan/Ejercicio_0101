/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio0101;

/**
 *
 * @author PCG
 */
public class Ejercicio0101 {

    public static void main(String[] args) {
        //CLASE AUTO
        Auto sail=new Auto();
        sail.modelo="2015";
        sail.color="Plomo";
        sail.marca="Chevrolet";
        sail.kilometraje=15000;
        
        System.out.println("-----CLASE AUTO-----");
        System.out.println("Marca: "+sail.marca);
        System.out.println("Color: "+sail.color);
        System.out.println("Modelo: "+sail.modelo);
        System.out.println("Kilometraje: "+sail.kilometraje);
        
        sail.enciende();
        sail.acelera();
        sail.frena();
        
        //CLASE PERRO
        Gato esfinge=new Gato();
        esfinge.color="Cafe";
        esfinge.dueño="Bryan";
        esfinge.marca="Esfinge";
        esfinge.edad=1;
        
        System.out.println("-----CLASE PERRO-----");
        System.out.println("Marca: "+esfinge.marca);
        System.out.println("Color: "+esfinge.color);
        System.out.println("Su dueno se llama: "+esfinge.dueño);
        System.out.println("Edad del gato: "+esfinge.edad+" anio");
        
        esfinge.gatomini();
        esfinge.gatoalto();
        
        //CLASE ESCUELA
        Escuela prepa=new Escuela();
        prepa.ndirector="Ing.Eduardo Pinos";
        prepa.nestudiantes=400;
        prepa.nprofesores=80;
        prepa.ubicacion="Cuenca";
        
        System.out.println("-----CLASE CARRERA-----");
        System.out.println("Nombre del Director: "+prepa.ndirector);
        System.out.println("Numero de Estudiantes: "+prepa.nestudiantes);
        System.out.println("Numero de Profesores: "+prepa.nprofesores);
        System.out.println("Ubicacion: "+prepa.ubicacion);
        
        //CLASE TRANSPORTE
        Transporte bus=new Transporte();
        bus.marca="Hino";
        bus.ruta="Cuenca-Guayaquil";
        bus.modelo=2008;
        bus.nasientos=45;
        
        System.out.println("-----CLASE TRANSPORTE-----");
        System.out.println("Marca del bus: "+bus.marca);
        System.out.println("Ruta del bus: "+bus.ruta);
        System.out.println("Modelo del bus: "+bus.modelo);
        System.out.println("Asientos maximos: "+bus.nasientos);
        
        //CLASE TAMAÑO
        Tamaño estudiante=new Tamaño();
        estudiante.nombre="David";
        estudiante.apellido="Asitimbay";
        estudiante.edad=13;
        estudiante.altura=168;
        
        System.out.println("-----CLASE TAMANO-----");
        System.out.println("Nombre del estudiante: "+estudiante.nombre);
        System.out.println("Apellido del estudiante: "+estudiante.apellido);
        System.out.println("Edad del estudiante: "+estudiante.edad+" anios");
        System.out.println("Altura del estudiante: "+estudiante.altura+"cm");
    }
}
