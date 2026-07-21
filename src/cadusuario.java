import java.util.Scanner;
public class cadusuario {

    private String nome;
    private String email;
    private int idade;
    private String senha;
    private int IDuser;
    Scanner scanner = new Scanner(System.in);

    // funcoes para recebimento dos dados!
    public void receberName(){
        System.out.println("Informe seu Nome completo:");
        nome = scanner.nextLine();
        scanner.close();
    }

    public void receberemail(){
        System.out.println("Digite seu E-mail");
        email = scanner.nextLine();
  }

    public void receberIdade(){
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        if(idade < 18){
            System.out.println("É nescessario ser maior de 18 anos ");


        } else {
            System.out.println("Prossiga com seu cadastro!");
        }
    }
    //todos os Getters and Setters
    public String getNome(){

        return nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public String getEmail(){

        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getIdade(){

        return idade;
    }
    public void setIdade(int idade){

        this.idade = idade;
    }
    public String getSenha(){

        return senha;
    }
    public void setSenha(String senha){

        this.senha = senha;
    }
    public int getIDuser(){

        return IDuser;
    }
    public void setIDuser(int IDuser){ 

        this.IDuser = IDuser;
    }
}













