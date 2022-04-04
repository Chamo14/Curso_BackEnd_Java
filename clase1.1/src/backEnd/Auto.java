package backEnd;
import java.util.Scanner;
public class Auto {
    //Atributos
    private String marca;
    private String modelo;
    private String año;
    private int cantRuedas;
    private int kmRealizados;
    private int cantServiceHechos;
    private String marcaAceite;
    //constructor
    public Auto(String marca, String modelo, String año, int cantRuedas, int kmRealizados, int cantServiceHechos, String marcaAceite) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.cantRuedas = cantRuedas;
        this.kmRealizados = kmRealizados;
        this.cantServiceHechos = cantServiceHechos;
        this.marcaAceite = marcaAceite;
    }

    public Auto() {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.cantRuedas = cantRuedas;
        this.kmRealizados = kmRealizados;
        this.cantServiceHechos = cantServiceHechos;
        this.marcaAceite = marcaAceite;
    }


    //Getters & Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getKmRealizados() {
        return kmRealizados;
    }

    public void setKmRealizados(int kmRealizados) {
        this.kmRealizados = kmRealizados;
    }

    public int getCantServiceHechos() {
        return cantServiceHechos;
    }

    public void setCantServiceHechos(int cantServiceHechos) {
        this.cantServiceHechos = cantServiceHechos;
    }

    public String getMarcaAceite() {
        return marcaAceite;
    }

    public void setMarcaAceite(String marcaAceite) {
        this.marcaAceite = marcaAceite;
    }
    //metodos
    //verifica si tiene realizado el ultimo service correspondiente
    public static boolean verificarService(int km,int cant){
        int num=0;
        boolean service=false;
        num=km/5000;
        if (num==cant)
        {System.out.println("Su auto tiene todos su services correspondientes!");
            service=true;}
        else {
            System.out.println("Su auto le falta realizar un service!");
        }
        return service;
    }

    public static void realizarService(int cant,String marca){
        Scanner teclado = new Scanner(System.in);
        String marcaAux;
        System.out.println("Ingrese la marca de aceite a cambiar");
        marcaAux= teclado.nextLine();
        cant=cant+1;
        marca=marcaAux;
        System.out.println("El service se realizo correctamente!");

    }

    public static void informarAuto(Auto auto)
    {
        System.out.println("MARCA vehiculo: "+auto.getMarca());
        System.out.println("MODELO: "+auto.getModelo());
        System.out.println("AÑO: "+auto.getAño());
        System.out.println("KILOMETROS REALIZADOS: "+auto.getKmRealizados());
        System.out.println("CANTIDAD DE SERVICE REALIZADOS: "+auto.getCantServiceHechos());
        System.out.println("MARCA DE ULTIMO ACEITE CAMBIADO: "+auto.getMarca());
    }

}

