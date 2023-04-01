public class Test {
    public static void main(String[] args) {
        System.out.println(3 << 1 & 0);
        System.out.println(0b10);
        System.out.println(0b1101 << 1);
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.toBinaryString(-11));
        System.out.println(Integer.lowestOneBit(6));
        System.out.println(Integer.bitCount(10));
        System.out.println(-1 % 4);
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
