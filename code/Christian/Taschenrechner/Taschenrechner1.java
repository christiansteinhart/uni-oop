import java.util.Scanner;

public class Taschenrechner1
{
    public static void main(String[] args)
    {
        float wert1, wert2, ergebnis;
        String rechenart;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte ersten Wert eingeben:");
        wert1 = scanner.nextFloat();

        System.out.println("Bitte zweiten Wert eingeben:");
        wert2 = scanner.nextFloat();

        System.out.println("Bitte Rechenart eingeben:");
        rechenart = scanner.next();

        if (rechenart.equals("+")) {
            ergebnis = wert1 + wert2;
        } else if (rechenart.equals("-")) {
            ergebnis = wert1 - wert2;
        } else if (rechenart.equals("/")) {
            ergebnis = wert1 / wert2;
        } else if (rechenart.equals("*")) {
            ergebnis = wert1 * wert2;
        } else {
            System.out.println("Ungültige Rechenart angegeben");
            return;
        }

        System.out.println("Das Ergbenis ist: " + ergebnis);
    }
}