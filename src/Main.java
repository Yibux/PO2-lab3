import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj liczbe nieujemną: ");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try{
            n = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Nie podano liczby!");
            System.exit(1);
        }

        if(n<0){
            System.out.println("Wartosc jest mniejsza od 0!");
            System.exit(2);
        }

        Random rand = new Random();
        int random = rand.nextInt(n);
        int counter = 0;

        for(;;){
            System.out.print("Zgadnij swoja liczbe: ");
            int choice;
            try{
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Nie podano liczby!");
                scanner.nextLine();
                continue;
            }
            if(choice > random){
                System.out.println("Szukana liczba jest mniejsza!");
            }
            else if(choice < random){
                System.out.println("Szukana liczba jest wieksza!");
            }
            else{
                System.out.println("Brawo, liczba znaleziona!");
                break;
            }
            ++counter;
        }
        System.out.println("Liczba prob: " + counter);
    }
}