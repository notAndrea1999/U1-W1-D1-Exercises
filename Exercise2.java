import java.util.Scanner;

public class Exercise2 {
    public static String concat(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Ciao benvenuto a questa prima lezione di Java!!");
        System.out.println("Facciamo un gioco, segui le mie istruzioni. Prima di tutto, come ti chiami");
        String name = userInput.nextLine();
        System.out.println("Benvenuto " + name);
        System.out.println("Dovrai inserire 3 parole, vai con la prima..");
        String firstStr = userInput.nextLine();
        System.out.println("Din, din ,din perfetto!! Vai " + name + " metti la seconda parola");
        String secondStr = userInput.nextLine();
        System.out.println("Ottimo!! Vai  " + name + " sei pronto per mettere la terza");
        String thirdStr = userInput.nextLine();
        System.out.println("Le tue tre parole formano la frase: " + concat(firstStr + " ", secondStr + " ", thirdStr));
    }

}
