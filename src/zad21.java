import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj kwotę pieniędzy początkowo zdeponowaną na koncie");
        double cashBefore = scan1.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj roczną stopę oprocentowania");
        double percents = scan2.nextDouble();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Podaj ile razy w roku odsetki są kapitalizowane");
        int capitalization = scan3.nextInt();

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Podaj liczbę lat, przez jakie środki będą się znajdować na koncie");
        int time = scan4.nextInt();

        double podstawa = cashBefore * (1 + percents/capitalization);
        double wykladnik = capitalization*time;

        double wynik = Math.pow(podstawa, wykladnik);

        System.out.println("Po danym czasie na koncie będzie " + wynik + "zł.");

    }
}
