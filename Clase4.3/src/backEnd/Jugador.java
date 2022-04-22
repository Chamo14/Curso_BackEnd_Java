package backEnd;

public class Jugador {
    private String nombre;
    private int puntaje;
    private Pelota pelota;

    public Jugador(String nombre) {
        this.nombre = nombre;
       this.puntaje=0;
        this.pelota=null;
    }
    public Jugador() {
        this.nombre = nombre;
        this.puntaje=0;
        this.pelota=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Pelota getPelota() {
        return pelota;
    }

    public void setPelota(Pelota pelota) {
        this.pelota = pelota;
    }

    public void lanzarPelota(Jugador j){
        int distancia=(int) (Math.random()*100+1);
       j.getPelota().setDistancia(distancia);
       int t=(int)(Math.random()*10+1);
       j.getPelota().setTiempo(t);
    }
    public void agregarPelota(Pelota pelota, Jugador j){
       j.setPelota(pelota);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre : '" + getNombre() + '\'' +
                ", puntaje :" + getPuntaje() +
                '}'+"/////"+"DISTANCIA RECORRIDA EN METROS : "+getPelota().getDistancia();
    }
}
