  import java.util.Scanner;

public class AppWeb {
    public static void main(String[] args) {

        int Cin;
        String Nom;
        String Prénom;
        int Numcompte;
        double Solde;

        final double Plafond_Retrait = 500.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le CIN :");
        Cin = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Entrez le Nom :");
        Nom = scanner.nextLine();

        System.out.println("Entrez le Prénom :");
        Prénom = scanner.nextLine();

        System.out.println("Entrez le Numcompte :");
        Numcompte = scanner.nextInt();

        System.out.println("Entrez le Solde Initial (TND) :");
        Solde = scanner.nextDouble();
    }
}


