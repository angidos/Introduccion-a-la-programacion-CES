package tema03_variablesytipos;

import java.util.Scanner;

public class DatosDePrueba {
    public static void main(String[] args) {
        // Declarar variables
        boolean loguinExitoso = true;
        int cantidadDeErrores = 0;
        double tiempoDeRespuesta = 1.35;
        char ambiente = 'Q';


        String usuario = "admin";
        String password = "1234";

        System.out.println("Usuario: " + usuario);
        System.out.println("Password:" + password);
        System.out.println("Ambiente:" + ambiente);
        System.out.println("Tiempo de respuesta:" + tiempoDeRespuesta + " segundos");

        double resultado = 0.0/ 0.0;

        if (Double.isNaN(resultado)) {
            System.out.println("Resultado invalido: " + resultado);
        } else {
            System.out.println("Resultado: " + resultado);
        }

    }
}