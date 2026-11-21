public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal("GenericCreature");
        System.out.println(a1);

        Mammal m1 = new Mammal("Whale");
        System.out.println(m1);

        Cat cat1 = new Cat("Miu");
        System.out.println(cat1);
        cat1.greets();

        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");
        System.out.println(dog1);
        System.out.println(dog2);
        dog1.greets();
        dog1.greets(dog2);
    }
}
