import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            Double salario, numHor;
        
            System.out.println("Informe o número de horas trabalhadas: ");
            numHor = entrada.nextDouble();

            salario = (10.25 * numHor);

            System.out.println("O seu salário é de: R$" + salario );
        }        
    }
}
