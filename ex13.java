import javax.swing.JOptionPane;

public class ex13 {
    public static void main (String[] args) {
        String aux = "";
        float altura = 0, peso = 0, IMC;

        try {
            aux = JOptionPane.showInputDialog("Informe a sua altura: ");
            altura = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Informe o seu peso: ");
            peso = Float.parseFloat(aux);

            IMC = peso / (altura * altura);
            JOptionPane.showMessageDialog(null,"IMC: " + IMC);

            if (IMC < 18.5){
                JOptionPane.showMessageDialog(null,"Abaixo do Peso");
            }

            if ((IMC >= 18.5) && (IMC <= 24.9)){
                JOptionPane.showMessageDialog(null,"Peso Normal");
            }

            if ((IMC >= 25) && (IMC <= 29.9)){
                JOptionPane.showMessageDialog(null,"Sobrepeso");
            }

            if ((IMC >= 30) && (IMC <= 34.9)){
                JOptionPane.showMessageDialog(null,"Obesidade Grau I");
            }

            if ((IMC >= 35) && (IMC <= 39.9)){
                JOptionPane.showMessageDialog(null,"Obesidade Grau II");
            }

            if (IMC >= 40){
                JOptionPane.showMessageDialog(null,"Obesidade Grau III ou Mórbida");
            }
        }
        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Dados Incorretos");
        }
    }
}
