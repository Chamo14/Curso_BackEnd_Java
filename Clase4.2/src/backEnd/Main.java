package backEnd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws DemaciadoRapidoException {
        //HARDCODEO Y COMPROBACION DE METODOS
        Scanner teclado= new Scanner(System.in);
	    VehiculoParticular particular = new VehiculoParticular("123123",4);
        System.out.println(particular.toString());

        particular.acelerar(10);

        System.out.println(particular.toString());
        VehiculoCarga carga =new VehiculoCarga("12314");
        carga.ponerRemolque(carga,teclado);
        System.out.println(carga.toString());
        carga.acelerar(80);
        System.out.println(carga.toString());

    }

}
