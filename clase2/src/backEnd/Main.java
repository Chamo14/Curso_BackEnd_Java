package backEnd;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    //MENU PRINCIPAL MAIN
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros=new int[10];
        int a, b;
        int op;
        boolean salir=false,salida=false;
        while (!salir){
        menuGeneral();
        op= teclado.nextInt();
        switch (op)
        {
            case 1:
                System.out.println("Ingrese un numero");
                System.out.flush();
                a = teclado.nextInt();
                System.out.println("Ingrese otro numero");
                System.out.flush();
                b = teclado.nextInt();
                while (!salida) {
                    menuCalculadora();
                    System.out.flush();
                    salida = opcionesCalculadora(teclado, a, b, salida);
                }
                break;
            case 2:
                impresionMinusculas();
                break;
            case 3:
                cargaNumeros(teclado,numeros);
                mostrarNumeros(numeros);
                while(!salida) {
                    menuArreglo();
                    System.out.flush();
                    salida = opcionesArreglo(numeros, salida);
                }
                break;
            case 4:
                salir=true;
                break;
            default:
                System.out.println("Ingrese otra opcion");
                break;
        }
    }
       /* cargaNumeros(numeros);
        mostrarNumeros(numeros);
        mostrarImpares(numeros);
        mostrarPares(numeros);
        System.out.println("----------");
        min=menor(numeros);
        System.out.println("minimo" + min);
        max=mayor(numeros);
        System.out.println("maximo" + max);
        Arrays.sort(numeros);
        mostrarNumeros(numeros);
        System.out.println("----------");
        mostrarNumeros(numeros);*/
        // cargaArray(arrayAscii);
       // impresionMinusculas(arrayAscii);

    }

    //IMPRESION DE MENU GENERAL
    public static void menuGeneral(){
        System.out.println("MENU DE OPCIONES");
        System.out.println("1 Ver ejercicio 1");
        System.out.println("2 Ver ejercicio 2");
        System.out.println("3 Ver ejercicio 3");
        System.out.println("4 Salir");
    }

    ////////////
//EJERCICIO 1 CALCULADORA
    public static boolean opcionesCalculadora(Scanner teclado, int a, int b, boolean s) {
        String op = teclado.nextLine();
        switch (op) {
            case "S":
                sumar(a, b);
                break;
            case "R":
                restar(a, b);
                break;
            case "M":
                multiplicar(a, b);
                break;
            case "D":
                dividir(a, b);
                break;
            case "C":
                System.out.println("Saliendo");
                s = cambiarValor(s);
                break;
            default:
                System.out.println("Ingrese otra opcion");
                break;
        }
        return s;
    }


    public static void menuCalculadora() {
        System.out.println("Menu de opciones calculadora");
        System.out.println("PRESIONE S PARA SUMAR");
        System.out.println("PRESIONE R PARA RESTAR");
        System.out.println("PRESIONE M PARA MULTIPLICAR");
        System.out.println("PRESIONE D PARA DIVIDIR");
        System.out.println("PRESIONE C PARA SALIR");
        System.out.println("ELIJA UNA OPCION");
    }

    public static void sumar(int a, int b) {
        int aux = a + b;
        System.out.println("La suma es : " + aux);
    }

    public static void restar(int a, int b) {
        int aux = a - b;
        System.out.println("La resta es : " + aux);
    }

    public static void dividir(int a, int b) {
        float aux = a / b;
        System.out.println("La division es : " + aux);
    }

    public static void multiplicar(int a, int b) {
        int aux = a * b;
        System.out.println("La multiplicacion es : " + aux);
    }

    public static boolean cambiarValor(boolean valor) {

        valor = true;
        return valor;
    }

    //EJERCICIO 2 CARACTERES
    public static void impresionMinusculas(){
        for(int valorAscii=97;valorAscii<=122;valorAscii++){
            char letras=(char)valorAscii;
            System.out.println(letras);
        }
    }
//EJERCICIO 3

    public static void menuArreglo(){
        System.out.println("MENU DE OPCIONES");
        System.out.println("0) Mostrar el arreglo");
        System.out.println("1) Mostrar el mayor ");
        System.out.println("2) Mostrar el menor ");
        System.out.println("3) Mostrar los numeros pares ");
        System.out.println("4) Mostrar los numeros impares ");
        System.out.println("5) Mostrar de forma ascendente ");
        System.out.println("6) Mostrar de forma descendiente ");
        System.out.println("7) Salir");

    }
    public static boolean opcionesArreglo(int[] v, boolean s) {
        Scanner teclado= new Scanner(System.in);
        int op = teclado.nextInt();
        switch (op) {
            case 0:
                mostrarNumeros(v);
                break;
            case 1:
                mostrarMayor(v);
                break;
            case 2:
               mostrarMenor(v);
                break;
            case 3:
                mostrarPares(v);
                break;
            case 4:
                mostrarImpares(v);
                break;
            case 5:
                ordenarAscendente(v);
                break;
            case 6:
                ordenarDescendiente(v);
                break;
            case 7:
                System.out.println("Saliendo");
                s = cambiarValor(s);
                break;
            default:
                System.out.println("Ingrese otra opcion");
                break;
        }
        return s;
    }

    public static void cargaNumeros(Scanner teclado,int[] numeros){
        int i=0;
        int n;
        while(i<10){
            System.out.println("Ingrese un numero");
            n= teclado.nextInt();
            numeros[i]=n;
            i++;

        }
    }
    public static void mostrarNumeros(int[] numeros){
        int i=0;
        System.out.println("CONTENIDO DEL ARREGLO");
        while(i< numeros.length){
            System.out.print("["+numeros[i]+"]");
            i++;
        }
        System.out.println();
        System.out.flush();
    }
    public static void mostrarMayor(int[] numeros){
        int mayor=0;
        for(int i=0;i<10;i++){
            if(numeros[i]>mayor)
            {mayor=numeros[i];}
        }
        System.out.println("El mayor es : "+mayor);
    }
    public static void mostrarMenor(int[] numeros){
        int menor=99999;
        for(int i=0;i<10;i++){
            if(numeros[i]<menor)
            {menor=numeros[i];}
        }
        System.out.println("El menor es : "+menor);
    }
    public static void mostrarPares(int[] numeros) {
        int resto;
        for (int i = 0; i < 10; i++) {
            resto = numeros[i] % 2;
            if (resto == 0) {
                System.out.print("[" + numeros[i] + "]");
            }
            System.out.println();
            System.out.flush();
        }
    }
    public static void mostrarImpares(int[] numeros)
    {
        int resto;
        System.out.println("NUMEROS IMPARES");
        for(int i=0;i<10;i++){
            resto=numeros[i]%2;
            if(resto!=0)
            {System.out.print("["+numeros[i]+"]");}
        }
        System.out.println();
        System.out.flush();

    }
    public static void ordenarAscendente(int[] numeros){
        Arrays.sort(numeros);
        mostrarNumeros(numeros);
    }
    public static void ordenarDescendiente(int[] numeros){

        Arrays.sort(new int[][]{numeros},Collections.reverseOrder());
        mostrarNumeros(numeros);
    }
}

