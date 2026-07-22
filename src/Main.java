
void main(String[] args) {

    Scanner menu = new Scanner(System.in);
    listarusers Usuario = new listarusers();

    while (true) {
        System.out.print("##--Teste Estrutura de Menu--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - New User           |\n");
        System.out.print("| Opção 2 - List User          |\n");
        System.out.print("| Opção 3 - Search User        |\n");
        System.out.print("| Opção 4 - Update User        |\n");
        System.out.print("| Opção 5 - Delete User        |\n");
        System.out.print("| Opção 0 - Sair               |\n");
        System.out.print("|------------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();
        if (opcao == 0) {
            System.out.print("Até logo");
            menu.close();
        }

        switch (opcao) {

            case 1:
                System.out.print("\nOpção novo cadastro selecionado");
                cadusuario usuarioaleatory = new cadusuario();
                usuarioaleatory.receberName();
                usuarioaleatory.receberemail();
                usuarioaleatory.receberIdade();
                usuarioaleatory.receberSenha();
                Usuario.ReceberUser(usuarioaleatory);


                break;
            case 2:
                System.out.print("\nOpção de listagem selecionado");
                break;
            case 3:
                System.out.print("\nOpção de pesquisa selecionado");
                break;
            case 4:
                System.out.print("\nOpção de atualizacao de usuario selecionado");
                break;
            case 5:
                System.out.print("\nOpção deletar usuario selecionado");
                break;
            default:
                System.out.print("\nEssa opção não existe");
                break;
        }


    }



    }











