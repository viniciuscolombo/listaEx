import java.util.Scanner;

public class ex {
        public static void main(String[] args){
        try(Scanner entrada = new Scanner(System.in)){
            Integer idade;
            String Sexo;

            System.out.print("Informe a idade: ");
            idade = entrada.nextInt();

            System.out.print("Informe o sexo (M ou F): ");
            Sexo = entrada.next();

            if ((idade >= 17) && (Sexo.equals("M"))){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}