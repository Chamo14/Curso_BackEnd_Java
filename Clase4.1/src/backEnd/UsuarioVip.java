package backEnd;

import java.util.Scanner;

//USUARIO VIP
public class UsuarioVip extends Cliente{

    //ATRIBUTOS
    private int diasAlquilados;
    private boolean vip;
    //CONSTRUCTORES

    public UsuarioVip(String nombre, String direccion, int telefono, Peliculas peliculas, int diasAlquilados, boolean vip) {
        super(nombre, direccion, telefono, peliculas);
        this.diasAlquilados = diasAlquilados;
        this.vip = vip;
    }


    public UsuarioVip(int diasAlquilados, boolean vip) {
        this.diasAlquilados = diasAlquilados;
        this.vip = vip;
    }

    public UsuarioVip() {
        this.diasAlquilados = diasAlquilados;
        this.vip = vip;
    }

    //GETTERS & SETTERS
    public int getDiasAlquilados() {
        return diasAlquilados;
    }

    public void setDiasAlquilados(int diasAlquilados) {
        this.diasAlquilados = diasAlquilados;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
//METODOS
    @Override
    public void alquilarPelicula(Peliculas peli, Scanner teclado) {
        peli.mostrarPelicula(peli);
        System.out.println("Desea alquilar esta pelicula?Y/N");
        char r=teclado.next().charAt(0);
        if (r=='y'||r=='Y'){
            peli.setAlquilada(true);
            setPeliculas(peli);
            setDiasAlquilados(60);
            System.out.println("Su pelicula esta alquilada! tiene "+getDiasAlquilados()+" para devolverla");
        }

    }
    public void cargarUsuarioVip(UsuarioVip user,Scanner teclado){
        System.out.println("Ingrese nombre : ");
        user.setNombre(teclado.next());
        System.out.println("Ingrese direccion : ");
        user.setDireccion(teclado.next());
        System.out.println("Ingrese telefono : ");
        user.setTelefono(teclado.nextInt());
        user.setDiasAlquilados(0);

    }
    public void mostrarVip(UsuarioVip user)
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
