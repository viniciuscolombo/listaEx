import javax.swing.JOptionPane;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)){
            Integer idade;

            System.out.println("Informe a idade da pessoa: ");
            idade = entrada.nextInt();

            if ((idade > 0) && (idade < 3)){
                JOptionPane.showMessageDialog(null,"Essa pessoa é um bebê");
            }

            if ((idade > 4) && (idade < 9)){
                JOptionPane.showMessageDialog(null,"Essa pessoa é uma criança");
            }

            if ((idade > 10) && (idade < 13)){
                JOptionPane.showMessageDialog(null,"Essa pessoa é um pré-Adolescente");
            }

            if ((idade > 14) && (idade < 17)){
                JOptionPane.showMessageDialog(null,"Essa pessoa é um adolescente");
            }

            if ((idade > 18) && (idade < 65)){
                JOptionPane.showMessageDialog(null,"Essa pessoa é um adulto");
            }

            if ((idade > 65) && (idade < 125)){
                JOptionPane.showMessageDialog(null,"Essa pessoa é um idoso");
            }

            if (idade > 125){
                JOptionPane.showMessageDialog(null,"Essa pessoa provavelmente já morreu");
            }
        }
    }
}
