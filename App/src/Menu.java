import java.util.ArrayList;

public class Menu {

    public void ImprimirMenu(){
        System.out.println("Imprimir menu de cadastro.");
    }

    public void ImprimirUsuario(ArrayList<Usuario> usuarios) {

        for (Usuario user : usuarios) {
            System.out.println("Nome: " + user.nome);
        }

    }

}