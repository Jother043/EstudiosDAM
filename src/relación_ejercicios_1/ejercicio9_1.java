package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio9_1 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        char tipo;
        double precio;
        double total;


        System.out.print("Introduce el precio del producto: ");
        precio = Double.parseDouble(teclado.nextLine());

        do {
            System.out.print("Introduce el tipo de producto siendo posible solo A, B , C :  ");
            tipo = teclado.nextLine().charAt(0);
        }while(tipo != 'a' && tipo != 'b' && tipo != 'c' );

        //Comparamos, si es tipo 'a' siempre será un 7%, si es tipo C o bien es menor a 500 se le realiza un 12%, si es otro tipo distinto se le aplica un 0,9.

        if (tipo=='a'){
            System.out.println("Se le realiza un 7% de descuento");
            total = precio * 0.7;
            System.out.println("El producto se queda en " + total);
        }else if (tipo == 'c' || precio < 500){                     //Con else if no verificamos cada una de los "if"
            System.out.println("Se aplicara el 12% ");
            total = precio * 0.12;
            System.out.println("El producto se queda en  " + total);
        }else if (tipo == 'b' || precio > 500){
            System.out.println("Se aplicara el 9% ");
            total = precio * 0.9;
            System.out.println("El producto se queda en " + total);
        }

        teclado.close();
    }

}
