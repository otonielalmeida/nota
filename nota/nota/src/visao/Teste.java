package visao;
import modelo.Aluno;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Scanner read = new Scanner(System.in);
        System.out.println("Nome do Aluno(a): ");
        a1.setNome(read.nextLine());
        System.out.println("Nota 1: ");
        a1.setNotaUm(read.nextDouble());
        System.out.println("Nota 2: ");
        a1.setNotaDois(read.nextDouble());
        System.out.println("Nota 3: ");
        a1.setNotaTres(read.nextDouble());
        System.out.println(a1.calculoNotas());
    }
}
