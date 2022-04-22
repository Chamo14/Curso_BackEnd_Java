package backEnd;

public class Pelota {
    //atributes
    private String nombre;
    private double peso;
    private int distancia,tiempo;
    private double velocidad;

    public Pelota(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.distancia=0;
        this.velocidad=0;
        this.tiempo=0;
    }

    public Pelota() {
        this.nombre = nombre;
        this.peso = peso;
        this.distancia=0;
        this.distancia=0;
        this.velocidad=0;
        this.tiempo=0;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "nombre='" + getNombre()+ '\'' +
                ", peso=" + getPeso() +
                '}';
    }

}
