package org.example;

import org.example.paquete2.Animal;

public class Veterinarrio {
    public Integer id;
    public String nombre;
    public String cedula;

    public Veterinarrio(){
    }
    public Veterinarrio(Integer id, String nombre,String cedula){
        this.cedula=cedula;
        this.nombre=nombre;
        this.id=id;
    }
}
