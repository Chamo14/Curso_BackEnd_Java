package backEnd;

import java.util.Scanner;


    //USUARIO ESTANDAR
    public class Usuario extends Cliente {
    //ATRIBUTTOS
    private int diasAlquilados;
        //CONSTRUCTORES
        public Usuario(String nombre, String direccion, int telefono, Peliculas peliculas, int diasAlquilados) {
            super(nombre, direccion, telefono, peliculas);
            this.diasAlquilados = diasAlquilados;
        }

        public Usuario() {
            this.diasAlquilados = diasAlquilados;
        }

        //GETTERS & SETTERS
    public int getDiasAlquilados() {
        return diasAlquilados;
    }

    public void setDiasAlquilados(int diasAlquilados) {
        this.diasAlquilados = diasAlquilados;
    }
//METODOS
    @Override
    public void alquilarPelicula(Peliculas peli, Scanner teclado) {
        peli.mostrarPelicula(peli);
        System.out.println("Desea alquilar esta pelicula?Y/N");
        char r=teclado.next().charAt(0);
        if ((r=='y'||r=='Y')&&(!peli.isVip())){
            peli.setAlquilada(true);
            setPeliculas(peli);
            setDiasAlquilados(3);
            System.out.println("Su pelicula esta alquilada! tiene "+getDiasAlquilados()+" para devolverla");
        }
        else
        {System.out.println("Esta pelicula es solo para VIPS su usuario es ESTANDAR");}

    }
        public void cargarUsuarioEstandar(Usuario user,Scanner teclado){
            System.out.println("Ingrese nombre : ");
            user.setNombre(teclado.next());
            System.out.println("Ingrese direccion : ");
            user.setDireccion(teclado.next());
            System.out.println("Ingrese telefono : ");
            user.setTelefono(teclado.nextInt());
            user.setDiasAlquilados(0);

        }
        public void mostrarUsuario(Usuario user)
        {
            System.out.println("----------------");
            System.out.println("Nombre : "+user.getNombre());
            System.out.println("Direccion : "+user.getDireccion());
            System.out.println("Telefono : "+user.getTelefono());
            System.out.println("Pelicula alquilada : "+user.getPeliculas().getNombre());
            System.out.println("Dias disponibles : "+user.getDiasAlquilados());
            System.out.println("----------------");
        }
}


