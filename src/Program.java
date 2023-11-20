import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número ");
            vetor[i] = sc.nextDouble();
        }
        double maior = vetor[0];
        int posMaior = 0;
        for (int i = 0; i < n; i++) {
            if  (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }
        System.out.printf("Maior valor %.1f%n", maior);
        System.out.printf("Posição do maior valor %d%n", posMaior);
        sc.close();
    }

}
