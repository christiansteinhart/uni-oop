import java.util.Scanner;

public class Taschenrechner2
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
            ergebnis = add(wert1, wert2);
        } else if (rechenart.equals("-")) {
            ergebnis = sub(wert1, wert2);
        } else if (rechenart.equals("/")) {
            ergebnis = div(wert1, wert2);
        } else if (rechenart.equals("*")) {
            ergebnis = mul(wert1, wert2);
        } else {
            System.out.println("Ungültige Rechenart angegeben");
            return;
        }

        System.out.println("Das Ergbenis ist: " + ergebnis);
    }

    private static float mul(float wert1, float wert2) {
        return wert1 * wert2;
    }

    private static float div(float wert1, float wert2) {
        return wert1 / wert2;
    }

    private static float sub(float wert1, float wert2) {
        return wert1 - wert2;
    }

    private static float add(float wert1, float wert2) {
        return wert1 + wert2;
    }

}