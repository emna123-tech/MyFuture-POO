import java.util.Scanner;

public class tableau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creation du premier tableau
        int[] notes = {10, 15, 13, 12};

        int choix;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Afficher le premier tableau");
            System.out.println("2. Ajouter un deuxieme tableau");
            System.out.println("3. Quitter");
            System.out.print("Donner votre choix : ");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Premier tableau :");

                    for (int i = 0; i < notes.length; i++) {
                        System.out.println("La note est : " + notes[i]);
                    }
                    break;

                case 2:
                    int[] notes2 = new int[notes.length];

                    System.out.println("Saisir les valeurs du deuxieme tableau :");

                    for (int i = 0; i < notes2.length; i++) {
                        System.out.print("Donner la valeur de la case " + i + " : ");
                        notes2[i] = sc.nextInt();
                    }

                    System.out.println("Deuxieme tableau :");

                    for (int i = 0; i < notes2.length; i++) {
                        System.out.println("La note est : " + notes2[i]);
                    }
                    break;

                case 3:
                    System.out.println("Fin du programme !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 3);

        sc.close();
    }
}
