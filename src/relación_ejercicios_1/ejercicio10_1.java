package relación_ejercicios_1;

import java.util.Scanner;

public class ejercicio10_1 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;
        char signo;
        int total;
        /*Pedimos los numeros y el signo por teclado, podriamos decir que si no fuera los signos que queremos vuelva a pedirlo.
         */
        System.out.println("Introduce el primer número");
        num1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce el segundo número");
        num2 = Integer.parseInt(teclado.nextLine());
        do {
             System.out.println("Introduce el signo ");
            signo = teclado.nextLine().charAt(0);
        }while(signo != 'x' && signo != '+' && signo != '-' && signo != '/' );

        /*
        Con esto evaluamos, que si el signo introducido es una x, +, -, /, entonces nos realiza los que tenemos dentro de cada caso
         */

        switch (signo) {
            case 'x':
                total=num1*num2;
                System.out.printf(num1 + "x" + num2 + "=" + total);
                break; //Break para que salga del caso.
            case '+':
                total=num1+num2;
                System.out.printf(num1 + "+" + num2 + "=" + total);
                break;
            case '-':
                total=num1-num2;
                System.out.printf(num1 + "-" + num2 + "=" + total);
                break;
            case '/':
                if (num1 == 0 ||  num2 == 0){ // Con esto intento que si es 0 nos de un error
                    System.out.printf("No se puede dividir 0 entre 0, ya que si tenemos 0 galletas y dividimos entre 0 amigos, no tienes amigos ni galletas");
                }else {
                    total = num1 / num2;
                    System.out.printf(num1 + "/" + num2 + "=" + total);
                    break;
                }
            default:
                System.out.printf("Error");
        }

        teclado.close();
    }
}
