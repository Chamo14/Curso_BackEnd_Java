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
    public boolean verificarService(int km, int cant) {
        int num = 0;
        boolean service = false;
        num = km / 5000;
        if (num == cant) {
            service = true;
        }
        return service;
    }

    public void realizarService(Auto auto) {
        Scanner teclado = new Scanner(System.in);
        String marcaAux;
        System.out.println("Ingrese la marca de aceite a cambiar");
        marcaAux = teclado.nextLine();
        int cant= auto.getCantServiceHechos();
        auto.setMarcaAceite(marcaAux);
        auto.setCantServiceHechos(cant++);
        ;
        System.out.println("El service se realizo correctamente!");

    }

    public  void informarAuto(Auto auto) {
        System.out.println("MARCA vehiculo: " + auto.getMarca());
        System.out.println("MODELO: " + auto.getModelo());
        System.out.println("AÑO: " + auto.getAño());
        System.out.println("KILOMETROS REALIZADOS: " + auto.getKmRealizados());
        System.out.println("CANTIDAD DE SERVICE REALIZADOS: " + auto.getCantServiceHechos());
        System.out.println("MARCA DE ULTIMO ACEITE CAMBIADO: " + auto.getMarcaAceite());
    }

    /*public boolean verifPapeles(int papeles) {

        if (papeles == 1) {
            return true;
        } else if (papeles == 0) {
            return false;
        }


        public static void verifAceite ( int cantAceite){
            if (cantAceite >= 80) {
                System.out.println("Aceite al " + cantAceite + "%, lleno o casi lleno.");
            } else if (cantAceite =<79 || cantAceite >= 50){
                System.out.println("Aceite al " + cantAceite + "%, posee una cantidad suficiente.");
            }else if (cantAceite =<49 || cantAceite >= 20){
                System.out.println("Aceite al " + cantAceite + "%, por debajo de la mitad.");
            }else if (cantAceite =<29 || cantAceite >= 1){
                System.out.println("Aceite al " + cantAceite + "%, es necesario rellenar.");
            }else if (cantAceite > 1) {
                System.out.println("Aceite vacio.");
            }
        }

        public static void verifRuedas () {
            int kmPromedio, kmTotal, kmRueda, unaXuna = 1;
            Scanner entrada = new Scanner(System.in);

            do {
                System.out.print("Cual es la cantidad de km realizados en la rueda N°" + unaXuna + " desde el último cambio: ");
                kmRueda = entrada.nextInt();
                if (kmRueda >= 15000) {
                    System.out.println("La rueda requiere mantenimiento.");
                } else {
                    System.out.println("Su rueda está en condiciones.");
                }
                kmTotal += kmRueda;
                System.out.println("");
                unaXuna++;
            } while (unaXuna <= 4);

            kmPromedio = kmTotal / 4;
            System.out.println("Usted tiene un promedio de " + kmPromedio + " km. realizados en sus ruedas.");
        }/*/

    }



