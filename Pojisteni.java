public class Pojisteni {
    private String jmeno; // Jméno pojištěného.
    private String prijmeni; // Příjmení pojištěnéh.
    private int vek; // Věk pojištěného.
    private int telefonniCislo; // Telefonní číslo pojištěného.

    // Konstruktor pro inicializaci dat pojištěného.
    public Pojisteni(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    // Metoda pro získání jména pojištěného.
    public String getJmeno() {
        return jmeno;
    }

    // Metoda pro získání příjmení pojištěného.
    public String getPrijmeni() {
        return prijmeni;
    }

    // Metoda pro získání věku pojištěného.
    public int getVek() {
        return vek;
    }

    // Metoda pro získání telefonního čísla pojištěného.
    public int getTelefonniCislo() {
        return telefonniCislo;
    }

    // Přetížená metoda toString pro vytvoření textového reprezentace objektu.
    @Override
    public String toString() {
        return jmeno + "   " + prijmeni + "   " + vek + "   " + telefonniCislo;
    }
}
