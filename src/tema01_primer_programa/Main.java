package tema01_primer_programa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;
        String emailLogin;
        String contrasenaLogin;

        while (opcion != 3){

            System.out.println("Seleccione una opcion");
            System.out.println(" 1 Registro");
            System.out.println(" 2 Login");
            System.out.println(" 3 Salir");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("=== REGISTRO ===");

                    System.out.print("Ingrese nombre: ");
                    usuario1.nombre = scanner.next();

                    System.out.print("Ingrese apellido: ");
                    usuario1.apellido = scanner.next();

                    System.out.print("Ingrese email: ");
                    usuario1.email = scanner.next();

                    System.out.print("Ingrese contraseña: ");
                    usuario1.contrasena = scanner.next();

                    System.out.print("Confirme la contraseña: ");
                    usuario1.repetirContrasena = scanner.next();

                    if (!usuario1.contrasena.equals(usuario1.repetirContrasena)) {
                        System.out.println("Las contraseñas no coinciden");
                        break;
                    }

                    System.out.print("Ingrese pais de nacimiento: ");
                    usuario1.paisNacimiento = scanner.next();

                    usuario1.perfil = "Administrador";

                    System.out.println("Usuario registrado correctamente");
                    break;
                case 2:
                    System.out.println("=== Login ===");

                    if (usuario1.email == null) {
                        System.out.println("No existe un usuario registrado. Primero debe registrarse.");
                        break;2
                    }

                    System.out.println("Ingrese su email: ");
                    emailLogin = scanner.next();

                    System.out.println("Ingrese su contraseña");
                    contrasenaLogin = scanner.next();
                    if (emailLogin.equals(usuario1.email) && contrasenaLogin.equals(usuario1.contrasena)){
                        System.out.println("Login exitoso");
                    } else {
                        System.out.println("Email o contraseña invalidas");
                    }
                    break;
                case 3:
                    System.out.println(" 3 Salir");
                    break;
                default:
                    System.out.println("Opcion invalida!");
            }


        }


    }
}
