package creational.abstract_factory;

import creational.factory.Computer;
import creational.factory.PC;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AbstractFactoryTests {
    @Test
    public void abstractFactory() {
        Computer computer = ComputerFactory.getComputer(new PCFactory("4", "1000", "i7"));
        Assert.assertEquals(((PC) computer).getCPU(), "i7");
    }
}
