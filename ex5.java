public class ex5 {
    public static void main(String[] args) {
        long somaIm = 0, multPa = 1;
        
        for (int i = 1; i <= 30; i++){
            if (i % 2 == 1){
                somaIm += i;
            }
            else {
                multPa *= i;
            }
        }
        System.out.println("Resultado soma: " + somaIm);
        System.out.println("Resultado multiplicação: " + multPa);
    }
}    