import java.util.Scanner;

public class ex2{

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        Double Bmaior,bmenor,h,A;
        System.out.println("Informe o valor de base maior: ");
        Bmaior = input.nextDouble();
        System.out.println("Informe o valor de base menor: ");
        bmenor = input.nextDouble();
        System.out.println("Informe a altura");
        h = input.nextDouble();

        A = h*((Bmaior + bmenor)/2);
        System.out.println("A área exata do trapezio é: " +A);
        System.out.println("A área arredondada do trapezio é: " + Math.round(A) );
    }
} 