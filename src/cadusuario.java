import java.util.Random;
import java.util.Scanner;

public class cadusuario {

    private String nome;
    private String email;
    private int idade;
    private String senha1;
    private int IDuser;
    private String senha2;
    Scanner scanner = new Scanner(System.in);


    // funcoes para recebimento dos dados!


    @Override
    public String toString() {
        return  "Nome: " + getNome() +
                "\nEmail: " + getEmail() +
                "\nIdade: " + getIdade() +
                "\nID: " + getIDuser();


    }

    public void receberName() {
        System.out.printf("Informe seu Nome completo: ");
        nome = scanner.nextLine();
    }

    public void receberemail() {
        System.out.printf("Digite seu E-mail: ");
        email = scanner.nextLine();
    }

    public void receberIdade() {
        System.out.printf("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        if (idade < 18) {
            System.out.println("É nescessario ser maior de 18 anos ");


        } else {
            System.out.println("Prossiga com seu cadastro!");
        }

    }

    public void receberSenha() {

        System.out.printf("Digite a senha: ");
        senha1 = scanner.nextLine();

        System.out.printf("Digite novamente a senha: ");
        senha2 = scanner.nextLine();

        if (senha1.equals(senha2)) {
            System.out.println("Senha cadastrada com sucesso!");
        } else {
            System.out.println("As senhas não coincidem.");
        }



}
    public int receberId() {
        Random gerarId = new Random();
        IDuser = gerarId.nextInt(1000);
        return 0;
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
    public String getSenha1(){

        return senha1;
    }
    public void setSenha1(String senha1){

        this.senha1 = senha1;
    }
    public int getIDuser(){

        return IDuser;
    }
    public void setIDuser(int IDuser){ 

        this.IDuser = IDuser;
    }

    public String getSenha2(){
        return senha2;
    }
    public void setSenha2(String senha2){
        this.senha2 = senha2;
    }


}













