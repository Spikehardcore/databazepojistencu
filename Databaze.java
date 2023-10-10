import java.util.ArrayList;
import java.util.Scanner;

public class Databaze {
    private ArrayList<Pojisteni> zaznamy; // Seznam pojištěných záznamů.
    private Scanner sc = new Scanner(System.in); // Scanner pro načítání vstupu od uživatele.

    public Databaze() {
        zaznamy = new ArrayList<>();
    }  // Inicializace seznamu záznamů.

    // Metoda pro přidání nového pojištěného do evidence.
    public void pridejPojisteneho() {
        String jmeno = zjistiJmeno();
        String prijmeni = zjistiPrijmeni();
        int vek = zjistiVek();
        int telefonniCislo = zjistiTelefonniCislo();
        zaznamy.add(new Pojisteni(jmeno, prijmeni, vek, telefonniCislo));
        System.out.println("");
        System.out.println("Data byla uložena do evidence.");
        System.out.println();
    }

    // Metoda pro výpis všech pojištěných.
    public void vypisPojistene() {
        for (Pojisteni p : zaznamy) {
            System.out.println(p);
        }
        System.out.println();
    }

    // Metoda pro vyhledání pojištěného podle jména a příjmení.
    public void najdiPojisteneho() {
        String jmeno = zjistiJmeno();
        String prijmeni = zjistiPrijmeni();
        ArrayList<Pojisteni> nalezene = new ArrayList<>();
        for (Pojisteni p : zaznamy) {
            if (jmeno.equals(p.getJmeno()) && prijmeni.equals(p.getPrijmeni())) {
                nalezene.add(p);
            }
        }
        if (nalezene.size() > 0) {
            System.out.println("Nalezen tento záznam:");
            for (Pojisteni p : nalezene) {
                System.out.println(p);
            }
        } else {
            System.out.println("Nenalezen žádný záznam");
        }
        System.out.println();
    }

    // Metoda pro vymazání pojištěného podle jména a příjmení.
    public void vymazPojisteneho() {
        String jmeno = zjistiJmeno();
        String prijmeni = zjistiPrijmeni();
        ArrayList<Pojisteni> nalezene = new ArrayList<>();
        for (Pojisteni p : zaznamy) {
            if (jmeno.equals(p.getJmeno()) && prijmeni.equals(p.getPrijmeni())) {
                nalezene.add(p);
            }
        }
        if (nalezene.size() > 0) {
            System.out.println("Vymazán tento záznam:");
            for (Pojisteni p : nalezene) {
                System.out.println(p);
                zaznamy.remove(p);
            }
        } else {
            System.out.println("Nenalezen žádný záznam");
        }
        System.out.println();
    }

    // Metoda pro získání jména od uživatele.
    private String zjistiJmeno() {
        System.out.println("Zadejte jméno pojištěného:");
        while (true) {
            try {
                return sc.nextLine().trim();
            } catch (Exception ex) {
                System.out.println("Špatně zadané, prosím znovu!");
            }
        }
    }

    // Metoda pro získání příjmení od uživatele.
    private String zjistiPrijmeni() {
        System.out.println("Zadejte příjmení pojišt?ného:");
        while (true) {
            try {
                return sc.nextLine().trim();
            } catch (Exception ex) {
                System.out.println("Špatně zadané, prosím znovu!");
            }
        }
    }

    // Metoda pro získání věku od uživatele.
    private int zjistiVek() {
        System.out.println("Zadejte věk:");
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception ex) {
                System.out.println("Špatně zadané, prosím znovu!");
            }
        }
    }

    // Metoda pro získání telefonního čísla od uživatele.
    private int zjistiTelefonniCislo() {
        System.out.println("Zadejte telefonní číslo:");
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception ex) {
                System.out.println("Špatně zadané, prosím znovu!");
            }
        }
    }

    // Metoda pro výpis úvodní obrazovky nebo menu.
    public void vypisUvodniObrazovku() {
        System.out.println("------------------------------");
        System.out.println("     Evidence pojištěných     ");
        System.out.println("------------------------------");
        System.out.println();
    }
}

