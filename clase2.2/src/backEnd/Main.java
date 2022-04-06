package backEnd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();
        int op;
        boolean salir=false;
        Scanner teclado =new Scanner(System.in);
        Animal animal =new Animal(false);
        veterinario.setAnimal(animal);
        while (!salir){
        impresionMenu();
        op=teclado.nextInt();
        switch (op) {
            case 0:
                animal.cargarAnimal(animal,teclado);
                System.out.flush();
                break;
            case 1:
                veterinario.ingresoDatos(veterinario, teclado);
                veterinario.setAnimal(animal);
                System.out.flush();
                break;
            case 2:
                animal.menu();
                System.out.flush();
                break;

            case 3:
                veterinario.realizarChekeo(animal);
                veterinario.mostrarVeterinario(veterinario);
                break;
            case 4:
                veterinario.alertarSintomas();
                break;
            case 5:
                salir=true;
            break;
            default:System.out.println("Ingrese otra opcion");
                break;
        }
        }

    }


    public static void impresionMenu(){
        System.out.println("Elija su opcion");
        System.out.println("0 - Cargar datos del animal");
        System.out.println("1 - Cargar datos del veterinario");
        System.out.println("2 - Cargar sintomas del animal");
        System.out.println("3 - Realizar un checkeo");
        System.out.println("4 - Curacion");
        System.out.println("5 - Salir");
    }
}
