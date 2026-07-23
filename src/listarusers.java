import java.util.ArrayList;
public class listarusers extends cadusuario{
    ArrayList<cadusuario> ListaPrincipal = new ArrayList<>();


    //Metodos de gerenciamento (recebimento do usuario)
    public void ReceberUser(cadusuario usuario) {

        ListaPrincipal.add(usuario);

    }

    public void ListarUsuarios(){
        for (cadusuario Users : ListaPrincipal) {

            getNome();
            getEmail();
            getIdade();

        }

    }

}




