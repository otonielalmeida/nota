package visao;
import modelo.Circunferencia;
import java.util.Scanner;
public class Visao {
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        Scanner read = new Scanner(System.in);
        System.out.println("Valor do raio: ");
        c1.setRaio(read.nextDouble());
        System.out.println(c1.Total());
    }
}
