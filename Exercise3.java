public class Exercise3 {
    public static void main(String[] args) {
        double rectanglePerimeter = perimeter(23.75, 13.86);
        System.out.println(rectanglePerimeter);

        int isItEvenOrOdd = evenOdd((int) Math.floor(Math.random() * 100));
        System.out.println("Se esce 0 il numero e' pari se esce 1 e' dispari : " + isItEvenOrOdd);

        double calculatingArea = tringleArea(45.8, 35.3, 22.9);
        System.out.println("L'area del tringolo e': " + calculatingArea);
    }

    public static double perimeter(double n1, double n2) {
        return (n1 + n2) * 2;

    }

    public static int evenOdd(int n1) {
        if (n1 % 2 == 0) {
            return 0; // numero pari
        } else {
            return 1; // numero dispari
        }
    }

    public static double tringleArea(double n1, double n2, double n3) {
        return Math.sqrt((n1 + n2 + n3) * (-n1 + n2 + n3) * (n1 - n2 + n3) * (n1 + n2 - n3)) / 4;
    }

}
