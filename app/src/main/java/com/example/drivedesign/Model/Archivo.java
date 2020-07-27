package com.example.drivedesign.Model;

public class Archivo {

    private String nombre;
    private String descripcion;
    private int icono;
    private int imagen;
    private int foto;

    public Archivo(String nombre, String descripcion, int icono, int imagen, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.icono = icono;
        this.imagen = imagen;
        this.foto = foto;
    }

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

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
