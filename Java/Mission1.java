import java.util.Scanner;
public class Mission1{
    public static void main(String[] argd){
        Scanner aspi = new Scanner(System.in);
        System.out.print("saisir le prix hors taxe ");
        double prixHT =aspi.nextDouble();
        System.out.print("saisir le modéle de la voiture ");
        double tauxTVA =aspi.nextDouble(); //récuperer uniquement l'entier saisi
        double prixTTC = prixHT * 1 + prixHT * tauxTVA /100;
        System.out.println("pour le prix HT " + prixHT + " nous avous le prix TTC "+prixTTC);
    }
}
