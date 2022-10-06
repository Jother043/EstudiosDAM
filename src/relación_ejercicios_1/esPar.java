package relación_ejercicios_1;

import java.util.Scanner;

public class esPar {

    public static void main(String[] args) {
        System.out.println("Introduce un numero para saber si es par o impar  ");
        Scanner teclado = new Scanner(System.in);
        int numero = Integer.parseInt(teclado.nextLine());
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        }
        else {
            System.out.println("El numero " + numero + " es impar");
        }

        teclado.close();
    }
}
