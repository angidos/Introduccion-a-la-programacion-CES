package tema01_primer_programa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        SistemaUsuarios sistema = new SistemaUsuarios();

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
                    String nombre = scanner.next();

                    System.out.print("Ingrese apellido: ");
                    String apellido = scanner.next();

                    System.out.print("Ingrese email: ");
                    String email = scanner.next();

                    System.out.print("Ingrese contraseña: ");
                    String contrasena = scanner.next();

                    System.out.print("Confirme la contraseña: ");
                    String repetirContrasena = scanner.next();

                    if (!contrasena.equals(repetirContrasena)) {
                        System.out.println("Las contraseñas no coinciden");
                        break;
                    }

                    System.out.print("Ingrese pais de nacimiento: ");
                    String paisNacimiento = scanner.next();

                    System.out.println("Seleccione tipo de usuario:");
                    System.out.println("1 - Administrador");
                    System.out.println("2 - Tester");
                    int tipoUsuario = scanner.nextInt();

                    Usuario nuevoUsuario;

                    if (tipoUsuario == 1) {
                        nuevoUsuario = new Admin(
                                nombre,
                                apellido,
                                email,
                                contrasena,
                                repetirContrasena,
                                paisNacimiento,
                                "Administrador"
                        );
                    } else {
                        nuevoUsuario = new Tester(
                                nombre,
                                apellido,
                                email,
                                contrasena,
                                repetirContrasena,
                                paisNacimiento,
                                "Tester"
                        );
                    }

                    boolean registrado = sistema.registrarUsuario(nuevoUsuario);

                    if (registrado) {
                        System.out.println("Usuario registrado correctamente");
                    } else {
                        System.out.println("No fue posible registrar el usuario. Puede que el email ya exista o no haya espacio disponible.");
                    }

                    break;
                case 2:
                    System.out.println("=== Login ===");

                    System.out.println("Ingrese su email: ");
                    emailLogin = scanner.next();

                    System.out.println("Ingrese su contraseña");
                    contrasenaLogin = scanner.next();

                    Usuario usuarioEncontrado = sistema.buscarUsuarioPorEmail(emailLogin);

                    if(usuarioEncontrado == null) {
                    System.out.println("El usuario no existe.");

                    break;
                    }

                    if (contrasenaLogin.equals(usuarioEncontrado.getContrasena())) {
                        System.out.println("Login exitoso");
                        System.out.println("Bienvenido/a " + usuarioEncontrado.getNombre());
                        System.out.println("Perfil: " + usuarioEncontrado.getPerfil());
                    }   else {
                    System.out.println("Contraseña incorrecta");
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
