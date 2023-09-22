import java.io.IOException;
import java.util.Scanner;

public class ex1183 {

    public static void main(String[] args) throws IOException {
        // Delcarando variáveis
        double[][] m = new double[12][12];
        Scanner scanner = new Scanner(System.in);
        char O = scanner.next().charAt(0);
        int aux;

        // Começando código
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }
        aux = 1;
        int j = 1;
        if (O == 'S') {
            double soma = 0;
            for (int i = 0+1; i < m.length; i++) {
                for (; j < m.length; j++) {
                    soma += m[i][j];
                }
                j = aux++;
            }
            System.out.printf("%.1f%n", soma);
        } else if (O == 'M') {
            double media = 0;
            int cont = 0;
            for (int i = 0+1; i < m.length; i++) {
                for (; j < m.length; j++) {
                    media += m[i][j + 1];
                    cont++;
                }
                j = aux++;
            }
            media = media / cont;
            System.out.printf("%.1f%n", media);
        }
        System.out.println();
        scanner.close();
    }
}
