import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();
        boolean continuer = true;

        System.out.println("=== Calculatrice Java ===");

        while (continuer) {
            System.out.println("\n1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            int choix = sc.nextInt();

            if (choix == 0) {
                continuer = false;
                System.out.println("Au revoir !");
                continue;
            }
            if (choix < 1 || choix > 4) {
                System.out.println("Choix invalide.");
                continue;
            }

            System.out.print("Premier nombre : ");
            double a = sc.nextDouble();
            System.out.print("Deuxième nombre : ");
            double b = sc.nextDouble();

            try {
                double resultat = 0;
                switch (choix) {
                    case 1: resultat = calc.additionner(a, b); break;
                    case 2: resultat = calc.soustraire(a, b); break;
                    case 3: resultat = calc.multiplier(a, b); break;
                    case 4: resultat = calc.diviser(a, b); break;
                }
                System.out.println("Résultat : " + resultat);
            } catch (ArithmeticException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
        sc.close();
    }
}