import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal lion = new Animal();
        lion.family = "Felidae";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.city = "Tunis";

        do {
            System.out.print("Entrez le nom du zoo : ");
            myZoo.name = scanner.nextLine().trim();

            if (myZoo.name.isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne peut pas être vide.");
            }

        } while (myZoo.name.isEmpty());

        do {
            System.out.print("Entrez le nombre de cages : ");

            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un entier.");
                scanner.next();
                System.out.print("Entrez le nombre de cages : ");
            }

            myZoo.nbrCages = scanner.nextInt();

            if (myZoo.nbrCages <= 0) {
                System.out.println("Erreur : le nombre de cages doit être positif.");
            }

        } while (myZoo.nbrCages <= 0);

        scanner.close();

        System.out.println(myZoo.name + " comportes " + myZoo.nbrCages + " cages");

        myZoo.animals[0] = lion;

        Animal tigre = new Animal("Felidae", "Tigre", 4, true);
        Animal aigle = new Animal("Accipitridae", "Aigle", 3, false);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);

        if (!myZoo.addAnimal(tigre)){
            System.out.println("Couldnt add tigre !");
        }

        if (!myZoo.addAnimal(aigle))
            System.out.println("Couldnt add aigle");

        if (!myZoo.addAnimal(crocodile))
            System.out.println("Couldnt add crocodile");

        Zoo zoo2 = new Zoo("Friguia", "Bouficha", 25);
        zoo2.animals[0] = tigre;
        zoo2.animals[1] = aigle;
        zoo2.animals[2] = crocodile;

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(zoo2);

        myZoo.printAnimals();
        zoo2.printAnimals();

    }
}
