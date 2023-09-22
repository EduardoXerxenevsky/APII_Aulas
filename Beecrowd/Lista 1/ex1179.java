import java.util.Scanner;

public class ex1179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int numero, ii = 0, ip = 0;
        
        for (int i = 0; i < 15; i++) {
            numero = scanner.nextInt();
            if (numero % 2 == 1) {
                impar[ii] = numero;
                ii++;
            }else {
                par[ip] = numero;
                ip++;
            }
            if (ip == 5) {
                ip = 0;
                for (int j = 0; j < par.length; j++) {
                    System.out.println("par[" + j + "] = " + par[j]);
                }

            }
            if (ii == 5) {
                ii = 0;
                for (int j = 0; j < impar.length; j++) {
                    System.out.println("impar[" + j + "] = " + impar[j]);
                }
            } 
        }
        for(int i = 0; i <ii;i++){
            System.out.println("impar["+i+"]"+impar[i]);
        }
        for(int i = 0; i <ip;i++){
            System.out.println("par["+i+"]"+par[i]);
        }
    }
}