import java.util.Arrays;
import java.util.Scanner;

public class ex2381 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();

		String[] nomes = new String[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = scanner.next();
		}
		Arrays.sort(nomes);

			String pessoaSorteada = nomes[K -1];

			System.out.println(pessoaSorteada);

	}
}