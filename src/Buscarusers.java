// importando o pack java collections
import java.util.Scanner;

public class Buscarusers {
    // O scanner é usado para receber o dado do usuario(a digitacao do usuario)
    Scanner scanner = new Scanner(System.in);

    // Funcao para pegar o ID pelo numero digitado
    public void buscarusuaario () {

        System.out.println("Digite o ID do usuário que deseja buscar: ");
        // Usado para pegar o que o usuario digita e alocar em uma variavel
        int UsuariobuscarID = scanner.nextInt();

        // O stream é usado para passar por todos os itens de uma lista, um por um.
        listarusers.ListaPrincipal.stream()
                .forEach(System.out ::println);


    }


}
