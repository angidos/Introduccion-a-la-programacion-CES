package tema01_primer_programa;

public class SistemaUsuarios {

    Usuario[] usuarios = new Usuario[10];

    public SistemaUsuarios(){
        usuarios[0] = new Admin(
                "Admin",
                "Quintero",
                "admin@test.com",
                "123",
                "123",
                "Mexico",
                "Administrador"
        );
        usuarios[1] = new Tester(
                "Panda",
                "Tito",
                "tester@test.com",
                "big",
                "big",
                "Uruguay",
                "Tester"
        );
    }
    public Usuario buscarUsuarioPorEmail(String email){
        for (int i =0; i < usuarios.length; i++){
            if (usuarios[i] != null && usuarios[i].getEmail().equals(email)){
                return usuarios[i];
            }
        }
        return null;
    }

    public boolean registrarUsuario(Usuario nuevoUsuario){
        if (buscarUsuarioPorEmail(nuevoUsuario.getEmail()) != null){
            return false;
        }
        for (int i = 0; i < usuarios.length; i++){
            if (usuarios[i] == null){
                usuarios[i] = nuevoUsuario;
                return true;
            }
        }
        return false;
    }
}
