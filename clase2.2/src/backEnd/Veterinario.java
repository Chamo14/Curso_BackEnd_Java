package backEnd;
import java.util.Scanner;

public class Veterinario implements IAtencion {
    private String nombre;
    private int matricula;
    private int telefono;
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

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


    public void darInforme(String infA, String infP,Animal animal){
        System.out.println("INFORME ----------------------");
        System.out.println("Alimentacion : "+infA);
        System.out.println("Informe de peso: "+infP);
        System.out.println("Nombre : "+animal.getNombre());
        System.out.println("Raza : "+animal.getRaza());
        System.out.println("Edad : "+animal.getEdad());
        System.out.println("Genero : "+animal.getGenero());
        System.out.println("Sintoma : "+animal.getSintoma());
        System.out.println("------------------------------");

    }

    public void realizarChekeo(int peso,Animal animal){
        String infPeso=controlarPeso(peso, animal.getEdad());
       boolean alimentacion=controlarAlimentacion();
       String infAlimentacion;
       if (alimentacion){infAlimentacion="Buena";}
       else{infAlimentacion="Mala";}
       darInforme(infAlimentacion,infPeso,animal);
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

    public void impresionCuracion(){
        System.out.println("Su animal tiene los siguientes sintomas");
        this.animal.mostrarSintomas();
        System.out.println("Elija la opcion de curacion");
        System.out.println("1) Curar con medicacion");
        System.out.println("2) Curar con hierbas medicinales");
        System.out.println("3) Curar con cirujia");
    }

    @Override
    public void alertarSintomas() {
        Scanner teclado = new Scanner(System.in);
        int op;
        impresionCuracion();
        op=teclado.nextInt();
        switch (op){
            case 1:
                System.out.println("Se aplicara un medicamento");
                break;
            case 2:
                System.out.println("Se aplicara hierbas medicinales");
                break;
            case 3:
                System.out.println("Se aplicara una cirujia");
                break;
            default:
                System.out.println("No se dio su tratamiento");
                break;
        }
        }
    }

