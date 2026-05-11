package tema03_variablesytipos;

import java.util.Scanner;

public class PracticandoScan {

    public static void main(String[] args) {

        System.out.println("Ingrese su nombre");

        String nombre;

        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();

        int edad;
        System.out.println("Ingrese su edad");

        edad = scan.nextInt();

        System.out.println("Nombre " + nombre + " Edad: " + edad);

    }
}
