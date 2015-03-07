import java.util.Scanner;

public class Taschenrechner
{

    public static void main (String[] args)
    {

        int z1, z2, erg;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Erste Zahl einegben");
        z1 = scanner.nextInt();

        System.out.println("Zweite Zahl eingeben");
        z2  = scanner.nextInt();

        erg = z1 + z2;
        System.out.println("Das Ergebnis ist "  + erg);


    }
}