package visao;
import modelo.Pos;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Pos p1 = new Pos();
        Scanner read = new Scanner(System.in);
        System.out.println("Numero:");
        p1.setNumero(read.nextDouble());
        System.out.println(p1.num());


        }
    }

