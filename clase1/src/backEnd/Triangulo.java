package backEnd;

public class Triangulo {
    //atributos
    private int lado1,lado2,lado3;

    //contructor
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public Triangulo() {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    //Metodos

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public void quienSoy(int lado1,int lado2,int lado3){
        if((lado1==lado2)&&(lado1==lado3)){
            System.out.println("Soy equilatero");
        }
        else if((lado1==lado2)&&(lado1!=lado3)){
            System.out.println("Soy isoceles");
        }else if ((lado1==lado3)&&(lado1!=lado2)){
            System.out.println("Soy isoceles");
        }else System.out.println("Soy escaleno");
    }
}
