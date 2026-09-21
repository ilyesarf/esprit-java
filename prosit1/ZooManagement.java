import java.util.Scanner;

public class ZooManagement{
    int nbrCages = 20;
    String zooName = "my zoo";
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();
        do {
            System.out.print("Entrez le nom du zoo : ");
            zoo.zooName = scanner.nextLine().trim();

            if (zoo.zooName.isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne peut pas être vide.");
            }

        } while (zoo.zooName.isEmpty());

        do {
            System.out.print("Entrez le nombre de cages : ");

            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un entier.");
                scanner.next();
                System.out.print("Entrez le nombre de cages : ");
            }

            zoo.nbrCages = scanner.nextInt();

            if (zoo.nbrCages <= 0) {
                System.out.println("Erreur : le nombre de cages doit être positif.");
            }

        } while (zoo.nbrCages <= 0);

        System.out.println(zoo.zooName + " comportes " + zoo.nbrCages + " cages");

        scanner.close();

    }
}