package tema01_primer_programa;


public abstract class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private String repetirContrasena;
    private String paisNacimiento;
    private String perfil;

    public Usuario(){

    }

    public Usuario(String nombre, String apellido, String email, String contrasena, String repetirContrasena, String paisNacimiento, String perfil) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.repetirContrasena = repetirContrasena;
        this.paisNacimiento = paisNacimiento;
        this.perfil = perfil;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getContrasena(){
        return contrasena;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }

    public String getRepetirContrasena() {
        return repetirContrasena;
    }
    public void setRepetirContrasena(String repetirContrasena) {
        this.repetirContrasena = repetirContrasena;
    }

    public String getPaisNacimiento(){
        return paisNacimiento;
    }
    public void setPaisNacimiento(String paisNacimiento){
        this.paisNacimiento = paisNacimiento;
    }

    public String getPerfil(){
        return perfil;
    }
    public void setPerfil(String perfil){
        this.perfil = perfil;
    }

    public abstract String obtenerPermisos();

}
