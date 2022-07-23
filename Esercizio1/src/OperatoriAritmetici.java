import java.util.Scanner;

public class OperatoriAritmetici {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("inserisci il primo numero");
        double numero1 = sc.nextInt();
        System.out.println("inserisci il secondo numero");
        double numero2= sc.nextInt();
        operazioniAritmetiche(numero1, numero2);
    }
    public static void operazioniAritmetiche(double numero1, double numero2){
        if (numero1>numero2)
        System.out.println("addizione: "+ (numero1+numero2)+"\n"
                            +"sottrazione: "+ (numero1-numero2)+"\n"
                             + "moltiplicazione: "+ (numero1*numero2)+"\n"+
                                "divione: "+ (numero1/numero2));
        else {
            System.out.println("addizione: "+ (numero1+numero2)+"\n"
                    +"sottrazione: "+ (numero2-numero1)+"\n"
                    + "moltiplicazione: "+ (numero1*numero2)+"\n"+
                    "divione: "+ (numero2/numero1));

        }


    }
}
