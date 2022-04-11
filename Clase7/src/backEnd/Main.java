package backEnd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	ComisionNormal comisionNormal = new ComisionNormal();
    ComisionRegular comisionRegular = new ComisionRegular();
    ComisionCompleta comisionCompleta = new ComisionCompleta();
    Scanner teclado = new Scanner(System.in);
    Vendedor vendedor = new Vendedor();
    double comision;
    System.out.println("Ingrese nombre del vendedor : ");
    vendedor.setNombre(teclado.next());
    System.out.println("Ingrese el monto en $$ que vendio : ");
    vendedor.setMontoVendido(teclado.nextDouble());
    vendedor.setMetodoCobro(comisionCompleta);
    comision= vendedor.cobrarComision(vendedor.getMontoVendido());
    System.out.println(vendedor.toString());
    System.out.println("Se lleva una comision de "+comision);


    }
}
