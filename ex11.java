import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            Double libra, quilo;

            System.out.println("Informe o peso em libras: ");
            libra = entrada.nextDouble();

            quilo = (libra * 0.454);

            System.out.println( libra + " libras correspondem a " + quilo + "KG");

            System.out.println("Informe o peso em quilos: ");
            quilo = entrada.nextDouble();

            libra = (quilo * 2.2);

            System.out.println( quilo + " quilos correspondem a " + libra + "lb");
        }
    }
}
