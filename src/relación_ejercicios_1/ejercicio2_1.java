package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio2_1 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int edad ;

        System.out.println("Introduce la edad de una persona comprendido entre 0 y 100 ");
        edad = Integer.parseInt(teclado.nextLine());

        do {
            System.out.println("Introduce la edad correcta ");
            edad = Integer.parseInt(teclado.nextLine());
        }while(edad < 0 && edad > 100 );

        if (edad < 0){
            System.out.printf("El numero introducido es negativo");
        }

        if (edad > 100){
            System.out.printf("El numero excede el maximo de edad permitido");
        }

        if (edad >= 0 && edad <= 12) System.out.printf("Adolescente");
        if (edad >= 13 && edad <= 17) System.out.printf("joven");
        if (edad >= 18 && edad <= 12) System.out.printf("adulto");




    }

}
