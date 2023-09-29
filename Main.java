import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Databaze evidence = new Databaze();
        String volba;

        do {
            evidence.vypisUvodniObrazovku();
            System.out.println("Vyber si akci:");
            System.out.println("1 - Pøidat nového pojištìného");
            System.out.println("2 - Vypsat všechny pojištìné");
            System.out.println("3 - Vyhledat pojištìného");
            System.out.println("4 - Vymazat záznam");
            System.out.println("5 - Konec");
            System.out.print("Vaše volba: ");
            volba = sc.nextLine();
            System.out.println();

            switch (volba) {
                case "1":
                    evidence.pridejPojisteneho();
                    break;
                case "2":
                    evidence.vypisPojistene();
                    break;
                case "3":
                    evidence.najdiPojisteneho();
                    break;
                case "4":
                    evidence.vymazPojisteneho();
                    break;
                case "5":
                    System.out.println("Ukonèuji program...");
                    break;
                default:
                    System.out.println("Neplatná volba, stisknìte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        } while (!volba.equals("5"));

        sc.close();
    }
}
