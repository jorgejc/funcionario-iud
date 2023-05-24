package com.iudigital.funcionario.domain;

public class TipoDocumento {
    
    private int tipoDocumento;
    private String nombre;

    public TipoDocumento(int tipoDocumento, String nombre) {
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
    }
    
    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
