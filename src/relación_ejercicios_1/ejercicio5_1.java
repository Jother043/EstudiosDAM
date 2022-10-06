package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio5_1 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int num1,num3,num2,num4;

        System.out.printf("Introduce el numero1");
        num1 = Integer.parseInt(teclado.nextLine());

        System.out.printf("Introduce el numero1");
        num2 = Integer.parseInt(teclado.nextLine());

        System.out.printf("Introduce el numero1");
        num3 = Integer.parseInt(teclado.nextLine());

        System.out.printf("Introduce el numero1");
        num4 = Integer.parseInt(teclado.nextLine());

        //Se le pone una f en el 4 para vonvertirlo en float ya que necesitamos float porque la media no es entera

        float media = (num1 + num2 + num3 + num4)/4f;

        System.out.printf("La media es ");

        teclado.close();
    }

}
