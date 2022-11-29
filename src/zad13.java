import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {

        int cookies = 40;

        int portions = 10;

        int caloriesInPortion = 300;

        double caloriesinCookie = (double)caloriesInPortion / (cookies / portions)  ;

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj ilość zjedzonych ciastek");
        int eatedCookies = scan1.nextInt();

        double eatedCalories = (double)eatedCookies * caloriesinCookie;

        System.out.println("Zjadłeś " + eatedCookies + ", czyli " + eatedCalories + " kalorii.");





    }
}
