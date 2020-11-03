package creational.abstract_factory;

import creational.factory.Computer;

/**
 * Factory design pattern provides approach to code for interface rather than implementation.
 * Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.createComputer();
    }
}
