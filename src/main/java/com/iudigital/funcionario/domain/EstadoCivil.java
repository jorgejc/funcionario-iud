package com.iudigital.funcionario.domain;

public class EstadoCivil {

    private int estadoCivil;
    private String nombre;

    public EstadoCivil(int estadoCivil, String nombre) {
        this.estadoCivil = estadoCivil;
        this.nombre = nombre;
    }
    
    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
