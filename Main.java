import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Databaze evidence = new Databaze();
        String volba;

        do {
            evidence.vypisUvodniObrazovku();
            System.out.println("Vyber si akci:");
            System.out.println("1 - P�idat nov�ho poji�t�n�ho");
            System.out.println("2 - Vypsat v�echny poji�t�n�");
            System.out.println("3 - Vyhledat poji�t�n�ho");
            System.out.println("4 - Vymazat z�znam");
            System.out.println("5 - Konec");
            System.out.print("Va�e volba: ");
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
                    System.out.println("Ukon�uji program...");
                    break;
                default:
                    System.out.println("Neplatn� volba, stiskn�te libovolnou kl�vesu a opakujte volbu.");
                    break;
            }
        } while (!volba.equals("5"));

        sc.close();
    }
}
