package backEnd;



public class Main {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Ani");
        Jugador jugador2 = new Jugador("Seba");
        Pelota pelota1= new Pelota("Tenis",0.5);
        Pelota pelota2= new Pelota("Futbol",1.2);
        jugador1.agregarPelota(pelota1,jugador1);
        jugador2.agregarPelota(pelota2,jugador2);

            jugador1.lanzarPelota(jugador1);
            jugador2.lanzarPelota(jugador2);
            sumarPuntaje(jugador1, jugador2);
            System.out.println(jugador1.toString());
            System.out.println(jugador2.toString());
            jugador1.lanzarPelota(jugador1);
            jugador2.lanzarPelota(jugador1);
            sumarPuntaje(jugador1, jugador2);
            System.out.println(jugador1.toString());
            System.out.println(jugador2.toString());
            jugador1.lanzarPelota(jugador1);
            jugador2.lanzarPelota(jugador1);
            sumarPuntaje(jugador1, jugador2);
            System.out.println(jugador1.toString());
             System.out.println(jugador2.toString());

            if (jugador1.getPuntaje() > jugador2.getPuntaje()) {
                System.out.println("El jugador 1 es el ganador");
            } else if (jugador1.getPuntaje() < jugador2.getPuntaje()){
                System.out.println("El jugador 2 es el ganador");
            }
            else{System.out.println("ES UN EMPATE");}

    }


    public static void sumarPuntaje(Jugador j1, Jugador j2){
        var d1=j1.getPelota().getDistancia();
        var d2=j2.getPelota().getDistancia();
        if (d1>d2)
        {
            j1.setPuntaje(j1.getPuntaje()+1);
        }
        else if(d1<d2)
        {
            j2.setPuntaje(j2.getPuntaje()+1);

        }
    }

    public static void calcularVelocidad(Jugador j){
        var velocidad=0.0;
        velocidad=j.getPelota().getDistancia()/j.getPelota().getTiempo();
        j.getPelota().setVelocidad(velocidad);
    }
    /*public static void convertirAKM(Jugador j){
        var metros= j.getPelota().getDistancia();
        var segundos=j.getPelota().getTiempo();
        var km=metros/1000;
        var horas=segundos/3600;
        var velocidad=km/horas;
        j.getPelota().setVelocidad(velocidad);
    }*/
}
