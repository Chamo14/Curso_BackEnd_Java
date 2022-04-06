package backEnd;

import java.util.Scanner;

public class Peliculas {
    private String nombre;
    private String genero;
    private boolean alquilada;
    private boolean vip;

    public Peliculas(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.alquilada=false;
    }
    public Peliculas() {
        this.nombre = nombre;
        this.genero = genero;
        this.alquilada=false;
    }

    public boolean isAlquilada() {
        return alquilada;
    }

    public void setAlquilada(boolean alquilada) {
        this.alquilada = alquilada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
//metodos

    public void mostrarPelicula(Peliculas peli){
        System.out.println("----------------");
        System.out.println("NOMBRE : "+peli.getNombre());
        System.out.println("GENERO : "+peli.getGenero());
        if(!peli.isAlquilada()){
        System.out.println("Alquilada? : NO");}
        else {
            System.out.println("Alquilada? : SI");
        }
        if(!peli.isVip()){
            System.out.println("VIP? : NO");}
        else {
            System.out.println("VIP? : SI");
        }
        System.out.println("----------------");
    }

    public void cargarPelicula(Peliculas peli, Scanner teclado)
    {
        System.out.println("Ingrese nombre de pelicula : ");
        setNombre(teclado.next());
        System.out.println("Ingrese el genero : ");
        setGenero(teclado.next());
        System.out.println("Es para VIP? Y/N");
        char r=teclado.next().charAt(0);
        if (r=='y'||r=='Y'){
            setVip(true);
        }
        else{setVip(false);}
    }
}
