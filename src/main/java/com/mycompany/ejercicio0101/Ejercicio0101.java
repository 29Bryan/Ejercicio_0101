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
        
        System.out.println("-----CLASE AUTO 1-----");
        System.out.println("Marca: "+sail.marca);
        System.out.println("Color: "+sail.color);
        System.out.println("Modelo: "+sail.modelo);
        System.out.println("Kilometraje: "+sail.kilometraje);
        
        sail.enciende();
        sail.acelera();
        sail.frena();
        
        Auto sail2=new Auto();
        sail2.modelo="2018";
        sail2.color="Blanco";
        sail2.marca="Mazda";
        sail2.kilometraje=20000;
        
        System.out.println("-----CLASE AUTO 2-----");
        System.out.println("Marca: "+sail2.marca);
        System.out.println("Color: "+sail2.color);
        System.out.println("Modelo: "+sail2.modelo);
        System.out.println("Kilometraje: "+sail2.kilometraje);
        
        sail2.enciende();
        sail2.acelera();
        sail2.frena();
       
        //CLASE GATO
        Gato esfinge=new Gato();
        esfinge.color="Cafe";
        esfinge.dueño="Bryan";
        esfinge.marca="Esfinge";
        esfinge.edad=2;
        
        System.out.println("-----CLASE GATO 1-----");
        System.out.println("Marca: "+esfinge.marca);
        System.out.println("Color: "+esfinge.color);
        System.out.println("Su dueno se llama: "+esfinge.dueño);
        System.out.println("Edad del gato: "+esfinge.edad+" anio");
        
        esfinge.gatomini();
        esfinge.gatoalto();
        
        Gato persa=new Gato();
        persa.color="Cafe Claro";
        persa.dueño="Anabel";
        persa.marca="Persa";
        persa.edad=1;
        
        System.out.println("-----CLASE GATO 2-----");
        System.out.println("Marca: "+persa.marca);
        System.out.println("Color: "+persa.color);
        System.out.println("Su dueno se llama: "+persa.dueño);
        System.out.println("Edad del gato: "+persa.edad+" anio");
        
        persa.gatomini();
        persa.gatoalto();
        
        //CLASE ESCUELA
        Escuela prepa=new Escuela();
        prepa.ndirector="Ing.Eduardo Pinos";
        prepa.nestudiantes=400;
        prepa.nprofesores=80;
        prepa.ubicacion="Cuenca";
        
        System.out.println("-----CLASE ESCUELA 1-----");
        System.out.println("Nombre del Director: "+prepa.ndirector);
        System.out.println("Numero de Estudiantes: "+prepa.nestudiantes);
        System.out.println("Numero de Profesores: "+prepa.nprofesores);
        System.out.println("Ubicacion: "+prepa.ubicacion);
        
        Escuela prepa2=new Escuela();
        prepa2.ndirector="Ing.Eduardo Pinos";
        prepa2.nestudiantes=350;
        prepa2.nprofesores=65;
        prepa2.ubicacion="Cuenca";
        
        System.out.println("-----CLASE ESCUELA 2-----");
        System.out.println("Nombre del Director: "+prepa2.ndirector);
        System.out.println("Numero de Estudiantes: "+prepa2.nestudiantes);
        System.out.println("Numero de Profesores: "+prepa2.nprofesores);
        System.out.println("Ubicacion: "+prepa2.ubicacion);
        
        //CLASE TRANSPORTE
        Transporte bus=new Transporte();
        bus.marca="Hino";
        bus.ruta="Cuenca-Guayaquil";
        bus.modelo=2008;
        bus.nasientos=45;
        
        System.out.println("-----CLASE TRANSPORTE 1-----");
        System.out.println("Marca del bus: "+bus.marca);
        System.out.println("Ruta del bus: "+bus.ruta);
        System.out.println("Modelo del bus: "+bus.modelo);
        System.out.println("Asientos maximos: "+bus.nasientos);
        
        Transporte bus2=new Transporte();
        bus2.marca="Mercedes-Benz";
        bus2.ruta="Cuenca-Quito";
        bus2.modelo=2010;
        bus2.nasientos=50;
        
        System.out.println("-----CLASE TRANSPORTE 2-----");
        System.out.println("Marca del bus: "+bus2.marca);
        System.out.println("Ruta del bus: "+bus2.ruta);
        System.out.println("Modelo del bus: "+bus2.modelo);
        System.out.println("Asientos maximos: "+bus2.nasientos);
        
        //CLASE TAMAÑO
        Tamaño estudiante=new Tamaño();
        estudiante.nombre="David";
        estudiante.apellido="Asitimbay";
        estudiante.edad=13;
        estudiante.altura=168;
        
        System.out.println("-----CLASE TAMANO 1-----");
        System.out.println("Nombre del estudiante: "+estudiante.nombre);
        System.out.println("Apellido del estudiante: "+estudiante.apellido);
        System.out.println("Edad del estudiante: "+estudiante.edad+" anios");
        System.out.println("Altura del estudiante: "+estudiante.altura+"cm");
        
        Tamaño estudiante2=new Tamaño();
        estudiante2.nombre="Pedro";
        estudiante2.apellido="Ortiz";
        estudiante2.edad=13;
        estudiante2.altura=168;
        
        System.out.println("-----CLASE TAMANO 2-----");
        System.out.println("Nombre del estudiante: "+estudiante2.nombre);
        System.out.println("Apellido del estudiante: "+estudiante2.apellido);
        System.out.println("Edad del estudiante: "+estudiante2.edad+" anios");
        System.out.println("Altura del estudiante: "+estudiante2.altura+"cm");
    }
}
