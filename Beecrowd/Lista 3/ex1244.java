import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ex1244 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0 ; i<n ; i++){
            String string = scanner.nextLine();
            String[] palavra = string.split(" ");
            List<String> lista = new ArrayList<>(Arrays.asList(palavra));
            while(!lista.isEmpty()) {
                String maior = "";
                for(String x : lista) {
                    if (x.length() > maior.length()) {
                        maior = x;
                    }
                }
                System.out.printf("%s",maior);
                lista.remove(maior);
                if(!lista.isEmpty()) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}