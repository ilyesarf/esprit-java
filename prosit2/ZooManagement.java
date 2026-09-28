public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.family = "Felidae";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Belvedere";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 20;
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

        for (int i=0; i<4; i++){
            System.out.println(myZoo.animals[i]);
        }
    }
}
