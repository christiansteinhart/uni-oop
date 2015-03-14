import java.util.Scanner;

public class Taschenrechner3Test {
    public static void main(String[] args)
    {
        Taschenrechner3 tr = new Taschenrechner3();

        System.out.print("Test 3 + 5 = ");
        System.out.print(tr.add(3, 5));
        System.out.println(tr.add(3, 5) == 8 ? " OK" : " ERROR");

        System.out.print("Test 16 - 7 = ");
        System.out.print(tr.sub(16, 7));
        System.out.println(tr.sub(16, 7) == 9 ? " OK" : " ERROR");

        System.out.print("Test 20 / 5 = ");
        System.out.print(tr.div(20, 5));
        System.out.println(tr.div(20, 5) == 4 ? " OK" : " ERROR");

        System.out.print("Test 3 * 7 = ");
        System.out.print(tr.mul(3, 7));
        System.out.println(tr.mul(3, 7) == 21 ? " OK" : " ERROR");
    }
}

