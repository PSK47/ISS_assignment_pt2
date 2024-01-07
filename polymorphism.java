class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch();
        }
    }
}

