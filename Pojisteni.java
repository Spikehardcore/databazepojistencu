public class Pojisteni {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefonniCislo;

    public Pojisteni(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public int getTelefonniCislo() {
        return telefonniCislo;
    }

    @Override
    public String toString() {
        return jmeno + "   " + prijmeni + "   " + vek + "   " + telefonniCislo;
    }
}
