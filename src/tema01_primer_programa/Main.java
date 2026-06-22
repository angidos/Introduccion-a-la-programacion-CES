package tema01_primer_programa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        SistemaUsuarios sistema = new SistemaUsuarios();

        int opcion = -1;
        int opcionInterna;
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

                    Usuario nuevoUsuario = new Admin(
                            nombre,
                            apellido,
                            email,
                            contrasena,
                            repetirContrasena,
                            paisNacimiento,
                            "Administrador"
                    );

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

                        opcionInterna = -1;

                        while (opcionInterna != 5){

                            System.out.println("=== Accesos ===");
                            System.out.println("1 Crear usuario");
                            System.out.println("2 Reiniciar contraseña");
                            System.out.println("3 Listar usuarios");
                            System.out.println("4 Buscar usuario");
                            System.out.println("5 Cerrar sesión");

                            opcionInterna = scanner.nextInt();

                            switch(opcionInterna){

                                case 1:

                                    System.out.println("=== Alta de cuenta para Tester ===");

                                    System.out.print("Ingrese nombre: ");
                                    String nombreTester = scanner.next();
                                    System.out.print("Ingrese apellido: ");
                                    String apellidoTester = scanner.next();
                                    System.out.print("Ingrese email: ");
                                    String emailTester = scanner.next();
                                    System.out.print("Ingrese contraseña por defecto: ");
                                    String contrasenaTester = scanner.next();

                                    System.out.println("Seleccione pais de nacimiento:");
                                    System.out.println("Paraguay");
                                    System.out.println("Uruguay");
                                    System.out.println("Brasil");
                                    System.out.println("Argentina");
                                    String paisNacimientoTester = scanner.next();

                                    if (!paisNacimientoTester.equalsIgnoreCase("Paraguay") &&

                                            !paisNacimientoTester.equalsIgnoreCase("Uruguay") &&

                                            !paisNacimientoTester.equalsIgnoreCase("Brasil") &&

                                            !paisNacimientoTester.equalsIgnoreCase("Argentina")) {

                                        System.out.println("Campo pais de nacimiento vacío o inválido.");

                                        break;
                                    }

                                    System.out.println("Seleccione perfil de tester:");
                                    System.out.println("1 - Tester Junior");
                                    System.out.println("2 - Tester Senior");
                                    System.out.println("3 - Tester Lider");

                                    int opcionPerfil = scanner.nextInt();

                                    String perfilTester = "";

                                    switch (opcionPerfil) {

                                        case 1:
                                            perfilTester = "Tester Junior";
                                            break;
                                        case 2:
                                            perfilTester = "Tester Senior";
                                            break;
                                        case 3:
                                            perfilTester = "Tester Lider";
                                            break;
                                        default:
                                            System.out.println("No se ha seleccionado seniority");
                                            break;

                                    }
                                    if (perfilTester.equals("")) {
                                        break;
                                    }

                                    Usuario nuevoUsuarioTester = new Tester(
                                            nombreTester,
                                            apellidoTester,
                                            emailTester,
                                            contrasenaTester,
                                            contrasenaTester,
                                            paisNacimientoTester,
                                            perfilTester
                                    );

                                    boolean testerRegistrado = sistema.registrarUsuario(nuevoUsuarioTester);

                                    if (testerRegistrado) {
                                        System.out.println("Usuario tester creado correctamente");
                                    } else {
                                        System.out.println("No fue posible crear el usuario. Puede que el email ya exista.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("=== REINICIAR CONTRASEÑA ===");

                                    System.out.print("Ingrese el email del usuario: ");
                                    String emailReinicio = scanner.next();

                                    Usuario usuarioReinicio = sistema.buscarUsuarioPorEmail(emailReinicio);

                                    if (usuarioReinicio == null) {
                                        System.out.println("No se encontró un usuario con ese email.");
                                        break;
                                    }

                                    System.out.print("Ingrese nueva contraseña: ");
                                    String nuevaContrasena = scanner.next();

                                    System.out.print("Repita la nueva contraseña: ");
                                    String repetirNuevaContrasena = scanner.next();

                                    if (!nuevaContrasena.equals(repetirNuevaContrasena)) {
                                        System.out.println("Las contraseñas no coinciden.");
                                        break;
                                    }

                                    usuarioReinicio.setContrasena(nuevaContrasena);
                                    usuarioReinicio.setRepetirContrasena(repetirNuevaContrasena);

                                    System.out.println("Contraseña reiniciada correctamente.");
                                    break;

                                case 3:
                                    System.out.println("=== LISTADO DE USUARIOS ===");

                                    sistema.listarUsuarios();
                                    break;

                                case 4:
                                    System.out.println("=== BUSCAR USUARIO ===");

                                    System.out.print("Ingrese el email del usuario: ");
                                    String emailBuscar = scanner.next();

                                    Usuario usuarioBuscado = sistema.buscarUsuarioPorEmail(emailBuscar);

                                    if (usuarioBuscado == null) {
                                        System.out.println("No se encontró un usuario con ese email.");
                                    } else {
                                        System.out.println("Usuario encontrado:");
                                        System.out.println("Nombre: " + usuarioBuscado.getNombre());
                                        System.out.println("Apellido: " + usuarioBuscado.getApellido());
                                        System.out.println("Email: " + usuarioBuscado.getEmail());
                                        System.out.println("Perfil: " + usuarioBuscado.getPerfil());
                                    }
                                    break;

                                case 5:
                                    System.out.println("Sesión cerrada");
                                    break;

                                default:
                                    System.out.println("Opción inválida");
                            }
                        }

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
