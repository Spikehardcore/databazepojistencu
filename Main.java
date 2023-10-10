import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vytvoření instance třídy Databaze pro evidenci pojištěných.

        Databaze evidence = new Databaze();
        String volba;

        do {
            // Výpis úvodní obrazovky nebo menu pro uživatele.
            evidence.vypisUvodniObrazovku();
            System.out.println("Vyber si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Vymazat záznam");
            System.out.println("5 - Konec");
            System.out.print("Vaše volba: ");
            volba = sc.nextLine();
            System.out.println();

            switch (volba) {
                case "1":
                    // Volání metody pro přidání nového pojištěného do evidence.
                    evidence.pridejPojisteneho();
                    break;
                case "2":
                    // Volání metody pro výpis všech pojištěných.
                    evidence.vypisPojistene();
                    break;
                case "3":
                    // Volání metody pro vyhledání pojištěného.
                    evidence.najdiPojisteneho();
                    break;
                case "4":
                    // Volání metody pro vymazání pojištěného ze záznamu.
                    evidence.vymazPojisteneho();
                    break;
                case "5":
                    // Ukončení programu.
                    System.out.println("Ukončuji program...");
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        } while (!volba.equals("5"));
        // Uzavření Scanneru.
        sc.close();
    }
}

