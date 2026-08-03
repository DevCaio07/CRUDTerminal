public class remooveusers extends listarusers {

    public void RemoverUsuario(){
        System.out.print("Digite o ID do usuario que deseja remover: ");
        int numeroDigitado = scanner.nextInt();
        cadusuario usuarioRemover = ListaPrincipal.stream()
                .filter(u -> u.getIDuser() == numeroDigitado)
                .findFirst()
                .orElse(null);

        if(usuarioRemover != null){
            ListaPrincipal.remove(usuarioRemover);
            System.out.println("Usuário removido com Sucesso");
        } else {
            System.out.println("Usuário não encontrado");
        }
    }


}
