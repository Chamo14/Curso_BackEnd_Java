package backEnd;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int op=0;
    int i=0;
    int flag=0;
    Usuario usuario= new Usuario();
    UsuarioVip userVip= new UsuarioVip();
	Vector<Peliculas> lista = new Vector<>();
    while (flag==0) {
        flag=menu(teclado,op,i,flag,userVip,usuario,lista);
    }

    teclado.close();
    }

    //METODOS

    public static int menu(Scanner teclado,int op,int i,int flag,UsuarioVip userVip,Usuario usuario,Vector<Peliculas> lista){
        printeo();
        op = teclado.nextInt();
        switch (op) {
            case 1:cargarLista(lista,teclado);
                break;
            case 2:
                System.out.println("USUARIO STANDAR");
                usuario.cargarUsuarioEstandar(usuario,teclado);
                System.out.flush();

                break;
            case 3:
                System.out.println("USUARIO VIP");
                userVip.cargarUsuarioVip(userVip,teclado);
                System.out.flush();


                break;
            case 4:
                System.out.println("Elija su tipo de usuario ");
                System.out.println("----------------");
                System.out.println("1 - STANDAR ");
                System.out.println("2 - PREMIUN ");
                System.out.println("3 - SALIR ");
                System.out.println("----------------");
                i= teclado.nextInt();
                if (i==1){
                    usuario.alquilarPelicula(elegirPelicula(lista,teclado),teclado);
                }
                else if(i==2){
                    userVip.alquilarPelicula(elegirPelicula(lista,teclado),teclado);
                }
                else {System.out.println("Volviendo");}

                break;
            case 5:
                mostrarDisponibles(lista);
                break;
            case 6:
                mostrarLista(lista);
                break;
            case 7:
                System.out.println("Saliendo");
                flag = 1;
                break;
            default:
                System.out.println("Elija otra opcion");
                break;

        }
        return flag;
    }
    public  static void printeo(){
        System.out.println("MENU :");
        System.out.println("----------------");
        System.out.println("1 - CARGAR LISTADO DE PELICULAS :");
        System.out.println("2 - CARGAR USUARIO ESTANDAR");
        System.out.println("3 - CARGAR USUARIO PREMIUN");
        System.out.println("4 - ALQUILAR PELICULA");
        System.out.println("5 - VER PELICULAS DISPONIBLES");
        System.out.println("6 - VER TODAS LAS PELICULAS");
        System.out.println("7 - SALIR");
        System.out.println("----------------");

    }


    public static void cargarLista(Vector<Peliculas> lista, Scanner teclado){
        int flag =0;
        char r;
        while(flag==0) {
            System.out.println("Quiere cargar una pelicula a la lista? Y/N");
            r=teclado.next().charAt(0);
            if(r=='y'||r=='Y'){
            Peliculas peli = new Peliculas();
            peli.cargarPelicula(peli, teclado);
            lista.add(peli);}
            else {flag=1;}
        }
    }
    public static void mostrarLista(Vector<Peliculas> lista){
        System.out.println("LISTADO DE TODAS LAS PELICULAS");
        for(int i=0;i<lista.size();i++){
            lista.get(i).mostrarPelicula(lista.get(i));
        }
    }

    public static void mostrarDisponibles(Vector<Peliculas> lista) {
        System.out.println("LISTADO DE PELICULAS DISPONIBLES");
        int cont=0;
        System.out.println("----------------");
        for (int i = 0; i < lista.size(); i++) {
            if (!lista.get(i).isAlquilada()) {
                System.out.println("PELICULA : "+i);
                lista.get(i).mostrarPelicula(lista.get(i));
                cont++;
            }
        }
        if(cont==0){System.out.println("No hay peliculas disponibles! ");}
        System.out.println("----------------");
    }

    public static Peliculas elegirPelicula(Vector<Peliculas> lista,Scanner teclado){
        Peliculas peli ;
        mostrarDisponibles(lista);
        System.out.println("Elija una de las peliculas de la lista");
        int op= teclado.nextInt();
        peli=lista.get(op);
        return peli;
    }
}
