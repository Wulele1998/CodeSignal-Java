public class Test {
    public static void main(String[] args) {
        System.out.println("Test");
        System.out.println(maxDivisor(5, 100));

        Animal animal = new Dog();
        animal.say();
    }

    public static long maxDivisor(long a, long b) {
        return a == b ? b : maxDivisor(Math.min(a, b), Math.abs(a - b));
    }
}

class Animal {
    public void say() {
        System.out.println("This is an animal");
    }
}

class Dog extends Animal {
    public void cry() {
        System.out.println("The dog is crying");
    }
    @Override
    public void say() {
        System.out.println("This is a dog");
    }
}
