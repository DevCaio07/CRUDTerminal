import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
public class listarusers extends cadusuario{
   public static List<cadusuario> ListaPrincipal = new ArrayList<>();


    //Metodos de gerenciamento (recebimento do usuario)

    public void ReceberUser(cadusuario usuario) {

        ListaPrincipal.add(usuario);

    }


    public void ListarUsuarios(){
        ListaPrincipal.stream()
                .forEach(System.out :: println);




        }

}







