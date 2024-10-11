package org.example;

public class Tarea {
    private String nombre;
    private String descripcion;
    private String fechaInicio; // Cambiado de LocalDate a String

    // Constructor vacío
    public Tarea() {}

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio; // Ahora se establece como String
    }
}