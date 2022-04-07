package backEnd;

public class Remolque {
    //ATRIBUTOS
    private int peso;
    //CONSTRUCTOR

    public Remolque(int peso) {
        this.peso = peso;
    }

    //GETTERS & SETTERS

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    //METODOS

    @Override
    public String toString() {
        return "Remolque{" +
                "peso=" + getPeso()+
                '}';
    }

}
