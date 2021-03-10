package visao;
import modelo.Numero;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Numero n1 = new Numero();
        Scanner read = new Scanner(System.in);
        System.out.println("Numero A: ");
        n1.setA(read.nextDouble());
        System.out.println("Numero B: ");
        n1.setB(read.nextDouble());
        System.out.println(n1.ab());
    }
}
