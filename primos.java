public class primos {
    public static void main(String[] args) {    
        for (int x = 2; x <= 123; x++) {
            if( checkPrimo(x) )
                System.out.println(x + " -> primo");
        }    
    }
 
    private static boolean checkPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                return false;   
        }
        return true;
    }
}