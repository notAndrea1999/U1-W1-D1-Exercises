import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int moltiplicazione = mult(20, 5);
        System.out.println("Il risultato della tua moltiplicaizone e': " + moltiplicazione);

        String concatenazione = conc("Quanti gatti possiede Mario? ", 6);
        System.out.println(concatenazione);

        String[] arrayDiStringhe = new String[5];
        System.out.println("Il tuo nuovo array e': " + Arrays.toString(arrManipulation(arrayDiStringhe, "ventitre")));


    }

    public static int mult(int n1, int n2) {
        return n1 * n2;
    }

    public static String conc(String s1, int n1) {
        return s1 + n1;
    }

    public static String[] arrManipulation(String[] s1, String s2) {
        String[] newArr = {"uno", "due", "tre", "quattro", "cinque", "sei"};
        newArr[2] = s2;
        return newArr;
    }
}
