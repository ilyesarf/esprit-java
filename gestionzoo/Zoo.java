public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public String toString() {
        return "Zoo : " + name + ", ville : " + city + ", nombre de cages : " + nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < this.animals.length; i++){
            if (this.animals[i] == null){
                this.animals[i] = animal;
                return true;
            }
        }

        return false;
    }

    public void printAnimals(){
        for (int i=0; i<this.animals.length; i++){
            if (this.animals[i])
                System.out.println(this.animals[i]);
        }
    }

}
