package backEnd;

public class Vendedor  {

    //atributos

    private String nombre;
    private double montoVendido;
    private ComissionStrategy metodoCobro;
    //constructor

    public Vendedor(String nombre, double montoVendido) {
    this.nombre = nombre;
    this.montoVendido = montoVendido;
}

    public Vendedor(String nombre, double montoVendido, ComissionStrategy a) {
        this.nombre = nombre;
        this.montoVendido = montoVendido;
        metodoCobro=a;
    }

    public Vendedor() {

    }

    //getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        this.montoVendido = montoVendido;
    }

    public void setMetodoCobro(ComissionStrategy metodoCobro) {
        this.metodoCobro = metodoCobro;
    }
//metodos

    public double cobrarComision(double monto){
        return metodoCobro.aplicarComision(monto);
    }
    public int verificarComision(){
        return metodoCobro.verificarComision();
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + getNombre() + '\'' +
                ", montoVendido=" + getMontoVendido();
    }
}
