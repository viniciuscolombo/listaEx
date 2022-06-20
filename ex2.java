//A = h*((Bmaior + bmenor)/2);
//System.out.println("A área exata do trapezio é: " +A);
//System.out.println("A área arredondada do trapezio é: " + Math.round(A) );

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            Double h, bMaior, bMenor, area; 

            System.out.println("========= Dados ========="); 

            System.out.print("Informe a altura: ");
            h = entrada.nextDouble();

            System.out.print("Informe a base menor: ");
            bMenor = entrada.nextDouble();

            System.out.print("Informe a base maior: ");
            bMaior = entrada.nextDouble();
            
            area = (h * (bMenor + bMaior)) / 2;

            System.out.println("========= Resultados ========="); 
            System.out.println("Altura - > " + h); 
            System.out.println("Base menor - > " + bMenor); 
            System.out.println("Base menor - > " + bMaior); 
            System.out.println("Área - > " + area); 
            System.out.println("Área exata - > " + Math.round(area));
        }
    }

}
