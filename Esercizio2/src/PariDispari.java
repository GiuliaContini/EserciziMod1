import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numero = sc.nextInt();
        pariDispari(numero);
    }

    public static void pariDispari(int numero) {
        if (numero == 0) {
            System.out.println("il numero e' pari");
        } else if (numero % 2 == 0) {
            System.out.println("il numero e' pari");

        } else {
            System.out.println("il numero e' dispari");
        }
    }
}
