package backEnd;

import java.util.Scanner;

public class VehiculoCarga extends Vehiculo {
    //ATRIBUTOS
    private Remolque remolque;

    //CONSTRUCTOR

    public VehiculoCarga(String matricula) {
        super(matricula);
        this.remolque = null;
    }


    public VehiculoCarga(Remolque remolque) {
        this.remolque = remolque;
    }

    //GETTERS & SETTERS

    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    //METODOS
    public void ponerRemolque(VehiculoCarga vehiculoCarga, Scanner teclado){
        if(vehiculoCarga.getRemolque()==null){
            System.out.println("Ingrese peso del remolque");
            Remolque remolque = new Remolque(teclado.nextInt());
            setRemolque(remolque);
        }
    }
    public void quitarRemolque(VehiculoCarga vehiculoCarga){
        inicializarRemolque(vehiculoCarga);
    }
    public void inicializarRemolque(VehiculoCarga vehiculoCarga){
        vehiculoCarga.setRemolque(null);
    }

    @Override
    public void acelerar(double x) throws DemaciadoRapidoException{
        if (getRemolque()!=null && x>100){
            throw new DemaciadoRapidoException("Esta yendo a mas de 100km/h con carga! baje la velocidad");
        }
        super.acelerar(x);


    }

    @Override
    public String toString() {
        if (getRemolque()!=null){
            return super.toString()+"Tiene remolque :"+getRemolque().toString();
        }
        else
        {return super.toString();}
    }
}
