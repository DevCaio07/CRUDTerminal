import java.util.Scanner;
import java.util.Random;
public class cadusuario {

    private String nome;
    private String email;
    private int idade;
    private String senha1;
    private int IDuser;
    private String senha2;
    Scanner scanner = new Scanner(System.in);

    // funcoes para recebimento dos dados!
    public void receberName() {
        System.out.println("Informe seu Nome completo:");
        nome = scanner.nextLine();
        scanner.close();
    }

    public void receberemail() {
        System.out.println("Digite seu E-mail");
        email = scanner.nextLine();
    }

    public void receberIdade() {
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        if (idade < 18) {
            System.out.println("É nescessario ser maior de 18 anos ");


        } else {
            System.out.println("Prossiga com seu cadastro!");
        }

    }

    public void receberSenha() {
        System.out.println("Digite a senha desejada: ");
        senha1 = scanner.nextLine();

        System.out.println("Digite novamente a senha: ");
        senha2 = scanner.nextLine();

        boolean iguais = senha1.equals(senha2);


    }
    public int receberId(){
        Random gerarId = new Random();
        IDuser = gerarId.nextInt(50);
        System.out.printf("ID User" + IDuser +);
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













