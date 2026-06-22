package tema01_primer_programa;

import java.util.ArrayList;

public class SistemaUsuarios {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    public SistemaUsuarios(){
        usuarios.add(new Admin("Admin","Quintero","admin@test.com","123","123","Mexico","Administrador"));
        usuarios.add(new Tester("Panda","Tito","tester@test.com","big","big","Uruguay","Tester"));
    }
    public Usuario buscarUsuarioPorEmail(String email){
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getEmail().equals(email)) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    public boolean registrarUsuario(Usuario nuevoUsuario){
        if (buscarUsuarioPorEmail(nuevoUsuario.getEmail()) != null){
            return false;
        }
        usuarios.add(nuevoUsuario);
        return true;
    }
    public void listarUsuarios(){
        for (int i = 0;i < usuarios.size(); i++){
            Usuario usuario = usuarios.get(i);

            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Perfil: " + usuario.getPerfil());
            System.out.println("--------------------------");
        }
    }
}