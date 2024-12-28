package Collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add (new Usuario("Pedro"));
        usuarios.add (new Usuario("Ana"));
        usuarios.add (new Usuario("Guilherme"));

        boolean resultado = usuarios.contains(new Usuario("Pedro"));
        if (resultado == true){
            System.out.println("Usuario adicionado");
        }else {
            System.out.println("Usuario não adicionado");
        }
        for (Usuario usuario : usuarios){
            if (usuario.nome.equals("Guilherme")){
                System.out.println("Usuario encontrado, seu Hashcode é: " + usuario.hashCode());
            }
        }
    }
}
