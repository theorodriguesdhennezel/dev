import java.util.Scanner;
public class Mission2 {
    public static void main(String[]args){ 
        //déclarer les variable prix comme float car le prix peut être un nombre a virgules
        
        Scanner tva = new Scanner(System.in);
        System.out.println("Entrer la TVA");
        double TVA = tva.nextDouble();
        
        Scanner ht = new Scanner(System.in);
        System.out.println("Entrer le prix hors taxes");
        double HT= ht.nextDouble();
        System.out.println(HT *100 / TVA); //ce programe permet de multiplier le prix hors taxe par 100 et de le diviser par la valeure de la TVAs
    }
}
