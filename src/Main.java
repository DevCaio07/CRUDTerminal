import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner menu = new Scanner(System.in);
        System.out.print("##--Teste Estrutura de Menu--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Cadastrar Usuario     |\n");
        System.out.print("| Opção 2 - Listar usuario           |\n");
        System.out.print("| Opção 3 - Buscar usuario         |\n");
        System.out.print("| Opção 4 - Atualizar usuario         |\n");
        System.out.print("| Opção 5 - Remover usuario         |\n");
        System.out.print("| Opção 0 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Opcao de cadastro selecionada!");
                break;

            case 2:
                System.out.println("Opcao de listagem selecionada!");
                break;

            case 3:
                System.out.println("Opção de Busca selecionada");
                break;

            case 4:
                System.out.println("Opção de remoção de usuário selecionada");
                break;

            default:
                System.out.println("Opção selecionada é invalida");
                break;

            case 5:
                System.out.print("\nAté logo");
                menu.close();
        }


    }

}