import java.io.IOException;
import java.util.Scanner;

public class ex1182 {

    public static void main(String[] args) throws IOException {
        // Delcarando variáveis
        double[][] m = new double[12][12];
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        char t = scanner.next().charAt(0);

        // Começando código
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }
        if (t == 'S') {
            double soma = 0;
            for (int i = 0; i < m.length; i++) {
                soma += m[i][c];
            }
            System.out.printf("%.1f%n", soma);
        } else if (t == 'M') {
            double media = 0;
            for (int i = 0; i < m.length; i++) {
                media += m[i][c];
            }
            media = media / m.length;
            System.out.printf("%.1f%n", media);
        }
        scanner.close();
    }
}
