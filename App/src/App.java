import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario user1 = new Usuario("Luiz", "Henrique", 33, "07/02/2000", "3344556677");
        Usuario user2 = new Usuario("Alberto", "Carlos", 77, "07/02/2000", "3344556677");
        Usuario user3 = new Usuario("Luiz", "Henrique", 33, "07/02/2000", "3344556677");
    
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
    }
}
