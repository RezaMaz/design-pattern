package creational.factory;

/**
 * Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class.
 * Factory design pattern provides approach to code for interface rather than implementation.
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        switch (type) {
            case "pc":
                return new PC(ram, hdd, cpu);
            case "server":
                return new Server(ram, hdd, cpu);
            default:
                return null;
        }
    }

    public static Boolean validate(final Integer primeNumber) {

        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
