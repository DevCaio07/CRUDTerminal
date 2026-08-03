
public static void main(String[] args) {
    //Objetos para que eu possa acessar a classe
    Scanner menu = new Scanner(System.in);
    listarusers Usuario = new listarusers();
    Buscarusers Buscarelemento = new Buscarusers();


    while (true) {
        System.out.print("============ MENU ==============\n");
        System.out.print("| Opção 1 - New User           |\n");
        System.out.print("| Opção 2 - List User          |\n");
        System.out.print("| Opção 3 - Search User        |\n");
        System.out.print("| Opção 4 - Update User        |\n");
        System.out.print("| Opção 5 - Delete User        |\n");
        System.out.print("| Opção 0 - Sair               |\n");
        System.out.print("================================\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();
        if (opcao == 0) {
            System.out.print("Até logo");
            menu.close();
            return;
        }

        switch (opcao) {

            case 1:
                cadusuario usuarioaleatory = new cadusuario();
                //Aqui chamo todos os metodos,comecando pelo objeto criado para a classe um ponto e depois o metodo
                // desejado.
                utilidades.LimparInterface();
                utilidades.cabecalho("CADASTRO USUÁRIO");
                usuarioaleatory.receberName();
                usuarioaleatory.receberemail();
                usuarioaleatory.receberIdade();
                usuarioaleatory.receberSenha();
                Usuario.ReceberUser(usuarioaleatory);
                // aqui uso o break para encerrar o programa depois de executar todos os metodos, mas posso usar o return
                // para ele retornar ao menu principal
                break;
            case 2:
                utilidades.LimparInterface();
                utilidades.cabecalho("LISTA DE USUÁRIOS");
                Usuario.ListarUsuarios();
                break;
            case 3:
                System.out.print("\nOpção de pesquisa selecionado");
                utilidades.LimparInterface();
                utilidades.cabecalho("PESQUISAR USUÁRIO");
                Buscarelemento.buscarusuaario();

                break;
            case 4:
                System.out.print("\nOpção de atualizacao de usuario selecionado");
                utilidades.LimparInterface();
                utilidades.cabecalho("ATUALIZAR USUÁRIO");
                Usuario.BuscaruserID();
                break;
            case 5:
                System.out.print("\nOpção deletar usuario selecionado");
                utilidades.LimparInterface();
                utilidades.cabecalho("DELETAR USUÁRIO");
                break;
            default:
                System.out.print("\nEssa opção não existe");
                break;
        }


    }



}











