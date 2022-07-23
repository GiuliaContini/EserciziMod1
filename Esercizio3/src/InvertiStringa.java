import java.util.Scanner;

public class InvertiStringa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci la stringa");
        String s = sc.nextLine();
        invertiStringa(s);

    }

    public static void invertiStringa(String s) {
        String[] split = s.split(" ");
        System.out.println(split[1] + " " + split[0]);
    }
}
