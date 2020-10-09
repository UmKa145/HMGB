package prev;

public class Main {
    public static void main(String[] args) {
        Animal catAnimal = new Animal("Cats");
        Cat cat = new Cat("Barsik", 200, false,2);
        catAnimal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal dogAnimal = new Animal("Dogs");
        Dog dog = new Dog("sharik", 500, 10, 0.5);
        dogAnimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
    }
}
