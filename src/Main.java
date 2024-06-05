import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                n1 = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = sc.nextInt();
                Contador contador = new Contador(n1, n2);
                contador.contar();
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        } while (n1 > n2);
    }
}