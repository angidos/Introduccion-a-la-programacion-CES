package tema01_primer_programa;

public class Admin extends Usuario{
    public Admin(String nombre, String apellido, String email,String contrasena, String repetirContrasena, String paisNacimiento, String perfil){
        super(nombre, apellido, email, contrasena, repetirContrasena, paisNacimiento, perfil);
    }
    @Override
    public String obtenerPermisos() {
        return "Puede gestionar usuarios y acceder a funciones administrativas.";
    }
}
