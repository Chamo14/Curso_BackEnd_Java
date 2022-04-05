package backEnd;
import java.util.Scanner;
public class Veterinario {
    private String nombre;
    private int matricula;
    private int telefono;

    public Veterinario(String nombre, int matricula, int telefono) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.telefono = telefono;
    }

    public Veterinario() {
        this.nombre = nombre;
        this.matricula = matricula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void darTratamiento(int peso,int edad){
        realizarChekeo(peso,edad);
        

    }

    public void darInforme(String infA, String infP){
        System.out.println("Alimentacion : "+infA);
        System.out.println("Informe de peso: "+infP);

    }

    public void realizarChekeo(int peso, int edad){
        String infPeso=controlarPeso(peso,edad);
       boolean alimentacion=controlarAlimentacion();
       String infAlimentacion;
       if (alimentacion){infAlimentacion="Buena";}
       else{infAlimentacion="Mala";}
       darInforme(infAlimentacion,infPeso);
    }

    public  String controlarPeso(int peso,int edad){
        String infPeso = null;
        if (edad < 1)
        {
            if (peso<=10){infPeso="Anemico";}
            else if(peso >10 && peso<=20){infPeso="Normal";}
            else {infPeso="Sobrepeso";}
        }

        if (edad >1 && edad<=3)
        {
            if (peso<=15){infPeso="Anemico";}
            else if(peso>15 && peso<=30){infPeso="Normal";}
            else {infPeso="Sobrepeso";}
        }
        if (edad >3 && edad<=5)
        {
            if (peso<=25){infPeso="Anemico";}
            else if(peso>25 && peso<=40){infPeso="Normal";}
            else {infPeso="Sobrepeso";}
        }
        return infPeso;
    }

    public boolean controlarAlimentacion(){
        Scanner teclado= new Scanner(System.in);
        boolean buena=false;
        System.out.println("Ingrese cantidad de veces que come su animal por dia");
        int cant=teclado.nextInt();
        if (cant>=2){
            buena=true;
        }

        return buena;
    }
}
