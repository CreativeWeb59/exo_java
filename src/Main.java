import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exo1();
        // exo2();
        // exo3();
        // exo4();
        // exo5();
        // exo6();
        // exo7();
        // exo8();
        // exo9();
        // exo10();
        // exo11();
        // exo12();
        // exo13();
        // fizzBuzz();
        // plusOuMoins();
        rollerCoster();
    }

    /* demande a l'utilisateur et renvoi un string */
    public static String demande(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /* demande a l'utilisateur et renvoi un int */
    public static int demandeInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    /* demande a l'utilisateur et renvoi un double */
    public static double demandeDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    /*
    renvoi un nombre random
     */
    public static int randInt(int maximum){
        return new Random().nextInt(maximum);
    }
    /*
    renvoi un nombre random entre 2 bornes
     */
    public static int randInt(int min, int max){
        return new Random().nextInt(min, max);
    }

    /**
     * Vérifie si la chaine qu'on met en paramètre contient un entier
     * @param laChaine
     * @return
     */
    public static boolean verifSiContientEntier(String laChaine){
        return laChaine != null && laChaine.matches("[0-9]+");
        // if (laChaine.contains("0")){ return true;}

    }

    /* Ecrire un programme qui demande à l'utilisateur de saisir son nom et de lui afficher son nom avec le
        message de bienvenue.
     */
    public static void exo1(){
        System.out.println("Quel est votre nom ?");
        // lit la ligne entree par le user
        String nom = demande();
        // Affiche le texte saisi par l'utilisateur + bienvenue
        System.out.println("Bienvenue " + nom);
    }

    /* Écrivez un programme pour saisir deux nombres de l'utilisateur et calculer leur somme. L'utilisateur
    doit donc entrer deux valeurs, puis le programme calcule leur somme.
     */
    public static void exo2(){
        System.out.println("Entrez un nombre :");
        int nombre1 = demandeInt();

        System.out.println("Entrez un autre nombre :");
        int nombre2 = demandeInt();

        // message
        System.out.println(nombre1 + " + " + nombre2 + " = " + (nombre1 + nombre2));
    }

    /* Écrivez un programme qui demande à l'utilisateur de saisir le prix de fabrication et le prix de vente
        d'un produit et vérifiez le profit ou la perte.
        Si le prix de fabrication est supérieur au prix de vente, il y a perte sinon profit.
     */
    public static void exo3(){
        System.out.println("Saisissez le prix de fabrication : ");
        double prixFabrication = demandeDouble();

        System.out.println("Saississez le prix de vente :");
        double prixVente = demandeDouble();

        double difference = prixVente - prixFabrication;

        if (prixVente > prixFabrication){
            System.out.println("Profit de " + difference + "€");
        } else {
            System.out.println("Perte de " + difference + "€");
        }
    }

    /* Écrivez un programme qui demande à l'utilisateur de saisir 3 nombres puis trouver le plus grand.
     */
    public static void exo4(){
        System.out.println("Saisisez le nombre 1 : ");
        int nombre1 = demandeInt();
        System.out.println("Saisisez le nombre 2 : ");
        int nombre2 = demandeInt();
        System.out.println("Saisisez le nombre 3 : ");
        int nombre3 = demandeInt();
        int reponse;
        if (nombre1 > nombre2 && nombre1 > nombre3){
            reponse = nombre1;
        } else if (nombre2 > nombre1 && nombre2 > nombre3)  {
            reponse = nombre2;
        } else {
            reponse = nombre3;
        }
        System.out.println("[" + nombre1 + ", " + nombre2 + ", " + nombre3 + "]" + "--> " + reponse);
    }

    /* Prof
    Écrivez un programme pour un professeur flemmard.
    Vous disposez d'une liste de notes comprises entre 0 et 20
    Écrivez un commentaire pour chacune de ces copies d'élève
     */
    public static void exo5(){
        boolean continuer = true;
        String reponse = "";
        while (continuer){
            System.out.println("Saisissez une note entre 0 et 20 (-1 pour quitter) : ");
            int note = demandeInt();
            switch (note){
                case 0, 1, 2, 3, 4 : reponse = "Catastrophique, il faut tout revoir";
                break;
                case 5, 6, 7, 8, 9, 10 : reponse = "Insuffisant";
                break;
                case 11, 12, 13, 14 : reponse = "Peut mieux faire";
                break;
                case 15, 16, 17 : reponse = "Bien" ;
                break;
                case 18, 19, 20 : reponse = "Excellent, bon travail";
                break;
                case -1 : continuer = false;
                        reponse = "";
                break;
                default: reponse = "Probleme avec votre note, recommencez";
            }
            System.out.println(reponse);
        }
    }
    /* Calculatrice
    Écrivez un programme qui simulera une calculatrice et demande à l'utilisateur de saisir un premier
    opérande, un opérateur et un second opérande.
    Ce programme exécutera des opérations arithmétiques de base (addition, soustraction, multiplication
    et division selon l'opérateur saisi
     */

    public static void exo6(){
        System.out.println("Saisissez un premier opérande : ");
        double nombre1 = demandeDouble();

        System.out.println("Saisissez un opérateur (+ - / * :");
        String operateur = demande();

        System.out.println("Saisissez un second opérande : ");
        double nombre2 = demandeDouble();

        String reponse;
        /* operation */
        switch (operateur){
            case "+" : reponse = "[" + nombre1 + ", " + operateur + ", " + 3 + "] = " + (nombre1 + nombre2);
            break;
            case "-" : reponse = "[" + nombre1 + ", " + operateur + ", " + 3 + "] = " + (nombre1 - nombre2);
            break;
            case "/" : reponse = "[" + nombre1 + ", " + operateur + ", " + 3 + "] = " + (nombre1 / nombre2);
            break;
            case "*" : reponse = "[" + nombre1 + ", " + operateur + ", " + 3 + "] = " + (nombre1 * nombre2);
            default: reponse = "problème d'opérateur";
        }
        System.out.println(reponse);
    }
    /* Somme
    Écrivez un programme qui demande à l'utilisateur de saisir un nombre "N".
    Calculer la somme de tous les nombres entre 1 et N
     */
    public static void exo7(){
        System.out.println("Saisissez un nombre :");
        int nombre = demandeInt();
        String reponse = "";
        int nombrefinal = 0;

        for (int i = 1; i <= nombre ; i++) {
            if (i == 1) {
                reponse += "i";
            } else {
                reponse += " + " + i;
            }
            nombrefinal += i;
        }
        System.out.println(reponse + " = " + nombrefinal);
    }

    /* Escalier
    Écrivez un programme qui demande à un utilisateur un nombre puis qui génère un escalier d'étoiles.
     */
    public static void exo8(){
        System.out.println("Saisissez un nombre :");
        int nombre = demandeInt();
        String message = "";
        for (int i = 1; i <= nombre; i++) {
            message += "*";
            System.out.println(message);
        }
    }

    /* Drole de pyramide
        Adaptez l'exercice 8 pour faire descendre l'escalier dans l'autre sens afin de former une pyramide
     */
    public static void exo9(){
        System.out.println("Saisissez un nombre :");
        int nombre = demandeInt();
        String tabMessage[] = new String[nombre];
        String message = "";
        // je rempli mon tableau
        for (int i = 1; i <= nombre; i++) {
            message += "*";
            tabMessage[i-1] = message;
        }

        // j'affiche mon tableau dans le sens normal
        for (String element:tabMessage) {
            System.out.println(element);
        }

        // j'affiche mon tableau dans le sens inverse
        for (int i = nombre-1; i > 0 ; i--) {
            System.out.println(tabMessage[i-1]);
        }
    }

    /* une vrai pyramide
    Adaptez l'exercice 9 pour que la pyramide soit dans le bon sens (^)
     */
    public static void exo10(){
        System.out.println("Saisissez un nombre :");
        int nombre = demandeInt();
        String message = "";

        String tabMessage[] = new String[nombre]; // tableau pour stocker les étoiles
        for (int i = 1; i <= nombre; i++) {
            if (i==1){
                message += "*";
            } else {
                message += "**";
            }
            tabMessage[i-1] = message;
        }
        // reste boucle qui ajoute a mesure les espaces devant
        // rempli tableau avec les etoiles et les espaces
        String espace = " ";
        String texteAjout = "";
        for (int i = nombre-2; i >= 0 ; i--) {
            texteAjout += espace;
            tabMessage[i] = texteAjout + tabMessage[i];
        }

        for (String valeur:tabMessage) {
            System.out.println(valeur);
        }
    }

    /* exo 11 La monnaie europeenne
    Écrivez un programme qui demande à l'utilisateur de saisir un nombre décimal.
    Le programme doit renvoyer exactement le nombre de billets et de pièces qu'il faut pour obtenir ce nombre
    (ex : nombre = 2437,57€)
    Billet 500€ : 4
    Billet 200€ : 2
    Billet 20€ : 1
    Billet 10€ : 1
    Billet 5€ : 1
    Pièce 2€ : 1
    Pièce 0,50€ : 1
    Pièce 0,02€ : 1
     */

    public static void exo11(){
        System.out.println("Saisissez un montant :");
        double montant = demandeDouble();
        double reste = montant;
        // tableau contenant les pieces et billets
        double monnaies[] = new double[] {500, 200, 20, 10, 5, 2, 0.50, 0.02, 0.01};
        int nbMonnaies[] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};


        for (int i = 0; i < monnaies.length; i++) {
            if (reste / monnaies[i] > 0) {
                nbMonnaies[i] = (int) (reste/monnaies[i]);
                reste = reste - (monnaies[i] * nbMonnaies[i]);
                if (i<5){
                    System.out.println("Billets " + monnaies[i] + "€ : " + nbMonnaies[i]);
                } else {
                    System.out.println("Pièces " + monnaies[i] + "€ : " + nbMonnaies[i]);
                }
            }
        }
    }

    /* Temperature
       Vous disposez d'une liste de températures (°C).
       Parcourez cette liste et affichez la température la plus proche de 0°C.
       Si une température négative est aussi proche de 0 qu'une température positive, la valeur négative
       prend le dessus.
     */
    public static void exo12(){
        List<Double> temperatures = new ArrayList<>();
        temperatures.add(12.0);
        temperatures.add(25.0);
        temperatures.add(5.0);
        temperatures.add(7.0);
        temperatures.add(6.0);
        temperatures.add(-5.0);
        double basseTemp = 500000;

        for (int i = 0; i < temperatures.size(); i++) {
            if(temperatures.get(i) < basseTemp){
                basseTemp = temperatures.get(i);
            } else {

            }
        }
        System.out.println("La temperateure la plus proche de 0°C est " + basseTemp + "°C.");
    }

    /* Centrale de tri
    Vous disposez d'une liste de nombre.
    Triez la liste du plus petit au plus grand
    [12, 25, 5, 7, 6, -5]
     */

    public static void exo13(){
        List<Double> result = new ArrayList<>();
        List<Double> triTemp = new ArrayList<>();
        triTemp.add(12.0);
        triTemp.add(25.0);
        triTemp.add(5.0);
        triTemp.add(7.0);
        triTemp.add(6.0);
        triTemp.add(-5.0);

        while (!triTemp.isEmpty()){
            int minIndex = 0;
            double min = triTemp.get(0);
            for (int i = 0; i < triTemp.size(); i++) {
                if (triTemp.get(i) < min) {
                    minIndex = i;
                    min = triTemp.get(i);
                }
            }
            triTemp.remove(minIndex);
            result.add(min);
        }

        String message = "[";
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size()-1){
                message += result.get(i) + "]";
            } else {
                message += result.get(i) + ", ";
            }
        }
        System.out.println(message);
    }

    public static void fizzBuzz(){
        System.out.println("Saississez un nombre :");
        int n = demandeInt();
        int fizz = 3;
        int buzz = 5;
        for(int i = 1; i<=n; i++){
            if((i%fizz == 0) && (i%buzz == 0)){
                System.out.println("fizzbuzz");
            } else if (i%fizz ==0) {
                System.out.println("fizz");
            } else if (i%buzz == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void plusOuMoins() {
        int nombreInconnu = randInt(1, 100);
        int nombreEssaisMax = 10;
        int nombreEssais = 0;
        boolean continuer = true;

        while (continuer) {
            System.out.println("Donnez un nombre compris entre 1 et 100");
            String nombreJoueurString = demande();
            if (verifSiContientEntier(nombreJoueurString)) {
                int nombreJoueur = Integer.parseInt(nombreJoueurString);
                if (nombreJoueur > 0 && nombreJoueur < 101) {
                    nombreEssais++;
                    if (nombreJoueur == nombreInconnu) {
                        System.out.println("Bravo ! Vous avez trouvé le nombre en " + nombreEssais + " essai(s)");
                        continuer = false;
                    } else if (nombreJoueur > nombreInconnu) {
                        System.out.println("Votre nombre est trop grand, encore " + (nombreEssaisMax - nombreEssais) + " essai(s)");
                    } else {
                        System.out.println("Votre nombre est trop petit, encore " + (nombreEssaisMax - nombreEssais) + " essai(s)");
                    }
                } else {
                    System.out.println("Erreur! Vous devez entrer un nombre entre 1 et 100");
                }
            } else {
                System.out.println("Erreur! Vous devez entrer un nombre entre 1 et 100");
            }

            if (nombreEssais >= nombreEssaisMax) {
                System.out.println("Vous avez dépassé le nombre de " + nombreEssaisMax + " essais, Dommage ! Vous avez perdu !!!");
                continuer = false;
            }
        }
    }

    /*
    Rooler coaster
    Vous êtes ingénieur et on vous demande de calculer les profits que peut réaliser
    un Roller Coaster en une journée

    Un groupe de visiteur ne veut pas être séparé pour un tour de Roller Coaster.
    ▪ Dès qu'il n'y a plus assez de places dans le manège pour le prochain groupe, il démarre.
    ▪ Quand un groupe de visiteur a déjà fait un tour de manège, il se remet dans la file d'attente.
    ▪ Chaque visiteur qui effectue un tour de manège dépense 1€

    ▪ Le manège dispose d'un certain nombre de places assises. ("places")
    ▪ Le manège ne peut effectuer qu'un certain nombre de tours pendant une journée ("tours")
    ▪ La file d'attente est une liste de groupes de visiteurs. ("file")
    Avec les informations du contexte et les données (places, tours, file), écrivez un programme
    permettant de calculer les profits du Roller Coaster sur une journée.

    (places = 5, tours = 3, file = [2, 3, 5, 4])
     */


    public static void rollerCoster(){

    }

}
