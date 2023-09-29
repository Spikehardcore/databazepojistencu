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
        System.out.println("Data byla ulo�ena do evidence.");
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
            System.out.println("Nalezen tento z�znam:");
            for (Pojisteni p : nalezene) {
                System.out.println(p);
            }
        } else {
            System.out.println("Nenalezen ��dn� z�znam");
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
            System.out.println("Vymaz�n tento z�znam:");
            for (Pojisteni p : nalezene) {
                System.out.println(p);
                zaznamy.remove(p);
            }
        } else {
            System.out.println("Nenalezen ��dn� z�znam");
        }
        System.out.println();
    }

    private String zjistiJmeno() {
        System.out.println("Zadejte jm�no poji�t�n�ho:");
        while (true) {
            try {
                return sc.nextLine().trim();
            } catch (Exception ex) {
                System.out.println("�patn� zadan�, pros�m znovu!");
            }
        }
    }

    private String zjistiPrijmeni() {
        System.out.println("Zadejte p��jmen� poji�t?n�ho:");
        while (true) {
            try {
                return sc.nextLine().trim();
            } catch (Exception ex) {
                System.out.println("�patn� zadan�, pros�m znovu!");
            }
        }
    }

    private int zjistiVek() {
        System.out.println("Zadejte v�k:");
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception ex) {
                System.out.println("�patn� zadan�, pros�m znovu!");
            }
        }
    }

    private int zjistiTelefonniCislo() {
        System.out.println("Zadejte telefonn� ��slo:");
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception ex) {
                System.out.println("�patn� zadan�, pros�m znovu!");
            }
        }
    }

    public void vypisUvodniObrazovku() {
        System.out.println("------------------------------");
        System.out.println("     Evidence poji�t�n�ch     ");
        System.out.println("------------------------------");
        System.out.println();
    }
}
