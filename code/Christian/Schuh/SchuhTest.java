import java.lang.System;

public class SchuhTest
{
    public static void main(String[] args)
    {
        Schuh a = new Schuh();

        a.setGroesse(42);
        a.setHersteller("Mike");
        a.setModellbezeichnung("Air Ultramatic");

        print(a);
    }

    private static void print(Schuh schuh)
    {
        System.out.println("Groesse: " + schuh.getGroesse());
        System.out.println("Hersteller: " + schuh.getHersteller());
        System.out.println("Modellbezeichnung: " + schuh.getModellbezeichnung());
    }
}