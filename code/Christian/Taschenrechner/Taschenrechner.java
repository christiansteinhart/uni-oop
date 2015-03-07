import java.util.Scanner;

public class Taschenrechner
{
    public static void main(String[] args)
    {
        int summand1, summand2, ergebnis;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte ersten Summanden eingeben:");
        summand1 = scanner.nextInt();

        System.out.println("Bitte zweiten Summanden eingeben:");
        summand2 = scanner.nextInt();

        ergebnis = summand1 + summand2;
        System.out.println("Das Ergbenis ist: " + ergebnis);
    }
}