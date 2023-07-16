package lab06_yinyongconsturct;

public class AnimalDemo {
    public static void main(String[] args) {
        userBuild(Animal::new);

    }
    private static void userBuild(AnimalBuilder animalBuilder){
        Animal animal = animalBuilder.build("老狗", 12);
        System.out.println(animal.toString());
    }
}
