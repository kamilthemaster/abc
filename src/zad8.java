import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj długość pokoju nr1");
        double lenght1 = scan1.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj szerokość pokoju nr1");
        double width1 = scan2.nextDouble();

        double room1 = lenght1 * width1;

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Podaj długość pokoju nr2");
        double lenght2 = scan3.nextDouble();

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Podaj szerokość pokoju nr2");
        double width2 = scan4.nextDouble();

        double room2 = lenght2 * width2;

        double flat = room1 + room2;

        System.out.println("Mieszkanie ma powierzchnię " + flat + "mkw.");

    }
}
