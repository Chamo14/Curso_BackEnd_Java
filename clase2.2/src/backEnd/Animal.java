package backEnd;

import java.util.Scanner;
import java.util.Vector;

public class Animal implements IAtencion {

    private String nombre, raza;
    private int edad,peso;
    private char genero = ' ';
    private boolean sintomas;
    private String sintoma;
    private Vector<String> listaSintomas = new Vector<>();

    public Animal(boolean sintomas) {
        this.sintomas = sintomas;
    }

    public Animal(String nombre, String raza, int edad,int peso, char genero, boolean sintomas) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.genero = genero;
        this.sintomas = sintomas;
       // menu();
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getSintomas() {
        return sintomas;
    }

    public void setSintomas(boolean sintomas) {
        this.sintomas = sintomas;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public Vector<String> getListaSintomas() {
        return listaSintomas;
    }

    public void setListaSintomas(Vector<String> listaSintomas) {
        this.listaSintomas = listaSintomas;
    }
    public  void cargarAnimal(Animal animal,Scanner teclado){
        System.out.println("CARGANDO ANIMAL---------------");
        System.out.println("Ingrese nombre");
        animal.setNombre(teclado.next());
        System.out.println("Ingrese raza");
        animal.setRaza(teclado.next());
        System.out.println("Ingrese edad");
        animal.setEdad(teclado.nextInt());
        System.out.println("Ingrese peso");
        animal.setPeso(teclado.nextInt());
        System.out.println("Ingrese genero");
        animal.setGenero(teclado.next().charAt(0));
        System.out.println("Posee algun sintoma? Poner Y/N");
        char r=teclado.next().charAt(0);
        if (r=='Y'||r=='y'){
        animal.setSintomas(true);}

    }
    @Override
    public void alertarSintomas() {
        int opcion = 0, opcionSintoma = 0;
        Scanner sc = new Scanner(System.in);
        if (sintomas) {
            while (opcion != 5) {
                System.out.println("********* FORMAS DE ALERTAR UN SINTOMA **************");
                System.out.println("Ingrese el numero indicado para cargar un sintoma al animal");
                System.out.println("1 - maulla / ladra");
                System.out.println("2 - rasquido");
                System.out.println("3 - quietud");
                System.out.println("4 - vomitos");
                System.out.println("5 - salir");
                opcionSintoma = sc.nextInt();
                switch (opcionSintoma) {
                    case 1:
                        this.sintoma = "Mucho maullido / ladrido";
                        this.listaSintomas.add(sintoma);
                        System.out.println("Sintoma cargado!");
                        System.out.println("***********************************************");
                        System.out.println("Desea continuar? 1 continuar o 5 salir");
                        opcion = sc.nextInt();
                        break;
                    case 2:
                        this.sintoma = "Se rasca constantemente";
                        this.listaSintomas.add(sintoma);
                        System.out.println("Sintoma cargado!");
                        System.out.println("***********************************************");
                        System.out.println("Desea continuar? 1 continuar o 5 salir");
                        opcion = sc.nextInt();
                        break;
                    case 3:
                        this.sintoma = "Poca movilidad, mucho tiempo acostado";
                        this.listaSintomas.add(sintoma);
                        System.out.println("Sintoma cargado!");
                        System.out.println("***********************************************");
                        System.out.println("Desea continuar? 1 continuar o 5 salir");
                        opcion = sc.nextInt();
                        break;
                    case 4:
                        this.sintoma = "Vomitos";
                        this.listaSintomas.add(sintoma);
                        System.out.println("Sintoma cargado!");
                        System.out.println("***********************************************");
                        System.out.println("Desea continuar? 1 continuar o 5 salir");
                        opcion = sc.nextInt();
                        break;
                    default:
                        System.out.println("Sintomas desconocidos");
                        System.out.println("***********************************************");
                        System.out.println("Desea continuar? 1 continuar o 5 salir");
                        opcion = sc.nextInt();
                        break;
                }
            }
        } else {
            System.out.println("El animal no presenta sintomas");
        }

    }

    public void mostrarSintomas() {
        if (sintomas) {
            System.out.println("********* LISTA DE SINTOMAS **********");
            for (int i = 0; i < this.listaSintomas.size(); i++) {
                System.out.println("Sintoma: " + listaSintomas.get(i));
            }
        }
        System.out.println("********************************************");
    }

    public void menu() {
        int opcionMenu = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("************** SINTOMAS ANIMAL ***************");
        System.out.println("Ingrese una opcion para continuar: ");
        System.out.println("1 para continuar o 2 para salir");
        opcionMenu = sc.nextInt();
        while (opcionMenu != 2) {
            alertarSintomas();
            mostrarSintomas();
            System.out.println("Ingrese una opcion para continuar: ");
            System.out.println("1 para continuar o 2 para salir");
            opcionMenu = sc.nextInt();
        }
    }

}
