package backEnd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();
        int op;
        boolean salir=false;
        Scanner teclado =new Scanner(System.in);
        Animal animal =new Animal("bob","perro caniche",4, 'f',true);
        while (!salir){
        impresionMenu();
        System.out.flush();
        op=teclado.nextInt();
        switch (op) {
            case 1:  ingresoDatos(veterinario, teclado);
                     veterinario.setAnimal(animal);
                     System.out.flush();
                    break;
            case 2:
                animal.alertarSintomas();
                System.out.flush();
                break;

            case 3:
                veterinario.realizarChekeo(30, animal);
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

    public static void ingresoDatos(Veterinario veterinario,Scanner teclado){
        System.out.println("Ingrese nombre");
        veterinario.setNombre(teclado.nextLine());
        System.out.println("Ingrese matricula");
        veterinario.setMatricula(teclado.nextInt());
        System.out.println("Ingrese telefono");
        veterinario.setTelefono(teclado.nextInt());

    }
    public static void impresionMenu(){
        System.out.println("Elija su opcion");
        System.out.println("1 - Cargar datos del veterinario");
        System.out.println("2 - Cargar sintomas del animal");
        System.out.println("3 - Realizar un checkeo");
        System.out.println("4 - Curacion");
        System.out.println("5 - Salir");
    }
}
