package visao;
import modelo.Variavel;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Variavel v1 = new Variavel();
        Scanner read = new Scanner(System.in);
        System.out.println("Valor da variavel: ");
        v1.setVar(read.nextDouble());
        System.out.println(v1.Total());
    }
}
