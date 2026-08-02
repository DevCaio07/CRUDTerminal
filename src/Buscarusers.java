
import java.util.Scanner;

public class Buscarusers {
    Scanner scanner = new Scanner(System.in);

    // Funcao para pegar o ID pelo numero digitado
    public void buscarusuaario () {

        System.out.println("Digite o ID do usuário que deseja buscar: ");
        int UsuariobuscarID = scanner.nextInt();

        listarusers.ListaPrincipal.stream()
                .forEach(System.out ::println);


    }


}
