package backEnd;

public class VehiculoParticular extends Vehiculo {
    //ATRIBUTOS
    private int numPuertas;

    //Constructor
    public VehiculoParticular(String matricula, int numPuertas) {
        super(matricula);
        this.numPuertas = numPuertas;
    }

    public VehiculoParticular(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    //GETTERS & SETTERS

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }


    //METODOS

    @Override
    public String toString() {
        return super.toString()+"Vehiculo Particular{" +
                "numero de Puertas: " + getNumPuertas() +
                '}';
    }

}
