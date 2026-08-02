import java.util.Scanner;
public class utilidades {



    public static void cabecalho(String titulo) {
        System.out.print("===============");
        System.out.print(titulo);
        System.out.println("===============");

    }

    public static void LimparInterface() {
        for (int i = 0; i < 26; i++) {
            System.out.println();
        }
    }

}
