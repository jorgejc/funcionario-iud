package com.iudigital.funcionario.domain;

import java.sql.Date;
import java.time.LocalDateTime;

public class Funcionario {
 
    private int funcionarioId;
    private String numeroDocumento;
    private String nombre;
    private String apellidos;
    private String sexo;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private String tipoDocumento;
    private String TipoDocuementoNombre;
    private String estadoCivilId;
    private String estadoCivilNombre;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocuementoNombre() {
        return TipoDocuementoNombre;
    }

    public void setTipoDocuementoNombre(String TipoDocuementoNombre) {
        this.TipoDocuementoNombre = TipoDocuementoNombre;
    }

    public String getEstadoCivilId() {
        return estadoCivilId;
    }

    public void setEstadoCivilId(String estadoCivilId) {
        this.estadoCivilId = estadoCivilId;
    }

    public String getEstadoCivilNombre() {
        return estadoCivilNombre;
    }

    public void setEstadoCivilNombre(String estadoCivilNombre) {
        this.estadoCivilNombre = estadoCivilNombre;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
