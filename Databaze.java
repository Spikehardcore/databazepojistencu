import java.util.ArrayList;
import java.util.Scanner;

public class Databaze {
    private ArrayList<Pojisteni> zaznamy;
    private Scanner sc = new Scanner(System.in);

    public Databaze() {
        zaznamy = new ArrayList<>();
    }

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

    public void vypisPojistene() {
        for (Pojisteni p : zaznamy) {
            System.out.println(p);
        }
        System.out.println();
    }

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

    private String zjistiJmeno() {
        System.out.println("Zadejte jméno pojištìného:");
        while (true) {
            try {
                return sc.nextLine().trim();
            } catch (Exception ex) {
                System.out.println("Špatnì zadané, prosím znovu!");
            }
        }
    }

    private String zjistiPrijmeni() {
        System.out.println("Zadejte pøíjmení pojišt?ného:");
        while (true) {
            try {
                return sc.nextLine().trim();
            } catch (Exception ex) {
                System.out.println("Špatnì zadané, prosím znovu!");
            }
        }
    }

    private int zjistiVek() {
        System.out.println("Zadejte vìk:");
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception ex) {
                System.out.println("Špatnì zadané, prosím znovu!");
            }
        }
    }

    private int zjistiTelefonniCislo() {
        System.out.println("Zadejte telefonní èíslo:");
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception ex) {
                System.out.println("Špatnì zadané, prosím znovu!");
            }
        }
    }

    public void vypisUvodniObrazovku() {
        System.out.println("------------------------------");
        System.out.println("     Evidence pojištìných     ");
        System.out.println("------------------------------");
        System.out.println();
    }
}
