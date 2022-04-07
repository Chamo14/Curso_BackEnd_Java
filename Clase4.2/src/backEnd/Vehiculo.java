package backEnd;

abstract public class Vehiculo implements AccionesVehiculo{
    private String matricula;
    private double velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad=0;
    }

    public Vehiculo() {
    }

    //GETTERS & SETTERS

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + getMatricula() + '\'' +
                ", velocidad=" + getVelocidad()+
                '}';
    }

    @Override
    public void acelerar(double x) throws DemaciadoRapidoException {
        setVelocidad(getVelocidad()+x);
    }
}
