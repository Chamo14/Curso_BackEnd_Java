package backEnd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int km, ruedas, service = 0;
        String marca, modelo, año, marcaAceite;
        System.out.println("Ingrese modelo del vehiculo");
        modelo = teclado.nextLine();
        System.out.println("Ingrese marca del vehiculo");
        marca = teclado.nextLine();
        System.out.println("Ingrese Año del vehiculo");
        año = teclado.nextLine();
        System.out.println("Ingrese Marca de ultimo aceite en el service");
        marcaAceite = teclado.nextLine();
        System.out.println("Ingrese cantidad de kilometros del vehiculo");
        km = teclado.nextInt();
        System.out.println("Ingrese cantidad de ruedas del vehiculo");
        ruedas = teclado.nextInt();
        System.out.println("Ingrese cantidad de services realizados del vehiculo");
        service = teclado.nextInt();

        Auto auto = new Auto(marca, modelo, año, ruedas, km, service, marcaAceite);

        int opcion = 0;
        System.out.println("Elija la opcion a realizar");
        System.out.println("1 Verificar Service");
        System.out.println("2 Verificar Aceite");
        System.out.println("3 Verificar Ruedas");
        System.out.println("4 Verificar Papeles");
        System.out.println("5 Realizar Service");
        System.out.println("6 Informar detalles");
        opcion = teclado.nextInt();

        //Menu de opciones

        switch (opcion) {
            case 1:
                verificarAuto(auto);
                break;
            case 2:
                //ejercicio2();
                break;
            case 3:
               // ejercicio3();
                break;
            case 4:
                //ejercicio4();
                break;
            case 5:
                auto.realizarService(auto.getCantServiceHechos(),auto.getMarcaAceite());
                auto.informarAuto(auto);
                break;
            case 6:
                auto.informarAuto(auto);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;


        }

    }

    public static  void verificarAuto(Auto auto){
        boolean verificado=auto.verificarService(auto.getKmRealizados(), auto.getCantServiceHechos());
        if (verificado){System.out.println("Su auto tiene todos su services correspondientes!");}
            else{System.out.println("Su auto le falta realizar un service!");}
    }
}
