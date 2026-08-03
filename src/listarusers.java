import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.List;
public class listarusers extends cadusuario{
    Scanner menuatualizar = new Scanner(System.in);

    //Estrutura de como cria uma lista em java
   public static List<cadusuario> ListaPrincipal = new ArrayList<>();



    //Metodos de gerenciamento (recebimento do usuario)

    public void ReceberUser(cadusuario usuario) {

        ListaPrincipal.add(usuario);
    }
    public void ListarUsuarios(){
        ListaPrincipal.stream()
                .forEach(System.out :: println);
        }



    // METODO PARA BUSCAR USUARIO PELO ID
    public void BuscaruserID(){
        System.out.println("Digite o numero do ID do usuario: ");
        int id = scanner.nextInt();
        cadusuario usuario = ListaPrincipal.stream()
                .filter(u -> u.getIDuser() == id)
                .findFirst()
                .orElse(null);

        if (usuario != null){

            while(true){
                System.out.print("1- Atualizar Nome:  \n");
                System.out.print("2- Atualizar Email: \n");
                System.out.print("3- Atualizar Idade: \n");
                System.out.print("4- Atualizar Senha: \n");
                System.out.print("5- Fechar menu      \n");
                System.out.print("Digite a opcão desejada: \n");
                int opcaao = menuatualizar.nextInt();
                scanner.nextInt(); // Limpa o enter

                switch (opcaao){
                    case 1:
                        System.out.print("Digite o novo nome: ");
                        String novoNome = scanner.nextLine();
                        usuario.setNome(novoNome);
                        break;

                    case 2:
                        System.out.print("Digite o novo Email");
                        String novoEmail = scanner.nextLine();
                        usuario.setEmail(novoEmail);
                        break;

                    case 3:
                        System.out.print("Digite a nova idade: ");
                        int novaIdade = scanner.nextInt();
                        scanner.nextLine();
                        usuario.setIdade(novaIdade);
                        break;

                    case 4:
                        System.out.print("Digite a nova senha: ");
                        String novaSenha = scanner.nextLine();
                        usuario.setSenha2(novaSenha);
                        break;

                    case 5:
                        System.out.print("Volte sempre! ");
                        return;
                }

            }
        }

    }
}







