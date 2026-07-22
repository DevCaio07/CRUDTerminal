import java.util.ArrayList;
import java.util.List;
public class listarusers extends cadusuario {

    List <cadusuario> listadeusers = new ArrayList<>();
    cadusuario User = new cadusuario();





    // Geteers and seeters
    public List<cadusuario> getListadeusers() {
        return listadeusers;
    }

    public void setListadeusers(List<cadusuario> listadeusers) {
        this.listadeusers = listadeusers;
    }
}
