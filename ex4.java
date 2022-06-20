import java.util.Scanner;

public class ex4 {

    public static void main(String[] args){
 
        boolean boolVar;
        int i = 1;

        boolVar = (1 > 2);
        System.out.println("a. (1 > 2): " + boolVar);

        boolVar = (8 == 8);
        System.out.println("b. (8 == 8): " + boolVar);

        boolVar = ((12 - 5) > 6);
        System.out.println("c. ((12 – 5) > 6): " + boolVar);

        boolVar = (0 < 3) && (8 < 9);
        System.out.println("d. (0 < 3) && (8 < 9): " + boolVar);

        boolVar = ((i++) > i);
        System.out.println("e. ((i++) > i): " + boolVar);

        boolVar = (10 * 90 / 50 - 2) == 16;
        System.out.println("f. (10 * 90 / 50 – 2) == 16: " + boolVar);
    }

}