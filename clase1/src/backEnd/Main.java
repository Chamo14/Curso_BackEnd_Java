package backEnd;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int opcion;
        System.out.println("Elija un ejercicio a realizar");
        System.out.println("EJERCICIO 1 ");
        System.out.println("EJERCICIO 2");
        System.out.println("EJERCICIO 3");
        System.out.println("EJERCICIO 4");
        System.out.println("EJERCICIO 5");
        System.out.println("EJERCICIO 6");
        opcion=teclado.nextInt();
        //Menu de opciones
        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        teclado.close();



    }
    public static void ejercicio1(){
        float altura,imc;
        int peso;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su Altura en CM : ");
        altura = teclado.nextFloat();
        System.out.println("Ingrese su Peso en KG : ");
        peso = teclado.nextInt();
        imc =peso /(altura*altura);
        if (imc <20){System.out.println("Segun su MC su diagnostico dio MAL ESTADO");}
        else if ((imc >=20)&&(imc <22)){ System.out.println("Segun su MC su diagnostico dio BAJO PESO ");}
        else if ((imc >=22)&&(imc <25)){ System.out.println("Segun su MC su diagnostico dio PESO NORMAL");}
        else if ((imc >=25)&&(imc <30)){ System.out.println("Segun su MC su diagnostico dio SOBREPESO");}
        else if ((imc >=30)&&(imc <=40)){System.out.println("Segun su MC su diagnostico dio  SOBREPESO CRONICO");}
        else if (imc>40){ System.out.println("Segun su MC su diagnostico dio HOSPITALIZADO ");}
        teclado.close();
    }
    public static void ejercicio2(){
        int a,b,c;
        float dis;
        double raiz1,raiz2,raizCuadrada;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de A");
        a=teclado.nextInt();
        System.out.println("Ingrese el valor de B");
        b=teclado.nextInt();
        System.out.println("Ingrese el valor de C");
        c=teclado.nextInt();
        dis=(b*b)-(4*a*c);
        System.out.println("Su ecuacion es : "+a+"x^2 "+b+"x "+c);
        if (dis>0){
            raizCuadrada=Math.sqrt(dis);
            raiz1=((-b+raizCuadrada)/(2*a));
            raiz2=((-b-raizCuadrada)/(2*a));
            System.out.println("Sus raices son reales y distintas");
            System.out.println("Sus raices son : "+raiz1+" y "+raiz2);
        }
        else if(dis==0){
            raiz1=raiz2=(-b/(2*a));
            System.out.println("Sus raices son reales e iguales");
            System.out.println("Sus raices son : "+raiz1+" y "+raiz2);
        }
        else {
            raiz1=(-b/(2*a));
            raizCuadrada=Math.sqrt(-dis);
            raiz2=raizCuadrada/(2*a);
            System.out.println("Sus raices son imaginarias");
            System.out.println("Sus raices son : "+raiz1+" y "+raiz2+"i");
        }
        teclado.close();

    }
    public static void ejercicio3(){
        int nota1,nota2,nota3;
        float promedio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una nota : ");
        nota1=teclado.nextInt();
        System.out.println("Ingrese una nota : ");
        nota2=teclado.nextInt();
        System.out.println("Ingrese una nota : ");
        nota3=teclado.nextInt();
        promedio=(nota1+nota2+nota3)/3;
        if (promedio <10){System.out.println("Usted esta desaprobado");}
        else if ((promedio>=10)&&(promedio<=15)){System.out.println("Usted esta aprobado");}
        else if((promedio>15)){System.out.println("Usted esta eximido");}
        teclado.close();
    }
    public static void ejercicio4(){
        int valor,i;
        int mayor=0;
        Scanner teclado = new Scanner(System.in);
        for (i=0;i<3;i++){
        System.out.println("Ingrese un valor : ");
        valor=teclado.nextInt();
        if(valor>mayor){
            mayor=valor;}
        }
        System.out.println("El mayor de los numeros es : "+mayor);
        teclado.close();
    }
    public static void ejercicio5(){
        int valor,i;
        int menor=999999;
        Scanner teclado = new Scanner(System.in);
        for (i=0;i<3;i++){
            System.out.println("Ingrese un valor : ");
            valor=teclado.nextInt();
            if(valor<menor){
                menor=valor;}
        }
        System.out.println("El menor de los numeros es : "+menor);
        teclado.close();
    }
    public static void ejercicio6(){
        int numero, aux, inverso = 0, cifra;
        Scanner teclado = new Scanner(System.in);
        do{//Se carga el numero y se repitira en caso de no ingresar un numero mayor a 10
            System.out.print("Introduce un número >= 10: ");
            numero = teclado.nextInt();
        }while(numero< 10);
        aux=numero;
        while (aux!=0){
            cifra=aux%10;
            inverso=inverso*10+cifra;
            aux=aux/10;
        }
       //se comprueba si es capicua el numero invertido con el original
        if(numero==inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
        teclado.close();
    }


}
