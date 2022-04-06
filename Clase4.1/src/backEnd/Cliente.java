package backEnd;

import java.util.Scanner;

abstract class Cliente {
    //atributos
    private String nombre, direccion;
    private int telefono;
    private Peliculas peliculas;

    public Cliente(String nombre, String direccion, int telefono, Peliculas peliculas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.peliculas = peliculas;
    }

    public Cliente() {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.peliculas = peliculas;
    }

    //metodos
    public abstract void alquilarPelicula(Peliculas peli, Scanner teclado);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Peliculas getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Peliculas peliculas) {
        this.peliculas = peliculas;
    }
}
